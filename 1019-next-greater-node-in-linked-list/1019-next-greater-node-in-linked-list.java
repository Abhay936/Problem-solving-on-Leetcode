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
import java.util.*;
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stk = new Stack<>(); 
        ArrayList<Integer> lis = new ArrayList<>();
        ListNode temp = head;

        while(temp!=null){
            lis.add(temp.val);
            temp=temp.next;
        }

        int k = lis.size();

        int ans[] = new int[k];

        for(int i=k-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=lis.get(i)){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = stk.peek();
            }
            stk.push(lis.get(i));
        }

        return ans;
    }
}