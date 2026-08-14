import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        // List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int low,high;
        for(int i=0;i<n;i++){
            low = i+1;
            high = n-1;

            while(low<high){
                int sum = nums[i] + nums[low] +  nums[high];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                }else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        
        return new ArrayList<>(set);
        // return list;
    }
}