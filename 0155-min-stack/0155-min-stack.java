import java.util.*;
class MinStack {
    int stk[],min[],min_idx,idx;
    public MinStack() {
        stk = new int[30001];
        min = new int[30001];
        min_idx=-1;
        idx=-1;
    }
    public void push(int val) {
        if(idx==-1 && min_idx==-1){
            stk[++idx]=val;
            min[++min_idx]=val;
        }
        else{
            stk[++idx] = val;
            if(val<=min[min_idx]){
                min[++min_idx]=val;
            }
        }
    }
    
    public void pop() {
        if(stk[idx]==min[min_idx]){
            idx--;
            min_idx--;
        }else{
            idx--;
        }
    }
    
    public int top() {
        return stk[idx];
    }
    
    public int getMin() {
        return min[min_idx];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */