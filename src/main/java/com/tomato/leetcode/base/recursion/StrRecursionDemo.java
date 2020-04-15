package com.tomato.leetcode.base.recursion;

/**
 * Description: 以相反的顺序打印字符串。
 *
 * @author: xuanyu
 * Version: 1.0
 * Create Date Time: 2020-04-15 10:24.
 * Update Date Time:
 */
public class StrRecursionDemo {

    public static void main(String[] args) {
        String testStr = "abcdefg";
        printReverse(testStr.toCharArray());
    }

    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int i, char[] str) {
        if (str == null || i >= str.length) {
            return;
        }
        // 递归调用
        helper(i+1, str);
        System.out.print(str[i]);
    }
}
