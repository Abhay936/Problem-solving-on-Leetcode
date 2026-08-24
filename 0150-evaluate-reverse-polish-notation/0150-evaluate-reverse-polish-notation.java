class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int n = tokens.length;
        for(int i=0;i<n;i++){
            if(!stk.isEmpty() && !Character.isDigit(tokens[i].charAt(0)) && tokens[i].length()<=1){
                int result = 0;
                int b = stk.pop();
                int a = stk.pop();
                if (tokens[i].equals("+")) { 
                    result = a + b;
                } 
                else if (tokens[i].equals("-")) {
                    result = a - b;
                } 
                else if (tokens[i].equals("*")) {
                    result = a * b;
                }
                else {
                    result = a / b;
                }
                stk.push(result);
            }
            else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.peek();
    }
}