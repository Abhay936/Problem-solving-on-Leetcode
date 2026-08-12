class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(0,1);
        // int ans[] = new int[n];
        // int sum = 1;
        // for(int i=0;i<n;i++){
        //     sum*=nums[i];
        //     if(map.containsKey(sum)){
        //         ans[i] = map.get(sum);
        //     }
        //     map.put(sum,map.getOrDefault(sum,0)+1);
        // }
        // return ans;

        int n = nums.length;
        int ans[] = new int[n];
        int zero_Count = 0;
        int prod = 1;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero_Count += 1;
            }
            else{
                prod*=nums[i];
            }
        }
        if(zero_Count==0){
            for(int i=0;i<n;i++){
                ans[i]=(int)prod/nums[i];
            }
        }else if(zero_Count==1){
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    ans[i] = 0;
                    continue;
                }
                ans[i] = prod;
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans[i] = 0;
            }
        }
        return ans;
    }
}