class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0,high = n-1;
        int k = 0;
        for(int i=1;i<n;i++){
            k++;
            if(nums[i]<nums[i-1]){
                break;
            }
        }
        if(k==0){
            while(low<=high){
                int mid = (high+low)/2;
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]<target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }else{
            low = 0;
            high = k-1;
            while(low<=high){
                int mid = (high+low)/2;
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]<target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            low = k;
            high = n-1;
            while(low<=high){
                int mid = (high+low)/2;
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid]<target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}