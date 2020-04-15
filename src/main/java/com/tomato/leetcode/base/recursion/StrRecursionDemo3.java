package com.tomato.leetcode.base.recursion;

/**
 * Description: 以相反的顺序打印字符串。
 *
 * 双指针解法
 *
 * @author: xuanyu
 * Version: 1.0
 * Create Date Time: 2020-04-15 10:24.
 * Update Date Time:
 */
public class StrRecursionDemo3 {

    public static void main(String[] args) {
        char[]  s = new char[]{'h','e','l','l','o'};

        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }

        System.out.println(s);
    }

}
