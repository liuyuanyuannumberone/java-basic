package com.project.second;

/*
ǿ������ת��
	1. �ص㣺������Ҫ��������ĸ�ʽ���������Զ���ɡ�
	2. ��ʽ����ΧС������ ��ΧС�ı����� = (��ΧС������) ԭ����Χ�������;

ע�����
	1. ǿ������ת��һ�㲻�Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ�����������
	2. byte/short/char���������Ͷ����Է�����ѧ���㣬����ӷ���+��.
	3. byte/short/char�����������������ʱ�򣬶��ᱻ����������Ϊint���ͣ�Ȼ���ټ��㡣
	4. boolean���Ͳ��ܷ�����������ת��
*/
public class Demo02DataType {
	public static void main(String[] args) {
		// ��ʽ����ΧС������ ��ΧС�ı����� = (��ΧС������) ԭ����Χ�������;
		int num = (int) 100L;
		System.out.println(num);
		// longǿ��ת����Ϊint����
		int num2 = (int) 6000000000L;
		System.out.println(num2); // 1705032704
		// double --> int��ǿ������ת��
		int num3 = (int) 3.99;
		System.out.println(num3); // 3���Ⲣ�����������룬���е�С��λ���ᱻ������
	}
}