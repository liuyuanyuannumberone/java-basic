package com.basic;

//数组越界 ArrayIndexOutOfBoundsException
//空指针异常 java.lang.NullPointerException  int[] a=null;

import java.lang.reflect.Array;

public class D04_Array {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int[] a = new int[]{1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a); //[I@58ceff1 数组名称代表数组在内存空间的地址值
        System.out.println(a[0]);
        System.out.println(a.length);
        arrayErgodic();
        arrayReverse();
    }

    //数组遍历
    private static void arrayErgodic() {
        int[] array = {10, 20, 30, 40, 50};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
        }
        System.out.println(max);
    }

    //数组反转
    private static void arrayReverse() {
        int[] array = {10, 20, 30, 40, 50, 60};

        //一种写法
     /*        int start = 0, end = array.length - 1;
        int temp = 0;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }*/

        //二种写法
        for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }

//        for (int i=0;i<array.length;i++){
//        System.out.println(array[i]);
//        }
    }
}
