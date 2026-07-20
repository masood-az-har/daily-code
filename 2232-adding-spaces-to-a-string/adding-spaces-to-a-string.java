class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s.length() + spaces.length);

        int ptr = 0;

        for (int i = 0; i < s.length(); i++) {

            if (ptr < spaces.length && i == spaces[ptr]) {
                sb.append(' ');
                ptr++;
            }

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}