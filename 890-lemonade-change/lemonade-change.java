class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int i=0;i<bills.length;i++){
            int current = bills[i];
            if(current == 5){
                five++;
            }else if(current == 10){
                if(five == 0){
                    return false;
                }
                five--;
                ten++;
            }else if(current == 20){
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}