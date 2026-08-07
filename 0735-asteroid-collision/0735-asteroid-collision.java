class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            int ass = asteroids[i];
            int flag = 1;
            while(!stk.isEmpty() && (stk.peek()>0 && ass<0)){
                if(Math.abs(stk.peek())<Math.abs(ass)){
                    stk.pop();
                }else if(Math.abs(stk.peek())>Math.abs(ass)){
                    flag = 0;
                    break;
                }
                else{
                    flag = 0;
                    stk.pop();
                    break;
                }
            }
            if(flag!=0) stk.push(ass);
        }
        int m = stk.size();
        int ans[] = new int[stk.size()];
        for(int i=m-1;i>=0;i--){
            if(!stk.isEmpty()) ans[i] = stk.pop();
        }
        return ans; 
    }
}