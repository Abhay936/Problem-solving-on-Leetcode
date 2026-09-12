class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(j<i){
                return false;
            }
            j = Math.max(j,i+nums[i]);
            if(j>=n-1){
                return true;
            }
        }  
        return true; 
    }
}