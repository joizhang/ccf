package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201712-2 游戏
 *
 * @author joizhang
 */
public class CCF2017122 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        // 存储小朋友的报数
        int[] nums = new int[n];

        int index = 0;
        int report = 1;
        int remain = n;
        while (remain > 1) {
            if (nums[index % n] == -1) {
                index++;
                continue;
            }
            // 求数的个位
            int s = report;
            while (s > 10) {
                s %= 10;
            }
            if (report % k == 0 || s == k) {
                nums[index % n] = -1;
                remain--;
            } else {
                nums[index % n] = report;
            }
            report++;
            index++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                System.out.println(i % n + 1);
                break;
            }
        }
    }

}
