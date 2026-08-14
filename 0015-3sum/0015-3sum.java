import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int low,high;
        for(int i=0;i<n;i++){

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            low = i+1;
            high = n-1;

            while(low<high){
                int sum = nums[i] + nums[low] +  nums[high];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--;
                }else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        
        // return new ArrayList<>(set);
        return list;
    }
}