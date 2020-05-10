package com.project;

import java.util.Random;
import java.util.Scanner;


public class TestPractice {
    public static void main(String[] args) {
        Random r = new Random();
        int number = 0;
        for (int i = 0; i < 10; i++) {
            number = r.nextInt(10);
            System.out.println(number);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("ÇëÊäÈëÊý×Ö");
        int m=sc.nextInt();
        System.out.println(m);
    }

}
