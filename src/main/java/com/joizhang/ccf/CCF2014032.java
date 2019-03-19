package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201403-2 窗口
 *
 * @author joizhang
 */
public class CCF2014032 {

    class Window {
        int x1;
        int y1;
        int x2;
        int y2;
        int num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Window[] windows = new Window[n];
        for (int i = 0; i < n; i++) {
            windows[i].x1 = in.nextInt();
            windows[i].y1 = in.nextInt();
            windows[i].x2 = in.nextInt();
            windows[i].y2 = in.nextInt();
        }

//        int[][] clicks = new int[m][2];
//        for (int i = 0; i < m; i++) {
//            clicks[i][0] = in.nextInt();
//            clicks[i][1] = in.nextInt();
//        }
        while (m > 0) {
        	int clickX = in.nextInt();
        	int clickY = in.nextInt();
        	
        }
    }

}
