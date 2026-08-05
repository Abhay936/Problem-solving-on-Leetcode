class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[n];
        int k = n-1;
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && temperatures[i]>=temperatures[stk.peek()]){
                stk.pop();
            }
            
            if(stk.isEmpty()){
                arr[k] = 0;
            }
            else{
                arr[k] = (stk.peek()-i);
            }
            k--;
            stk.push(i);
        } 
        return arr;
    }
}