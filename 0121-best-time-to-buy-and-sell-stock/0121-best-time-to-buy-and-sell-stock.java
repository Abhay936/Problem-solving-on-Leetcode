import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_1 = Integer.MAX_VALUE;
        int idx=0;
        int max_profit = 0;
        for(int i=0;i<n;i++){
            if(min_1>prices[i]){
                min_1 = prices[i];
                idx = i;
            }else{
                max_profit = Math.max(max_profit,prices[i]-min_1);
            }
        }
        return max_profit;
    }
}