package com.project.third;

/*
break�ؼ��ֵ��÷��г��������֣�
1. ��������switch��䵱�У�һ��ִ�У�����switch������̽�����
2. ����������ѭ����䵱�У�һ��ִ�У�����ѭ��������̽��������ѭ����
*/
public class Demo14Break {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println("Hello" + i);
		}
	}
}