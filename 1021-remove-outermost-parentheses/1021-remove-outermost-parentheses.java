class Solution {
    public String removeOuterParentheses(String s) {
        String final_str = "";
        char arr[] = s.toCharArray();
        int depth = 0;
        for(char ch: arr){
            if(ch=='('){
                if(depth>0){
                    final_str+=ch;
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    final_str+=ch;
                }
            }
        }
        return final_str;
    }
}