package com.project.processflow04;

/*
switch���ʹ�õ�ע�����

1. ���case�������ֵ�������ظ���
2. switch����С���ŵ���ֻ���������������ͣ�
�����������ͣ�byte/short/char/int
�����������ͣ�String�ַ�����enumö��

3. switch����ʽ���Ժ���ǰ��˳����Եߵ�������break��仹����ʡ�ԡ�
��ƥ����һ��case�ʹ���һ��λ������ִ�У�ֱ��������break�����������Ϊֹ����
*/
public class SwitchBreak {
	public static void main(String[] args) {
		int num = 4;
		switch (num) {
			case 1:
				System.out.println("���");
				break;
			case 2:
				System.out.println("�Һ�");
				 break;
			case 3:
				System.out.println("��Һ�");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("���");
				break;
			default:
				System.out.println("���ã���Ҳ�á�");
				break;
		}
	}
}