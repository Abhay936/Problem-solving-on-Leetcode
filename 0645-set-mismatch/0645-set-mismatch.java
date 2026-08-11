class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int ans[] = new int[2];
        int sum = 0; 

        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                ans[0] = nums[i];
                continue;
            }
            sum+=nums[i];
            set.add(nums[i]);
        }
        
        int total_sum = n*(n+1)/2;

        if(sum!=total_sum){
            ans[1] = total_sum-sum;
        }

        return ans;
    }
}