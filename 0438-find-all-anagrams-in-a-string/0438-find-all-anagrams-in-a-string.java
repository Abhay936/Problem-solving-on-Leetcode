class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        int low = 0;
        int high = 0;
        int window_size = m;
        List<Integer> list = new ArrayList<>();

        if (m > n) {
            return list;
        }
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        while(high<n) {
            if(high-low+1==window_size){     
                String str = s.substring(low,window_size+low);
                char arr[] = str.toCharArray();
                Arrays.sort(arr);
                if(Arrays.equals(arr,pArr)){
                    list.add(low);
                }
                low++;
            }
            high++;
        } 
        return list;
    }
}