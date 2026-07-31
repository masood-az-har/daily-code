class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chars.length;){
            char x = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == x){
                count++;
                i++;
            }

            if(count == 1){
                sb.append(x);
            }else{
                sb.append(x);
                sb.append(count);
            }
        }


        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }

        return sb.length();   
    }
}