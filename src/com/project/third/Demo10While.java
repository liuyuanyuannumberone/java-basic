package com.project.third;

/*

��׼��ʽ��
while (�����ж�) {
	ѭ����
}
*/
public class Demo10While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        int k = 1;
        System.out.println("a");
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}