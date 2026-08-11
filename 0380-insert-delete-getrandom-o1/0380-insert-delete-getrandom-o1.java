class RandomizedSet {
    int arr[];
    int idx;

    public RandomizedSet() {
        arr = new int[200001];
        idx = 0;
    }
    
    public boolean insert(int val) {
        for(int i=0;i<idx;i++){
            if(arr[i]==val){
                return false;
            }
        }
        arr[idx++] = val;
        return true;
    }
    
    public boolean remove(int val) {
        int i;

        if(idx==0) return false;
        for(i=0;i<idx;i++){
            if(arr[i]==val){
                arr[i] = arr[idx - 1];
                idx--;
                return true;
            }
        }


        return false;
    }
    
    public int getRandom() {
        int rand_idx = (int)(Math.random()*idx);
        return arr[rand_idx];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */