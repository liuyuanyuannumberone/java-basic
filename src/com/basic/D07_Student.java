package com.basic;


/*
 *
 * ��Ա���� �� �ֲ�����
 *  1.�����е�λ�ò�ͬ��  �����з�����    �ڷ�����
 *  2.���ڴ��е�λ�ò�ͬ  �ڶ���         ջ�ڴ�
 *  3.�������ڲ�ͬ�����Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
 *                 ���ŷ����ĵ��ö����ڣ����ŷ����ĵ�����϶���ʧ
 *  4.��ʼ��ֵ��ͬ����Ĭ��ֵ  �����ȶ��塢��ֵ�����ʹ�á�
 *  5.���÷�Χ��ͬ������ �����С�
 * */
/*
 *
 * private  ˽�� ��Ҫ�����ĳ�Ա������������, ֻ���ڱ�����ֱ��ʹ��
 *
 *   ���������    set ���ó�Ա������ֵ    set+��Ա����������ĸ��д��������һ��������ͬ�ı���������void
 *                get
 * */

public class D07_Student {
    String name;
    String gender;
    private int age; //��Ա��������Ĭ��ֵ

    public void eat() {
        System.out.println(name);
    }

    public void sleep(String who) { //�ֲ�����
        System.out.println(who);
    }

    //set ����ֵ
    public void setAge(int a) {
        if (a > 0 && a < 120) {
            age = a;
        }
    }

    //get ��ȡֵ
    public int getAge() {
        return age;
    }

}





