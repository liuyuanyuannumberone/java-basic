package com.basic;

import java.util.ArrayList;

public class D04_ArrayList {
    public static void main(String[] args) {
        objectArr();
        ArrayList();
        ArrayList2();
        StuArrList();
        ArrayListFun(new ArrayList<>());
    }

    //�������飬���ȹ̶�����
    private static void objectArr() {
        D08_StandardStudent[] stu = new D08_StandardStudent[6];
        D08_StandardStudent s1 = new D08_StandardStudent();
        D08_StandardStudent s2 = new D08_StandardStudent();
        D08_StandardStudent s3 = new D08_StandardStudent();
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        for (int i = 0; i < stu.length; i++) {
            D08_StandardStudent s = stu[i];
            System.out.println(s);  //com.basic.D08_StandardStudent@7c30a502
        }
    }


    //java.util.ArrayList�� ��С�ɱ������ʵ��
    // <> �������� ��ɾ�Ĳ�
    private static void ArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");//hello ��ӵ��˼����ڲ�����ĵ�һ��Ԫ��
        list.add("java");
        String one = list.get(1);
        int len = list.size();
//        String ele = list.remove(1);
        boolean listEmpty = list.isEmpty();
//        list.clear();

        System.out.println(len);//2
//        System.out.println(ele);//java
        System.out.println(list); //[hello, java],��Ȼ���������ͣ������ڲ��Ѿ� toString()
        System.out.println(one); //java
        System.out.println(listEmpty); //false

        System.out.println("=================================");

        //����
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //ֻ�ܴ洢�������ͣ����ܴ洢�������͡�Ҫ��洢�������ͣ�<>����д�������Ͷ�Ӧ����������
    //�������������ջ����������
/*
*
*    byte        Byte
    short       Short
    int         Integer             �������
    long        Long
    char        Character           �������
    boolean     Boolean
    float       Float
    double      Double
*
* */
    private static void ArrayList2() {
        //ArrayList<int> list=new ArrayList<int>(); //error
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); //[1, 2, 3]
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            System.out.println(a);
        }
    }

    //����
    private static void StuArrList() {
        ArrayList<D08_StandardStudent> list = new ArrayList<>();
        list.add(new D08_StandardStudent());
        list.add(new D08_StandardStudent());
        list.add(new D08_StandardStudent());
        System.out.println(list); //[com.basic.D08_StandardStudent@43a25848,
        // com.basic.D08_StandardStudent@3ac3fd8b, com.basic.D08_StandardStudent@5594a1b5]
    }

    //ArrayList ���϶�����Ϊ�������������ݵ��ǵ�ֵַ
    private static void ArrayListFun(ArrayList<String> list) {
        System.out.println(list);
    }
}
