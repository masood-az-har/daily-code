class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int ptr = nums.length;
        nums = Arrays.copyOf(nums,nums.length*2);
        for(int i=0;i<n;i++){
            int element = nums[i];
            nums[ptr] = reverse(element);
            ptr++;
        }

        int [] distinct = Arrays.stream(nums).distinct().toArray();
        return distinct.length;
        
    }

    public static int reverse(int x){
        int r = 0;
        while(x != 0){
            int rem = x % 10;
            r = r*10+rem;
            x /= 10;
        }
        return r;
    }
}