package com.project.arr05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        /*   ���鶯̬��ʼ��
         * int���飬��������arr
         *�����ڴ�ռ�  Ԫ��������int ���鳤��Ϊ6
         * */
        System.out.println(arr);//[I@58ceff1  ���뵽���ڴ�ռ�
        System.out.println(arr[0]);//0

        int[] a = new int[]{1, 2, 3};
        int[] b = {1, 2, 3}; //����
        System.out.println(a[2]);
        System.out.println(b[2]);
    }
}
