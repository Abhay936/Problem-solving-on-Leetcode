class Solution {
    public static int bSearch(int l, int h,int[] arr,int target){
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return l;
    }
    public int searchInsert(int[] nums, int target) {
        int res = bSearch(0,nums.length-1,nums,target);
        
        return res;

        
    }
}