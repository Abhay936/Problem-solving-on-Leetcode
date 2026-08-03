import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> a = new ArrayList<>();
        int idx = 0;
        for(int i=1;i<=n;i++){
            if (idx == target.length) break;
            if(idx<target.length && target[idx]==i){
                idx++;
                a.add("Push");
            }else if(idx<target.length && target[idx]!=i){
                a.add("Push");
                a.add("Pop");
            }
        }
        return a;
    }
}