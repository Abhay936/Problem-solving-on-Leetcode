import java.util.*;
class Solution {
    public int maxDepth(String s) {
        char arr[] = s.toCharArray();
        int len  = arr.length;
        Stack<Character> stk = new Stack<>();
        int count = 0;
        int max_count = 0;
        for(int i=0;i<len;i++){
            if(arr[i]=='('){
                count++;
                stk.push(arr[i]);
            }else{
                if(arr[i]==')' && stk.peek()=='('){
                    count--;
                    stk.pop();
                }
            }
            max_count = Math.max(count,max_count);
        }
        return max_count;
    }
}