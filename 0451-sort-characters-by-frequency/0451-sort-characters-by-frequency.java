class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char arr[] = s.toCharArray();
        for(char ch: arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return Integer.compare(b.getValue(),a.getValue());
            }
            return Character.compare(a.getKey(),b.getKey());
        });
        String str = "";
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            while (freq-- > 0) {
                str += ch;
            }
        }
        return str;
    }
}