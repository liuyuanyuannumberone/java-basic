package com.advance.D01_Object;

public class Object {
    public static void main(String[] args) {
        // java���: JDK api
        // Object  java���е���(��������)�ĸ���    �̳еķ���


        // public String toString(){}
        Person p1 = new Person(18);
        System.out.println(p1); //com.advance.D01_Object.Person@7c30a502  Ĭ�ϵ���toString����


        //public  boolean  equals(Object obj){} �Ƚ϶����ڲ���������ֵ�Ƿ���ȫ��ͬ
        // == �ж�ֵ/�����ֵַ�Ƿ���ͬ
        Person p2 = new Person(18);

    }
}
