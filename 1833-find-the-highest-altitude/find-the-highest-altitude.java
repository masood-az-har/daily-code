class Solution {
    public int largestAltitude(int[] gain) {
       int r[] = new int[gain.length+1];
       int p = 0;
       int max = 0;
       r[0] = 0;
       for(int i=1;i<r.length;i++){
        r[i] = r[i-1]+gain[p];
        if(r[i] > max){
            max = r[i];
        }
        p++;
       }
        return max;
    }
}