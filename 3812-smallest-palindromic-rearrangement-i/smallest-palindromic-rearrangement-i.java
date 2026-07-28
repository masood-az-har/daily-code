class Solution {
    public String smallestPalindrome(String s) {
        int [] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            freq[x-'a']++;
        }
        StringBuilder f = new StringBuilder();
        StringBuilder m = new StringBuilder();

        for(int i=0;i<freq.length;i++){
            int val = freq[i]/2;
            if(freq[i] % 2 == 1){
                char y = (char)(i+'a');
                m.append(y);
            }
            while(val != 0){
                char z = (char)(i+'a');
                f.append(z);
                val--;
            }
        }
        String second = new StringBuilder(f).reverse().toString();
        String res = f.toString()+m.toString()+second;
        return res;
    }
}