package com.project.third;

/*
break关键字的用法有常见的两种：
1. 可以用在switch语句当中，一旦执行，整个switch语句立刻结束。
2. 还可以用在循环语句当中，一旦执行，整个循环语句立刻结束。打断循环。
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