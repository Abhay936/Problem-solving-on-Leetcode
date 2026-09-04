class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> map = new TreeMap<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        List<String> lis = new ArrayList<>();
        list.sort((a, b) -> b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            lis.add(list.get(i).getKey());
        }
        return lis;
    }
}