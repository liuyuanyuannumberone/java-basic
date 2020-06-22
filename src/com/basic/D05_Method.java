package com.basic;

public class D05_Method {
    public static void main(String[] args) {
        int c = Add(1, 2);
        System.out.println(c);
    }

    //方法必须定义在类中
    //方法各自独立，不能嵌套定义
    private static int Add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b)); //1+2=3
        System.out.println(a + '+' + b + '=' + (a + b)); //110
        return a + b;
    }


}
