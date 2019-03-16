package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF-201812-1小明上学
 *
 * @author joizhang
 */
public class CCF2018121 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int r = in.nextInt();
        int y = in.nextInt();
        int g = in.nextInt();

        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            int t = in.nextInt();
            if (k == 0 || k == 1) {
                sum += t;
            } else if (k == 2) {
                sum += (t + r);
            }
        }
        System.out.println(sum);
    }

}
