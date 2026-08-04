class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for(String str : operations){
            if(str.matches("-?\\d+")){
                stk.push(Integer.parseInt(str));
            }
            if(str.equals("C")){
                stk.pop();
            }
            if(str.equals("D")){
                if(!stk.isEmpty()){
                    stk.push(stk.peek()*2);
                }
            }
            if(str.equals("+")){
                if(!stk.isEmpty()){
                    int first_peek = stk.peek();
                    int poped = stk.pop();
                    int sec_peek = 0;
                    if(!stk.isEmpty())  {
                        sec_peek = stk.peek();
                    }
                    stk.push(poped);
                    stk.push(first_peek+sec_peek);
                }
                
            }
        }
        int total = 0;
        for(int st: stk){
            total += st;
        }
        return total;
    }
}