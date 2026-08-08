import java.util.*;
class Solution {
    private static int[] nse(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int ele = arr[i];
            while(!stk.isEmpty() && arr[stk.peek()]>=ele){
                stk.pop();
            }
                if(stk.isEmpty()){
                    ans[i] = arr.length;
                }
                else{
                    ans[i] = stk.peek();
                }
            stk.push(i);
        }
        return ans;
    }
    private static int[] psee(int[] arr){
        int ans[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<arr.length;i++){
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
    public int sumSubarrayMins(int[] arr) {
        int  n = arr.length;
        int mod =  1000000007;
        long sum = 0;
        int pse[] = psee(arr);
        int nse[] = nse(arr);
        for(int i = 0; i < n; i++) {
            int left = i-pse[i];
            int right = nse[i]-i;
            sum+=(long)right*left*arr[i];
            sum%=mod;
        }
        return (int)sum;
    }
}