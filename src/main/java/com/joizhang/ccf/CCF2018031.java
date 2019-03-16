package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201803-1 跳一跳
 *
 * @author joizhang
 */
public class CCF2018031 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] points = s.split(" ");
        int sum = 0;
        int extra = 0;
        for (String pointStr : points) {
            int point = Integer.parseInt(pointStr);
            if (point == 1) {
                sum += point;
                extra = 0;
            } else if (point == 2) {
                sum += point + extra;
                extra += 2;
            }
        }
        System.out.println(sum);
    }

}
