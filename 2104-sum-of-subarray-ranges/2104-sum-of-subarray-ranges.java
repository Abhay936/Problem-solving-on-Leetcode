class Solution {
    private int[] nse(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            int ele = arr[i];
            while(!stk.isEmpty() && arr[stk.peek()]>=ele){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
    private int[] nge(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            int ele = arr[i];
            while(!stk.isEmpty() && arr[stk.peek()]<=ele){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
    private int[] psee(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for(int i=0;i<n;i++){
            int ele = arr[i];
            while(!stk.isEmpty() && arr[stk.peek()]>ele){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
    private int[] pgee(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for(int i=0;i<n;i++){
            int ele = arr[i];
            while(!stk.isEmpty() && arr[stk.peek()]<ele){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
    public long subArrayRanges(int[] nums) {
        int nse[] = nse(nums);
        int pse[] = psee(nums);
        int nge[] = nge(nums);
        int pge[] = pgee(nums);
        long max = 0;
        long min = 0;
        long diff =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int left_max = i-pge[i];
            int right_max = nge[i]-i;
            int left_min = i-pse[i];
            int right_min = nse[i]-i;

            max += (long)left_max*right_max*nums[i]; 

            min += (long)left_min*right_min*nums[i];
        }
        diff = max-min;
        return diff;
    }
}