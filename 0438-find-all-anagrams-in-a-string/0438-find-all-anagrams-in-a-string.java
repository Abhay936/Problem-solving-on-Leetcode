class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        if(m>n){
            return new ArrayList<>();
        }

        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        int low = 0,high = 0;
        int freq[] = new int[26];
        for(int i=0;i<m;i++){
            char ch = p.charAt(i);
            freq[ch-'a']++;
        }
        int window_freq[] = new int[26];

        while(high<n){
            window_freq[s.charAt(high)-'a']++;
            if(high-low+1>m){
                window_freq[s.charAt(low)-'a']--;
                low++;
            }
            if(high-low+1==m){
                if(Arrays.equals(freq,window_freq)){
                    arr.add(low);
                }
            }
            high++;
        }
        return arr;
    }
}