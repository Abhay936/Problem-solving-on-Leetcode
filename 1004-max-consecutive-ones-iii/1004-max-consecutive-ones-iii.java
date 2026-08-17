class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max_len=0;
        int low = 0,high = 0;
        int count0 = 0;

        while(high<n){
            if(nums[high]==0){
                count0++;   
            }

            if(count0>k){
                while(count0>k){
                    if(nums[low]==0){
                        count0--;
                    }
                    low++;
                }
            }

            int len = high-low+1;
            max_len = Math.max(max_len,len);
            high++;
        }

        return max_len;
    }
}