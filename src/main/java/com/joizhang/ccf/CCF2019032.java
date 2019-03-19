package com.joizhang.ccf;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author joizhang
 */
public class CCF2019032 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] games = new String[n];
        for (int i = 0; i < n; i++) {
            games[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            String post = transferToPost(games[i]);
            int res = calculate(post);
            if (res == 24) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static String transferToPost(String game) {
        StringBuilder stringBuilder = new StringBuilder();
        Deque<Character> opStack = new ArrayDeque<>();
        for (int i = 0; i < game.length(); i++) {
            char c = game.charAt(i);
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            } else {
                if (opStack.isEmpty() || getPriority(c) > getPriority(opStack.peek())) {
                    opStack.push(game.charAt(i));
                } else {
                    while (!opStack.isEmpty() && getPriority(c) <= getPriority(opStack.peek())) {
                        stringBuilder.append(opStack.pop());
                    }
                    opStack.push(game.charAt(i));
                }
            }
        }
        while (!opStack.isEmpty()) {
            stringBuilder.append(opStack.pop());
        }
        return stringBuilder.toString();
    }

    private static int getPriority(char c) {
        if (c == 'x' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    private static int calculate(String post) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < post.length(); i++) {
            char c = post.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
                continue;
            }
            int a = stack.pop();
            int b = stack.pop();
            switch (c) {
                case '+':
                    stack.push(b + a);
                    break;
                case '-':
                    stack.push(b - a);
                    break;
                case 'x':
                    stack.push(b * a);
                    break;
                case '/':
                    stack.push(b / a);
                    break;
                default:
                    break;
            }
        }
        return stack.pop();
    }

}
