package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF CSP 201703-1 分蛋糕
 *
 * @author joizhang
 */
public class CCF2017031 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
        }

        int i = 0;
        int sum = 0;
        int curWeight = 0;
        while (i < n) {
            curWeight += weights[i];
            if (curWeight >= k) {
                sum++;
                curWeight = 0;
            }
            i++;
        }
        if (curWeight != 0) {
            sum++;
        }
        System.out.println(sum);
    }

}
