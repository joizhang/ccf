package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201709-1 打酱油
 *
 * @author joizhang
 */
public class CCF2017091 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if (n / 50 > 0) {
            sum += n / 50 * (5 + 2);
            n = n % 50;
        }
        if (n / 30 > 0) {
            sum += n / 30 * (3 + 1);
            n = n % 30;
        }
        sum += n / 10;
        System.out.println(sum);
    }

}
