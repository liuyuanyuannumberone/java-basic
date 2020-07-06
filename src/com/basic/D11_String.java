package com.basic;

public class D11_String {
    public static void main(String[] args) {
        /*
        java.lang.String类
        字符串是常量；它们的值在创建之后不能更改,它们可以被共享。
        使用双引号""引起来的内容,都是String的对象,虽然没有写new,但是底层仍然有new的过程
        */
        String s1 = new String();
        System.out.println("-" + s1 + "-");//""

        String s2 = "hello";
        String s3 = "HELLO";
        String s4 = "H";
        boolean res = s2.equals(s3); //区分大小写
        boolean resA = s2.equalsIgnoreCase(s3);///不区分字母大小写
        boolean contains = s3.contains(s4);

        System.out.println(contains); //true
        System.out.println(res); //false
        System.out.println(resA); //true
    }
}
