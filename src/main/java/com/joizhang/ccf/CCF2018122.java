package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201812-2小明放学
 *
 * @author joizhang
 */
public class CCF2018122 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int y = in.nextInt();
        int g = in.nextInt();

        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            int t = in.nextInt();
            if (k == 0) {
                sum += t;
            } else {
                // 首先将红灯(0, r) 绿灯(r, r+g) 黄灯(r+g, r+g+y)作为一个周期

                // 1. 求当前灯的状态在这个周期中走了多久了
                if (k == 1) {
                    t = r - t;
                } else if (k == 2) {
                    t = r+g+y - t;
                } else {
                    t = r + g - t;
                }

                // 2. 将(当前红绿灯已经走过的时间 + 小明之前走过的时间) % (r+g+y)
                // 就可以知道到达该红绿灯的时候当前红绿灯的状态
                int s = (t + sum) % (r + g + y);
                if (s >= 0 && s < r) {
                    sum += r - s;
                } else if (s >= r && s < r + g) {
                    continue;
                } else if (s >= r + g && s < r + g + y) {
                    sum += r + g + y - s;
                }
            }
        }
        System.out.println(sum);
    }

}
