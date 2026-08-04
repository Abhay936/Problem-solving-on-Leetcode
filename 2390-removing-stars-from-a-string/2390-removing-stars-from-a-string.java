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
        String str = "";
        for(char ch : stk){
            str+=ch;
        }
        return str;
    }
}