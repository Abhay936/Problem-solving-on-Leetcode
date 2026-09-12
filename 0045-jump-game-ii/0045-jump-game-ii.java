class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int j = 0;
        int count = 0;
        int end = 0;
        for(int i=0;i<n-1;i++){
            j = Math.max(j,i+nums[i]);
            if(i==end){
                count++;
                end=j;
            }
        }
        return count;
    }
}