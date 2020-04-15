package com.tomato.leetcode.base.recursion;

/**
 * Description: 以相反的顺序打印字符串。
 *
 * 递归解法
 *
 * @author: xuanyu
 * Version: 1.0
 * Create Date Time: 2020-04-15 10:24.
 * Update Date Time:
 */
public class StrRecursionDemo2 {

    public static void main(String[] args) {
        char[]  s = new char[]{'h','e','l','l','o'};
        printReverse(s);
    }

    private static void printReverse(char [] s) {
        helper(0, s.length -1 , s);
        System.out.println(s);
    }

    private static void helper(int left, int right, char[] s) {
        if (s == null || left >= right) {
            return;
        }
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        helper(left, right, s);
    }
}
