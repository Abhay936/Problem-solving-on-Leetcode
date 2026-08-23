class Solution {
    private int totalDays(int[] arr,int mid){
        int n = arr.length;
        int day = 1,load = 0;
        for(int i=0;i<n;i++){
            if(arr[i]+load > mid){
                day++;
                load = arr[i];
            }else{
                load += arr[i];       
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max_1 = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(weights[i]>max_1){
                max_1 = weights[i];
            }
            sum += weights[i];
        }
        int low = max_1,high = sum;
        while(low<=high){
            int mid = low + (high - low) / 2;
            int total_day = totalDays(weights,mid);
            if(total_day <= days){    
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}