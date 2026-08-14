class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int low = 0,high = n-1;
        int boat = 0;
        Arrays.sort(people);
        while(low<=high){

            int sum = people[low]+people[high];

            if(low==high && people[low]<=limit){
                boat++;
                break;
            }
            
            if(sum>limit) {
                boat++;
                high--;
            }
            else if(sum==limit){
                boat++;
                low++;
                high--;
            }
            else if(sum < limit){
                boat++;
                low++;
                high--;
            }
        }
        return boat;
    }
}