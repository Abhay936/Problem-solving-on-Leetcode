class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        int n = pushed.length;
        int m = popped.length;

        if(n!=m) return false;

        int j=0;

        for(int i=0;i<n;i++){
            stk.push(pushed[i]);
            while(!stk.isEmpty() && j<m && stk.peek()==popped[j]){
                stk.pop();
                j++;
            }
        }

        return j==m;
    }
}