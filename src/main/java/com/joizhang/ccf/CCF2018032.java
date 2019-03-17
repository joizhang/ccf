package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201803-2 碰撞的小球
 *
 * @author joizhang
 */
public class CCF2018032 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int L = in.nextInt();
        int t = in.nextInt();

        // 小球坐标
        int[] A = new int[n];
        // 运动方向
        int[] dirs = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
            dirs[i] = 1;
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < n; j++) {
                // 到达两端
                boolean boundary = (A[j] == L && dirs[j] == 1) || (A[j] == 0 && dirs[j] == -1);
                if (boundary) {
                    dirs[j] *= -1;
                } else {
                    for (int k = 0; k < n; k++) {
                        if (A[k] == A[j] && k != j) {
                            dirs[j] *= -1;
                            dirs[k] *= -1;
                        }
                    }
                }
                A[j] += dirs[j];
            }
        }
        for (int a : A) {
            System.out.print(a + " ");
        }
    }

}
