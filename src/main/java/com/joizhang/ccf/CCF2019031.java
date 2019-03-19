package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF2019031 小中大（ minmidmax ）
 *
 * @author joizhang
 */
public class CCF2019031 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print(Math.max(nums[0], nums[n - 1]) + " ");
        if (n % 2 == 0) {
            System.out.print((nums[n / 2] + nums[n / 2 - 1]) / 2 + " ");
        } else {
            System.out.print(nums[n / 2] + " ");
        }
        System.out.print(Math.min(nums[0], nums[n - 1]));

    }

}
