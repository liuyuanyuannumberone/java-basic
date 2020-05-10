package com.project;


import java.util.Random;
import java.util.Scanner;
/*
 public class 类名{}
* */

public class RandScan {
    //main方法程序的入口处
    public static void main(String[] args) {
        //产生0-10随机整数
        Random r = new Random();
        int number = 0;
        for (int i = 0; i < 10; i++) {
            number = r.nextInt(10);
//          System.out.println(number);
        }

        //读取用户输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int m = sc.nextInt();
        System.out.println(m);
    }
}