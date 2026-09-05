class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int ans[][] = new int[n][2];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int index = 0;

        for(int i=0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(index>0 && start<=ans[index-1][1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end = Math.max(end,intervals[j][1]);
                    i = j;
                }else{
                    break;
                }
            }
            ans[index][0] = start;
            ans[index][1] = end;
            index++;
        }
        return Arrays.copyOf(ans,index);
    }
}