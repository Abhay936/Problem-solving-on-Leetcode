import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            char ch1[] = strs[i].toCharArray();
            Arrays.sort(ch1);

            String key = new String(ch1);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());



    }
}