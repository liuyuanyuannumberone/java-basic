package com.project.processflow04;

/*

��׼��ʽ��
while (�����ж�) {
	ѭ����
}
*/

/*
break�ؼ��ֵ��÷��г��������֣�
1. ��������switch��䵱�У�һ��ִ�У�����switch������̽�����
2. ����������ѭ����䵱�У�һ��ִ�У�����ѭ��������̽��������ѭ����
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