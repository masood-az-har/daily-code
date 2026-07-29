import java.util.*;
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int arr [] = new int[num1.length()+num2.length()];
        int x = num1.length();
        int y = num2.length();

        for(int i=x-1;i>=0;i--){
            for(int j=y-1;j>=0;j--){
                int d1 = num1.charAt(i)-'0';
                int d2 = num2.charAt(j)-'0';

                int prod = d1*d2;

                int pos1 = i+j;
                int pos2 = i+j+1;

                int sum = prod+arr[pos2];

                arr[pos2] = sum % 10;
                arr[pos1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int num : arr){
            if(!(sb.length() == 0 && num == 0)){
                sb.append(num);
            }
        }

        return sb.toString();
    }
}