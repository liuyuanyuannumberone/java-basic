package com.project.second;

/*
�루���ң�	&&	ȫ����true������true���������false
�򣨻��ߣ�	||	����һ����true������true��ȫ����false������false
�ǣ�ȡ����	!	������true�����false��������false�����true

�롰&&������||�������ж�·Ч���������������Ѿ������жϵõ����ս������ô�ұߵĴ��뽫����ִ�У��Ӷ���ʡһ�������ܡ�

ע�����
�߼������ֻ������booleanֵ��
��������������A && ����B
�������������A && ����B && ����C
*/

public class Demo09Logic {
	public static void main(String[] args) {
		System.out.println(true && false); // false
		System.out.println(true || false); // true
		System.out.println(!true); // false


		int a = 10;
		System.out.println(3 > 4 && ++a < 100); // false
		System.out.println(a); // 10
	}
}