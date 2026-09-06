class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int arr[][] = new int[n+1][2];
        for(int i=0;i<n;i++){
            arr[i]=intervals[i];
        }
        arr[n] = newInterval;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        int index = 0;
        int ans[][] = new int[n+1][2];

        for(int i=0;i<=n;i++){
            if(index==0 || arr[i][0]>ans[index-1][1]){
                ans[index] = arr[i];
                index++;
            }else{
                ans[index-1][1] = Math.max(ans[index-1][1],arr[i][1]);
            }
        }
        return Arrays.copyOf(ans,index);
    }
}