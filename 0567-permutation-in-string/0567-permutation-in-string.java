class Solution {
    public boolean checkInclusion(String s1, String s2) {

        //optimal 

        int n = s1.length();
        int m = s2.length();
        if(m<n) return false;

        int low = 0,high = 0;
        int wind = n;
        int freq[] = new int[26];
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
        }
        int wind_freq[] = new int[26];
        while(high<m){
            wind_freq[s2.charAt(high)-'a']++;
            if(high-low+1>wind){
                wind_freq[s2.charAt(low)-'a']--;
                low++;
            }
            if(high-low+1==wind){
                if(Arrays.equals(wind_freq,freq)){
                    return true;
                }
            }
            high++;
        }
        
        return false;
    }
}