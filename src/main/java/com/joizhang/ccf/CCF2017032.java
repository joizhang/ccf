package com.joizhang.ccf;

import java.util.Scanner;

/**
 * 201703-2 学生排队 ccf
 * 
 * @author joizhang
 */
public class CCF2017032 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] students = new int[n];
		for (int i = 0; i < n; i++) {
			students[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			int p = in.nextInt();
			int q = in.nextInt();
			// 找到学生的索引位置
			int j = 0;
			for (; j < n; j++) {
				if (students[j] == p) {
					break;
				}
			}
			int direction = q / Math.abs(q);
			while (q != 0) {
				students[j] = students[j + direction];
				j += direction;
				q -= direction;
			}
			students[j] = p;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(students[i] + " ");
		}
	}

}
