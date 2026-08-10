import java.util.*;
class Solution {
    private int[] nse(int[] arr){
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = n; 
            }else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
    private int[] pse(int[] arr){
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = -1; 
            }else{
                ans[i] = stk.peek();
            }
            stk.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int pse[] = pse(heights);
        int nse[] = nse(heights);
        int max_area = 0;
        for(int i=0;i<n;i++){
            int width = nse[i]-pse[i]-1;
            max_area = Math.max(max_area,width*heights[i]);
        }
        return max_area;
    }
}