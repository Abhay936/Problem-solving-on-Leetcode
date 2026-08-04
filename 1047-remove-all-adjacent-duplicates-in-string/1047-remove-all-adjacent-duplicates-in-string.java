import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        for(char ch: arr){
            if(!stk.isEmpty() && stk.peek()==ch){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: stk){
            sb.append(ch);
        }
        return sb.toString();
    }
}