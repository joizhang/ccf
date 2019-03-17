package com.joizhang.ccf;

import java.util.Scanner;

/**
 * 201809-1 卖菜 ccf
 *
 * @author joizhang
 */
public class CCF2018091 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] priceArr1 = new int[n];
        for (int i = 0; i < n; i++) {
            priceArr1[i] = in.nextInt();
        }
        int[] priceArr2 = new int[n];
        priceArr2[0] = (priceArr1[0] + priceArr1[1]) / 2;
        priceArr2[n - 1] = (priceArr1[n - 1] + priceArr1[n - 2]) / 2;
        for (int i = 1; i < n - 1; i++) {
            priceArr2[i] = (priceArr1[i - 1] + priceArr1[i] + priceArr1[i + 1]) / 3;
        }
        for (int price : priceArr2) {
            System.out.print(price + " ");
        }
    }

}
