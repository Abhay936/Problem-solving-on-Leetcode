class Solution {
    private long isEatten(int[] arr,int h,int mid){
        int n = arr.length;
        long total = 0;
        for(int i=0;i<n;i++){
            total+=(int)Math.ceil((double)arr[i]/mid);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int max_1 = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(max_1<piles[i]) max_1 = piles[i];
        }

        int low = 1,high = max_1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            long total = isEatten(piles,h,mid);
            if(total<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;

        //TLE
        // int max_1 = Integer.MIN_VALUE;
        // for(int i = 0;i<n;i++){
        //     if(max_1<piles[i]) max_1 = piles[i];
        // }
        // for(int i=1;i<=max_1;i++){
        //     long total_hr = 0;
        //     for(int j=0;j<n;j++){
        //         total_hr += (int)Math.ceil((double)piles[j]/i);
        //     }
        //     if(total_hr<=h){
        //         return i;
        //     }
        // }
        // return -1;
    }
}