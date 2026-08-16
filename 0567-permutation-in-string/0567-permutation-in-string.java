class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();
        if(m<n) return false;

        int low = 0,high = 0;
        int wind = n;
        int freq[] = new int[26];
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
        }

        while(high<m){
            if(high-low+1==wind){
                String str = s2.substring(low,low+wind);
                int freq_str[] = new int[26];
                for(int i=0;i<str.length();i++){
                    freq_str[str.charAt(i)-'a']++;
                }
                if(Arrays.equals(freq_str,freq)){
                    return true;
                }
                low++;
            }
            high++;
        }
        return false;
    }
}