class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = intervals[i][0];
            arr[i][1] = intervals[i][1];
            arr[i][2] = i;
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {

            int end = arr[i][1];

            for (int j = i; j < n; j++) {

                if (arr[j][0] >= end) {
                    ans[arr[i][2]] = arr[j][2];
                    break;
                }

                ans[arr[i][2]] = -1;
            }
        }

        return ans;
    }
}