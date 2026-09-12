class Solution {
    public void moveZeroes(int[] nums) {
        int low = 0, high = 1;

        while(high < nums.length) {

            if(nums[low] == 0 && nums[high] != 0) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
            }
            else if(nums[low] != 0) {
                low++;
            }

            high++;
        }
    }
}