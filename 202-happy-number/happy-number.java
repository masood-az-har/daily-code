class Solution {
    public boolean isHappy(int n) {

        while (true) {
            int r = 0;  

            while (n != 0) {
                int rem = n % 10;
                r += rem * rem;
                n /= 10;
            }

            if (r == 1) {
                return true;
            }
            if (r == 4) {
                return false;
            }

            n = r;
        }
    }
}