/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        });
        int count=0;

        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                pq.add(temp);
                temp=temp.next;
                count++;
            }
        } 

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();

            tail.next = node;
            tail = node;
            tail.next = null; 
        }

        return dummy.next;

    }
}