package com.basic;

import java.util.Random;
import java.util.Scanner;    //alt+enter ����


public class D09_Api {
    public static void main(String[] args) {
        random();
        scanner();
    }

    private static void random() {
        Random r = new Random();  //����0-10(������10)�������
        for (int i = 0; i < 30; i++) {
            System.out.println(i + ":" + r.nextInt(10));
        }
    }

    private static void scanner() {
        //��ȡ�û���������
        Scanner sc = new Scanner(System.in);
        System.out.println("���������֣�");
        System.out.println("������������ǣ�" + sc.nextInt());
    }
}