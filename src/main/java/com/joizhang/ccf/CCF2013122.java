package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201312-2 ISBN号码
 *
 * @author joizhang
 */
public class CCF2013122 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int m = 1;
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '-') {
                continue;
            }
            sum += (s.charAt(i) - '0') * m;
            m++;
        }
        if (sum % 11 == s.charAt(s.length() - 1) - '0') {
            System.out.println("Right");
        } else {
            System.out.println(s.substring(0, s.length() - 1) + sum % 11);
        }
    }

}
