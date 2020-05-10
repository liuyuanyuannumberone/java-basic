package com.project.first;

/*
1. 对于float和long类型来说，字母后缀F和L不要丢掉。
2. 如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围。
3. 变量使用不能超过作用域的范围。
*/
public class Demo03VariableNotice {
	public static void main(String[] args) {
		int num1 = 10; // 创建了一个新的变量，名叫num1
		int num2 = 20;
		int num4; // 定义了一个变量，但是没有进行赋值
		// System.out.println(num4); // 直接使用打印输出就是错误的！
		{
			int num6 = 60;
			System.out.println(num6); // 60
		}
		// System.out.println(num6); // 已经超出了大括号的范围，超出了作用域，变量不能再使用了
		int x = 100, y = 200, z = 300;
		System.out.println(x); // 100
		System.out.println(y); // 200
		System.out.println(z); // 300
	}
}