import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) { 
        /// TLE
        // int n = nums.length;
        // int max_len = 0;
        // for(int i=0;i<n;i++){
        //     int count1 = 0;
        //     int count2 = 0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]==0){
        //             count1++;
        //         }else{
        //             count2++;
        //         }
        //         if(count1==count2){
        //             max_len = Math.max(max_len,j-i+1);
        //         }
        //     }        
        // }
        // return max_len;

        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i] = -1;
            }else{
                ans[i] = 1;
            }
        }

        int prefix = 0;
        int max_len = 0;
        map.put(0,-1);
        
        for(int i=0;i<n;i++){
            prefix+=ans[i];
            
            if(map.containsKey(prefix)){
                int len = i - map.get(prefix);
                max_len = Math.max(max_len,len);
            }else{
                map.put(prefix,i);
            }
        }
        return max_len;
    }
}