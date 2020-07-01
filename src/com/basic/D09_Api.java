package com.basic;

import java.util.Random;
import java.util.Scanner;    //alt+enter 导包


public class D09_Api {
    public static void main(String[] args) {
        random();
        scanner();
    }

    private static void random() {
        Random r = new Random();  //产生0-10(不包含10)随机整数
        for (int i = 0; i < 30; i++) {
            System.out.println(i + ":" + r.nextInt(10));
        }
    }

    private static void scanner() {
        //读取用户输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        System.out.println("您输入的数字是：" + sc.nextInt());
    }
}