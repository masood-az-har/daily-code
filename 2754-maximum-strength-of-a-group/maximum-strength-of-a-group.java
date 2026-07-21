import java.util.*;

class Solution {
    public long maxStrength(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int zeros = 0;

        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else if (num < 0) {
                neg.add(num);
            } else {
                zeros++;
            }
        }

        Collections.sort(neg);

        long x = 1;
        long y = 1;

        for (int num : pos) {
            y *= num;
        }

        if (neg.size() % 2 == 0) {
            for (int num : neg) {
                x *= num;
            }
        } else {
            for (int i = 0; i < neg.size() - 1; i++) {
                x *= neg.get(i);
            }
        }

        if (pos.isEmpty() && neg.isEmpty()) {
            return 0;
        }

        if (pos.isEmpty() && neg.size() == 1) {
            if (zeros > 0)
                return 0;
            return neg.get(0);
        }

        return x * y;
    }
}