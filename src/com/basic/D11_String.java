package com.basic;

public class D11_String {
    public static void main(String[] args) {
        /*
        java.lang.String��
        �ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ���,���ǿ��Ա�����
        ʹ��˫����""������������,����String�Ķ���,��Ȼû��дnew,���ǵײ���Ȼ��new�Ĺ���
        */
        String s1 = new String();
        System.out.println("-" + s1 + "-");//""

        String s2 = "hello";
        String s3 = "HELLO";
        String s4 = "H";
        boolean res = s2.equals(s3); //���ִ�Сд
        boolean resA = s2.equalsIgnoreCase(s3);///��������ĸ��Сд
        boolean contains = s3.contains(s4);

        System.out.println(contains); //true
        System.out.println(res); //false
        System.out.println(resA); //true
    }
}
