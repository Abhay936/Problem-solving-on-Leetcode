import java.util.*;
class Solution {
    public String removeDuplicateLetters(String s) {
        char arr[] = s.toCharArray(); 
        int freq[] = new int[26];
        Stack<Character>  stk = new Stack<>();
        int n = s.length();
        boolean present[] = new boolean[26];

        for(int i=0;i<n;i++){
            freq[arr[i]-'a']++;
        }

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']--;
            if(present[ch-'a']){
                continue;
            }
                while(!stk.isEmpty() && stk.peek()>ch && freq[stk.peek()-'a']>0){
                    present[stk.pop() - 'a'] = false;
                }
                stk.push(ch);
                present[ch - 'a'] = true;
            };

        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()){
            str.append(stk.pop());
        }

        return str.reverse().toString();
    }
}