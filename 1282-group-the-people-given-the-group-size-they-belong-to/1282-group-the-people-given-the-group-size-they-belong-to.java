class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int n = groupSizes.length;

        for(int i=0;i<n;i++){
            int Size = groupSizes[i];
            map.putIfAbsent(Size,new ArrayList<>());
            map.get(Size).add(i);
            if(map.get(Size).size()==Size){
                list.add(map.get(Size));
                map.put(Size,new ArrayList<>());
            }
        }
        return list;
    }
}