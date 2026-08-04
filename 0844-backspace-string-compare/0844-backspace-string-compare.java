import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        char arr1[] =  s.toCharArray();
        char arr2[] =  t.toCharArray();
        int n = arr1.length;
        int m = arr2.length;
        for(int i=0;i<n;i++){
            if(arr1[i]=='#'){ 
                if(!stk1.isEmpty()){
                    stk1.pop();
                }
            }
            else{
                stk1.push(arr1[i]);
            }
        }
        for(int i=0;i<m;i++){
            if(arr2[i]=='#') {
                if(!stk2.isEmpty()){
                    stk2.pop();
                    }
                }
            else{
                stk2.push(arr2[i]);
            }
        }
        int count = 0;
        while(!stk1.isEmpty() && !stk2.isEmpty()){
            if(stk1.pop()!=stk2.pop()){
                return false;
            }
        }
        return stk1.isEmpty() && stk2.isEmpty();
    }
}