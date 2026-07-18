class Solution {
    public int findGCD(int[] nums) {
        int a = Arrays.stream(nums).max().getAsInt();
        int b = Arrays.stream(nums).min().getAsInt();
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
       return a;    
    }
}