package com.project.arr05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        /*   数组动态初始化
         * int数组，数组名称arr
         *申请内存空间  元素类型是int 数组长度为6
         * */
        System.out.println(arr);//[I@58ceff1  申请到的内存空间
        System.out.println(arr[0]);//0

        int[] a = new int[]{1, 2, 3};
        int[] b = {1, 2, 3}; //数组
        System.out.println(a[2]);
        System.out.println(b[2]);
    }
}
