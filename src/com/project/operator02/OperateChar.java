package com.project.operator02;

/*
����������ţ�
�ӣ�+
����-
�ˣ�*
����/
ȡģ��ȡ��������%
�����Լ� ++ --
�����������++
�Լ��������--
	1. �ڵ���ʹ�õ�ʱ��ǰ++�ͺ�++û���κ�����Ҳ���ǣ�++num;��num++;����ȫһ���ġ�
	2. �ڻ�ϵ�ʱ���С��ش�����
		A. ����ǡ�ǰ++������ô��������������+1����Ȼ�����Ž������ʹ�á�	���ȼӺ��á�
		B. ����ǡ���++������ô����ʹ�ñ�����������ֵ����Ȼ�����ñ���+1����	�����ú�ӡ�
*/


/*
�������㵱�еļӺš�+���г����������÷���

1. ������ֵ��˵���Ǿ��Ǽӷ���
2. �����ַ�char������˵���ڼ���֮ǰ��char�ᱻ������Ϊint��Ȼ���ټ��㡣
3. �����ַ����ӺŴ����ַ������Ӳ������κ��������ͺ��ַ����������ӵ�ʱ�򣬽���������ַ���

*/

/*
��ֵ�����

* */

/*
�Ƚ��������
���ڣ�		>
С�ڣ�		<
���ڵ��ڣ�	>=
С�ڵ��ڣ�	<=
��ȣ�		==
����ȣ�	!=
������ж���жϣ���������д����ѧ���е�д�������磺1 < x < 3
*/

/*
�߼������

�루���ң�	&&	ȫ����true������true���������false
�򣨻��ߣ�	||	����һ����true������true��ȫ����false������false
�ǣ�ȡ����	!	������true�����false��������false�����true

�롰&&������||�������ж�·Ч���������������Ѿ������жϵõ����ս������ô�ұߵĴ��뽫����ִ�У��Ӷ���ʡһ�������ܡ�

ע�����
�߼������ֻ������booleanֵ��
��������������A && ����B
�������������A && ����B && ����C
*/

/*
* ��Ԫ�����
* int i = (1==2 ? 100 : 200);
* */


public class OperateChar {
    public static void main(String[] args) {

        int x = 10;
        // int + double --> double + double --> double
        double result3 = x + 2.5;
        System.out.println(result3); // 12.5


        String str2 = "Java";
        // String + int --> String
        System.out.println(str2 + 20); // Java20


        int x1 = 10;
        int y1 = 20;
        int result4 = ++x1 + y1--;
        System.out.println(result3); // 31
        System.out.println(x1); // 11
        System.out.println(y1); // 19

        {
            int num1 = 10;
            int num2 = 12;
            System.out.println(num1 < num2); // true
            System.out.println(num2 >= 100); // false
            System.out.println(num2 <= 100); // true
            System.out.println(10 == 10); // true
            System.out.println(20 != 25); // true
        }
        {

            System.out.println(true && false); // false
            System.out.println(true || false); // true
            System.out.println(!true); // false


            int a = 10;
            System.out.println(3 > 4 && ++a < 100); // false
            System.out.println(a); // 10
        }


    }
}