class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(k,(a,b)->
        {
            if (!a.getValue().equals(b.getValue())) {
            return Integer.compare(a.getValue(), b.getValue());
            }
        return b.getKey().compareTo(a.getKey());
        });

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }

        List<String> res = new ArrayList<>(k);
        while(!pq.isEmpty()){
            res.add(pq.poll().getKey());
        }
        Collections.reverse(res);

        return res;
    }
}