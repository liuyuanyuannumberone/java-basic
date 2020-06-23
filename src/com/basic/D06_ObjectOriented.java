package com.basic;

import java.util.Arrays;

public class D06_ObjectOriented {
    //面向对象是基于面向过程的编程思想
    //面向过程是强调每一个功能的步骤
    //面向对象是由对象去调用功能

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //面向对象
        String str = Arrays.toString(arr);
        System.out.println(str); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}