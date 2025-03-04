package org.example;

public class MyBigNumber {
    public String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();
        int rem = 0;

        int i = stn1.length() - 1;
        int j = stn2.length() - 1;

        int digit1, digit2 ;
        while (i >= 0 || j >= 0 || rem > 0) {
            if (i >= 0) {
                digit1 = stn1.charAt(i) - '0';
            }else {
                digit1 = 0;
            }
            if (j >= 0) {
                digit2 = stn2.charAt(j) - '0';
            }else {
                digit2 = 0;
            }

            int sum = digit1 + digit2 + rem;
            rem = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }
        return result.reverse().toString();
    }

}
