class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five = 0,ten = 0;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                five++;
            }
            if(bills[i]==10){
                if(five<=0){
                    return false;
                }
                five--;
                ten++;
            }
            else if(bills[i]==20){
                if(ten==0){
                    if(five<3){
                        return false;
                    }
                    five-=3;
                }
                else{
                    ten--;
                    if(five<=0){
                        return false;
                    }
                    five--;
                }
            }
        }
        return true;
    }
}