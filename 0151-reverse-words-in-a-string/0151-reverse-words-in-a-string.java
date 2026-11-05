class Solution {
    public String reverseWords(String s) {
        String arr[] = s.strip().split("\\s+");
        int n = arr.length;
        StringBuffer sb = new StringBuffer();
        for(int i=n-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}