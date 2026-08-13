class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int high,low = 0;   TLE
        // int n = numbers.length;
        // int ans[] = new int[2];
        // while(low<n){
        //     int num = numbers[low];
        //     high = low+1;
        //     while(high<n){
        //         if(numbers[high]==target-num){
        //             ans[0] = low+1;
        //             ans[1] = high+1;
        //         }
        //         high++;
        //     }
        //     low++;
        // }
        // return ans;

        
        int n = numbers.length;
        int high=n-1,low = 0;
        int ans[] = new int[2];

        while(high>low){
            int sum = numbers[high]+numbers[low];
            if(sum<target){  //kyu ki array sorted h toh greater elemnt add honge toh sum==target hoga
                low++;
            }else if(sum>target){
                high--;
            }else{
                ans[0]=low+1;
                ans[1]=high+1;
                return ans;
            }
        }
        return ans;
    }
}