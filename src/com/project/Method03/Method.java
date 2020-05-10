package com.project.Method03;

/*
定义一个方法:
public static void 方法名称() {
	方法体
}

方法名称的命名规则和变量一样，使用小驼峰。
方法不能定义在另一个方法的里面

*/
public class Method {

    public static void main(String[] args) {
        method(); // 调用农民的方法
    }

    // 农民伯伯
    public static void method() {
        System.out.println("调用了");
    }
}