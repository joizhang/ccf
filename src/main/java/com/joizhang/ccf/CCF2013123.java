package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201312-3 最大的矩形
 *
 * @author joizhang
 */
public class CCF2013123 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int i = nums.length / 2;
        int j = i + 1;
        int maxArea = 0;
        while (i >= 0 || j <= nums.length - 1) {
            int area = Math.min(nums[i], nums[j]) * (j - i + 1);
            if (area > maxArea) {
                maxArea = area;
            }
            if (nums[i] < nums[j]) {
                i--;
            } else {
                j++;
            }
        }
        System.out.println(maxArea);
    }

}
