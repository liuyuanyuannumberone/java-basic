package com.project.third;

/*
循环结构的基本组成部分，一般可以分成四部分：
 初始化语句：在循环开始最初执行，而且只做唯一一次。
*/
public class Demo09For {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println("我错啦！原谅我吧！" + i);
		}
		System.out.println("程序停止");
	}
}