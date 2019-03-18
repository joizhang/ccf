package com.joizhang.ccf;

import java.util.ArrayDeque;
import java.util.Deque;
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
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            int h = (i == 0 || i == n) ? 0 : heights[i];
            if (stack.isEmpty() || h >= heights[stack.peek()]) {
                stack.push(i);
            } else {
                int top = stack.pop();
                int curArea = heights[top] * (stack.isEmpty() ? i : i - 1 - stack.peek());
                maxArea = Math.max(maxArea, curArea);
                i--;
            }
        }
        System.out.println(maxArea);
    }

}
