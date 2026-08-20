class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int k = 0;
        int min_1 = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                k=i;
                break;
            } 
        }
        if(k==0){
            min_1 = nums[0];
        }
        else{
            for(int i=k;i<n;i++){
                if(min_1>nums[i]){
                    min_1 = nums[i];
                }
            }
        }
        
        return min_1;
    }
}