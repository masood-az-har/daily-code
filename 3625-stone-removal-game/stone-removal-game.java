class Solution {
    public boolean canAliceWin(int n) {
       int take = 10;
       boolean win = true;
       while(n >= take && take > 0){
         n -= take;
         take--;

         win = !win;
       }
       return !win;
    }
}