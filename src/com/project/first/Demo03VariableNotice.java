package com.project.first;

/*
1. ����float��long������˵����ĸ��׺F��L��Ҫ������
2. ���ʹ��byte����short���͵ı�������ô�Ҳ������ֵ���ܳ���������͵ķ�Χ��
3. ����ʹ�ò��ܳ���������ķ�Χ��
*/
public class Demo03VariableNotice {
	public static void main(String[] args) {
		int num1 = 10; // ������һ���µı���������num1
		int num2 = 20;
		int num4; // ������һ������������û�н��и�ֵ
		// System.out.println(num4); // ֱ��ʹ�ô�ӡ������Ǵ���ģ�
		{
			int num6 = 60;
			System.out.println(num6); // 60
		}
		// System.out.println(num6); // �Ѿ������˴����ŵķ�Χ�������������򣬱���������ʹ����
		int x = 100, y = 200, z = 300;
		System.out.println(x); // 100
		System.out.println(y); // 200
		System.out.println(z); // 300
	}
}