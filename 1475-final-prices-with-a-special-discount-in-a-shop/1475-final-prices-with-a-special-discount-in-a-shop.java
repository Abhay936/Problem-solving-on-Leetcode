class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stk = new Stack<>();
        int n = prices.length;
        int ans[] = new int[n];
        for(int i=n-1;i>=0;i--){
            int p = prices[i];
            while(!stk.isEmpty()  && p<stk.peek()){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = p;
            }else{
                ans[i] = p-stk.peek();
            }
            stk.push(p);
        }
        return ans;
    }
}