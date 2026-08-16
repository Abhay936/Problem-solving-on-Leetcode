class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //sorting method
     int n = s1.length();
     int m = s2.length();
     if(m<n) return false;
     char ch1[] = s1.toCharArray();
     Arrays.sort(ch1);   
     int low = 0,high = 0;
     int wind = n;
     while(high<m){
        if(high-low+1==wind){
            String str = s2.substring(low,low+wind);
            char ch2[] = str.toCharArray();
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                return true;
            }
            low++;
        }
        high++;
     }
     return false;
    }
}