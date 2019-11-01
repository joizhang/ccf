package com.joizhang.ccf;

import java.util.Scanner;

/**
 * @author joizhang
 */
public class CCF2016122 {

    private static double[] rate = {0, 0.03, 0.1, 0.2, 0.25, 0.3, 0.35, 0.45};
    private static int[] v = {3500, 1500, 3000, 4500, 26000, 20000, 25000};
    private static int[] u = {3500, 1500, 3000, 4500, 26000, 20000, 25000};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t <= 3500) {
            System.out.println(t);
            return;
        }

    }

    private static void cpt() {
        for (int i = 1; i < 7; i++) {
            u[i] += u[i - 1];
            v[i] = v[i - 1] + (int) (v[i] * (1 - rate[i]));
        }
    }

}
