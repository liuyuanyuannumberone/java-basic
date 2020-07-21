package com.advance.D01_Object;

public class Object {
    public static void main(String[] args) {
        // java类库: JDK api
        // Object  java所有的类(包括数组)的父类    继承的方法


        // public String toString(){}
        Person p1 = new Person(18);
        System.out.println(p1); //com.advance.D01_Object.Person@7c30a502  默认调用toString方法


        //public  boolean  equals(Object obj){} 比较对象内部所有属性值是否完全相同
        // == 判断值/对象地址值是否相同
        Person p2 = new Person(18);

    }
}
