package com.project.second;

/*
数字和字符的对照关系表（编码表）：

ASCII码表：American Standard Code for Information Interchange，美国信息交换标准代码。
Unicode码表：也是数字和符号的对照关系，开头0-127部分和ASCII完全一样，但是从128开始包含有更多字符。

48 - '0'
65 - 'A'
97 - 'a'
*/

/*
四则运算：
加：+
减：-
乘：*
除：/
取模（取余数）：%
被除数 / 除数 = 商 ... 余数

对于一个整数的表达式来说，除法用的是整除，整数除以整数，结果仍然是整数。只看商，不看余数。
只有对于整数的除法来说，取模运算符才有余数的意义。

注意事项：
	1. 一旦运算当中有不同类型的数据，那么结果将会是数据类型范围大的那种。
*/


/*
四则运算当中的加号“+”有常见的三种用法：

1. 对于数值来说，那就是加法。
2. 对于字符char类型来说，在计算之前，char会被提升成为int，然后再计算。
char类型字符，和int类型数字，之间的对照关系表：ASCII、Unicode


3. 对于字符串String（首字母大写，并不是关键字）来说，加号代表字符串连接操作。
任何数据类型和字符串进行连接的时候，结果都会变成字符串

*/
/*
自增运算符：++
自减运算符：--

	1. 在单独使用的时候，前++和后++没有任何区别。也就是：++num;和num++;是完全一样的。
	2. 在混合的时候，有【重大区别】
		A. 如果是【前++】，那么变量【立刻马上+1】，然后拿着结果进行使用。	【先加后用】
		B. 如果是【后++】，那么首先使用变量本来的数值，【然后再让变量+1】。	【先用后加】

注意事项：
	只有变量才能使用自增、自减运算符。常量不可发生改变，所以不能用。
*/

/*
比较运算符：
大于：		>
小于：		<
大于等于：	>=
小于等于：	<=
相等：		==
不相等：	!=

注意事项：
如果进行多次判断，不能连着写。数学当中的写法，例如：1 < x < 3

*/
public class Demo05Plus {
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
		int result4= ++x1 + y1--;
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
	}
}