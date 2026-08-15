class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        if(m>n){
            return new ArrayList<>();
        }

        ArrayList<Integer> arr = new ArrayList<>();
        // HashMap<String,Integer> map = new HashMap<>();

        int low = 0,high = 0;
        int freq[] = new int[26];
        for(int i=0;i<m;i++){
            char ch = p.charAt(i);
            freq[ch-'a']++;
        }
        while(high<n){
            if(high-low+1==m){
                String str = s.substring(low,low+m);
                int freq_str[] = new int[26];
                for(int i=0;i<str.length();i++){
                    char ch = str.charAt(i);
                    freq_str[ch-'a']++;
                }
                if(Arrays.equals(freq,freq_str)){
                    arr.add(low);
                }
                low++;
            }
            high++;
        }
        return arr;
    }
}