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

    //对象数组，长度固定不变
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


    //java.util.ArrayList类 大小可变的数组实现
    // <> 集合容器 增删改查
    private static void ArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");//hello 添加到了集合内部数组的第一个元素
        list.add("java");
        String one = list.get(1);
        int len = list.size();
//        String ele = list.remove(1);
        boolean listEmpty = list.isEmpty();
//        list.clear();

        System.out.println(len);//2
//        System.out.println(ele);//java
        System.out.println(list); //[hello, java],虽然是引用类型，但是内部已经 toString()
        System.out.println(one); //java
        System.out.println(listEmpty); //false

        System.out.println("=================================");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //只能存储引用类型，不能存储基本类型。要想存储基本类型，<>必须写基本类型对应的引用类型
    //其它操作都按照基本类型完成
/*
*
*    byte        Byte
    short       Short
    int         Integer             特殊记忆
    long        Long
    char        Character           特殊记忆
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

    //对象
    private static void StuArrList() {
        ArrayList<D08_StandardStudent> list = new ArrayList<>();
        list.add(new D08_StandardStudent());
        list.add(new D08_StandardStudent());
        list.add(new D08_StandardStudent());
        System.out.println(list); //[com.basic.D08_StandardStudent@43a25848,
        // com.basic.D08_StandardStudent@3ac3fd8b, com.basic.D08_StandardStudent@5594a1b5]
    }

    //ArrayList 集合对象，作为方法参数，传递的是地址值
    private static void ArrayListFun(ArrayList<String> list) {
        System.out.println(list);
    }
}
