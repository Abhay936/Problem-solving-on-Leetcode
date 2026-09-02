class Solution {
    public int lastStoneWeight(int[] stones) {

       List<Integer> a = new ArrayList<>();
       for(int num : stones){
        a.add(num);
       }

       while(a.size()>1){
        PriorityQueue<Integer> pq = new PriorityQueue<>(2);
        for(int i=0;i<a.size();i++){
            pq.add(a.get(i));
            if(pq.size()>2){
                pq.poll();
            }
        }
        int x = pq.poll();
        int y = pq.poll();

        a.remove(Integer.valueOf(x));
        a.remove(Integer.valueOf(y));
        if(x!=y){ 
            a.add(y-x);
        }
       } 

       return a.isEmpty() ? 0 : a.get(0);
    }
}