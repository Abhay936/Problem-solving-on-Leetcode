class Solution {
    public boolean isSubsequence(String s, String t) {
      int low = 0,high = 0;
      while(low<s.length() && high<t.length()){
        if(t.charAt(high)==s.charAt(low)){
            low++;
        }
        high++;
      }  
      return low==s.length();
    }
}