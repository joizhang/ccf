package com.joizhang.ccf;

import java.util.Scanner;

/**
 * 201809-2 买菜 ccf
 *
 * @author joizhang
 */
public class CCF2018092 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = in.nextInt();
            a[i][1] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i][0] = in.nextInt();
            b[i][1] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int start = Math.max(a[i][0], b[i][0]);
            int end = Math.min(a[i][1], b[i][1]);
            sum += (end - start);
        }
        System.out.println(sum);
    }

}
