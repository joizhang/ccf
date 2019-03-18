package com.joizhang.ccf;

import java.util.Arrays;
import java.util.Scanner;

/**
 * CCF201712-1 最小差值
 *
 * @author joizhang
 */
public class CCF2017121 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int minDiff = nums[1] - nums[0];
        for (int i = 2; i < n; i++) {
            minDiff = Math.min(minDiff, nums[i] - nums[i - 1]);
        }
        System.out.println(minDiff);
    }

}
