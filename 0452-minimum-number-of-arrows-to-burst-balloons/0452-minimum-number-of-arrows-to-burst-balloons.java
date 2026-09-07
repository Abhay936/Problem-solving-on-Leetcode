class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));//not a[0]-b[0] becoz of large value
        
        int end = points[0][1];
        int count = 1;
        

        for(int i=1;i<n;i++){
            if(points[i][0]>end){
                count++;
                end = points[i][1];
            }else{
                end = Math.min(points[i][1],end);
            }
        }

        return count;
    }
}