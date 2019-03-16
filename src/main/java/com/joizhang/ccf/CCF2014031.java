package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201403-1 相反数
 *
 * @author joizhang
 */
public class CCF2014031 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] count = new int[2001];
        for (int i = 0; i < n; i++) {
            count[1000 + in.nextInt()]++;
        }

        int res = 0;
        for (int i = 0; i < 1001; i++) {
            if (count[i] != 0 && count[count.length - 1 - i] != 0) {
                res++;
            }
        }
        System.out.println(res);
    }

}
