class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int ptr = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(ptr < spaces.length && i == spaces[ptr]){
                sb.append(" "+c);
                ptr++;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}