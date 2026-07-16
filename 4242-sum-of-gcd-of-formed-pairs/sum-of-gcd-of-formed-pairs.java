class Solution {
    public long gcdSum(int[] nums) {
        int mx = 0;
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            res[i] = gcd(nums[i],mx);
        }
        Arrays.sort(res);
        int start = 0;
        int end = res.length-1;
        long sum = 0;
        while(start<end){
            sum += gcd(res[start],res[end]);
            start++;
            end--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }

        return gcd(b,a%b);
    }
}