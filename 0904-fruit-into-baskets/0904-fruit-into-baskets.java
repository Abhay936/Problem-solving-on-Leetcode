class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashSet<Integer> set = new HashSet<>();
        int high = 0,low = 0;
        int count = 0,max_count = 0,lastStart = 0;
        while(high<n){
            if(set.size()<2 || set.contains(fruits[high])){
                
                set.add(fruits[high]);
                count = high-low+1;
                max_count = Math.max(count,max_count);
            }
            else{
                low = lastStart;

                set.clear();
                set.add(fruits[high - 1]);
                set.add(fruits[high]);

                count = high - low + 1;

                max_count = Math.max(max_count, count);
            }
            if (high > 0 && fruits[high] != fruits[high - 1]) {
                    lastStart = high;
            }
            high++;
        }
        return max_count;
    }
}