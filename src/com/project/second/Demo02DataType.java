package com.project.second;

/*
强制类型转换
	1. 特点：代码需要进行特殊的格式处理，不能自动完成。
	2. 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;

注意事项：
	1. 强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出。
	2. byte/short/char这三种类型都可以发生数学运算，例如加法“+”.
	3. byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算。
	4. boolean类型不能发生数据类型转换
*/
public class Demo02DataType {
	public static void main(String[] args) {
		// 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
		int num = (int) 100L;
		System.out.println(num);
		// long强制转换成为int类型
		int num2 = (int) 6000000000L;
		System.out.println(num2); // 1705032704
		// double --> int，强制类型转换
		int num3 = (int) 3.99;
		System.out.println(num3); // 3，这并不是四舍五入，所有的小数位都会被舍弃掉
	}
}