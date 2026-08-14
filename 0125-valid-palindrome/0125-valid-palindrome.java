class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        char sb[] = new char[n];
        int k = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb[k++] = ch;
            }
        }
        
        int low = 0,high = k-1;
        while(low<high){
            if(Character.toLowerCase(sb[low]) != Character.toLowerCase(sb[high])){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}