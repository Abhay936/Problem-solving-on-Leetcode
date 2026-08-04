import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        char arr[] = s.toCharArray();
        for(char ch : arr){
            if(ch=='*'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stk){
            sb.append(ch);
        }
        return sb.toString();
    }
}