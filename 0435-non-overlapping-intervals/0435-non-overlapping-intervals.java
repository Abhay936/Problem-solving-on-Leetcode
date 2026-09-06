class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int ans[][] = new int[n][2];
        Arrays.sort(intervals,(a,b)->a[1]-b[1]); //aesc sort on the base of 2nd element of list
        int count = 0;
        int index = 0;

        for(int i=0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(index==0 || ans[index-1][1]<=start){
                ans[index] = intervals[i];
                index++;
            }else{
                count++;
            }
        }
        ans = null;
        return count;
    }
}