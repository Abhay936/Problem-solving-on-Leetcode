import java.util.*;
class Solution {
    public int serch(int[] nums,int target,boolean findFirst){
        int low=0,high=nums.length-1,ans=-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(nums[mid]==target){
                ans = mid;
                if(findFirst){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0]=(serch(nums,target,true));
        res[1]=(serch(nums,target,false));
        
        return res;
        
    }
}