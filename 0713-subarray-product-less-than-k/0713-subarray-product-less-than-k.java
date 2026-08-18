class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n = nums.length;
        int low = 0,high = 0;
        int prod = 1;
        int count = 0;
        while(high<n){
            prod*= nums[high];
            while(prod>=k){
                prod = prod/nums[low++];
            }
            count += high-low+1;
            high++;
        }
        return count;
    }
}