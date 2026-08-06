import java.util.*;
class Solution {
    public static int next_greater(int k,int[] nums2){
        int n = nums2.length;
        int ans = -1;
        for(int i=0;i<n;i++){
            if(nums2[i]==k){
                int idx = i+1; 
                while(idx<n){
                    if(k < nums2[idx]){
                        ans = nums2[idx];
                        return ans;
                    }
                    idx++;
                }
                // return ans;
            }
        }

        return ans;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = next_greater(nums1[i],nums2);
        }
        return ans;
    }
}