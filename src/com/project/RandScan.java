package com.project;


import java.util.Random;
import java.util.Scanner;
/*
 public class ����{}
* */

public class RandScan {
    //main�����������ڴ�
    public static void main(String[] args) {
        //����0-10�������
        Random r = new Random();
        int number = 0;
        for (int i = 0; i < 10; i++) {
            number = r.nextInt(10);
//          System.out.println(number);
        }

        //��ȡ�û���������
        Scanner sc = new Scanner(System.in);
        System.out.println("����������");
        int m = sc.nextInt();
        System.out.println(m);
    }
}