package com.joizhang.ccf;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 201612-1 中间数 ccf
 * 
 * @author joizhang
 */
public class CCF2016121 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		int mid = n / 2;
		// 求大于它的整数数量
		int moreCount = 0;
		int i = mid;
		while (nums[i + 1] == nums[mid]) {
			i++;
		}
		moreCount = n - i - 1;
		// 求小于它的整数数量
		int lessCount = 0;
		i = mid;
		while (nums[i - 1] == nums[mid]) {
			i--;
		}
		lessCount = i;
		if (lessCount == moreCount) {
			System.out.println(nums[mid]);
		} else {
			System.out.println(-1);
		}
	}

}
