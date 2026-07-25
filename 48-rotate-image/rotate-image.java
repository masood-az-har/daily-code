import java.util.Arrays;

class Solution {
    public void rotate(int[][] arr) {
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int t = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = t;
        }
     }

        for(int i=0;i<arr.length;i++){
            arr[i] = reverse(arr[i]);
        }   
    }
    public static int[] reverse(int arr[]){
        int l = 0;
        int r = arr.length-1;

        while(l < r){
            int x = arr[l];
            arr[l] = arr[r];
            arr[r] = x;

            l++;
            r--;
        }
        return arr;
    } 
}
