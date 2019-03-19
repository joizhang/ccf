package com.joizhang.ccf;

import java.util.Scanner;

/**
 * CCF201312-1 出现次数最多的数
 *
 * @author joizhang
 */
public class CCF2013121 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] count = new int[10001];
        for (int i = 0; i < n; i++) {
            count[in.nextByte()]++;
        }

        int maxCount = -1;
        int result = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = i;
            }
        }

        System.out.println(result);
    }

}
