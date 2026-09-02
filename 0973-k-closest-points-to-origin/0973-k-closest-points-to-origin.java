class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            double sum = 0;
            sum=Math.pow(points[i][0],2)+Math.pow(points[i][1],2);
            pq.add(Math.sqrt(sum));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[][] = new int[k][2];
        for(int i=0;i<n;i++){
            double sum;
            sum = Math.pow(points[i][0],2)+Math.pow(points[i][1],2);
            if(pq.contains(Math.sqrt(sum))){
                res[--k][0] = points[i][0];
                res[k][1] = points[i][1];
            }
        }
        return res;
    }
}