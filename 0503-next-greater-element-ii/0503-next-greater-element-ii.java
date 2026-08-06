class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[n];
        for(int i=(n-1)*2;i>=0;i--){
            int idx = i%(n);
            int num = nums[idx];

            while(!stk.isEmpty() && num>=stk.peek()){
                stk.pop(); 
            }

            if(stk.isEmpty()){
                ans[idx] = -1;
            }
            else{
                ans[idx] = stk.peek();
            }

            stk.push(num);
        }

        return ans;
    }
}