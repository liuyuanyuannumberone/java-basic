package com.project.processflow04;

/*

标准格式：
while (条件判断) {
	循环体
}
*/

/*
break关键字的用法有常见的两种：
1. 可以用在switch语句当中，一旦执行，整个switch语句立刻结束。
2. 还可以用在循环语句当中，一旦执行，整个循环语句立刻结束。打断循环。
*/


public class WhileBreak {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        System.out.println("end");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
        System.out.println("break");
        for (int m = 1; m <= 10; m++) {
            if (m == 4) {
                break;
//              continue;
            }
            System.out.println(m);
        }

    }
}