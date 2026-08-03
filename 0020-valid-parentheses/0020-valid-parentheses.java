import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{'){
                stk.push(arr[i]);
            }
            else{

                if(stk.isEmpty()) return false;

                if(arr[i]==')' && stk.peek()=='('){
                    stk.pop();
                }
                else if(arr[i]==']' && stk.peek()=='['){
                    stk.pop();
                }
                else if(arr[i]=='}' && stk.peek()=='{'){
                    stk.pop();
                }
                else{
                    return false;
                }
            } 
        }
        return stk.isEmpty();
    }
}