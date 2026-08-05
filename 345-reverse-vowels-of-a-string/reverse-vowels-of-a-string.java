class Solution {
    public String reverseVowels(String s) {

        char [] arr = s.toCharArray();
        int last = s.length()-1;
        for(int start = 0;start<s.length();start++){
            if(isVowel(arr[start])){
                while(last >= start){
                    if(isVowel(arr[last])){
                        char temp = arr[last];
                        arr[last] = arr[start];
                        arr[start] = temp;
                        last--;
                        break;
                    }else{
                        last--;
                    }
                }
            }
        }

        return new String(arr);
    }

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}