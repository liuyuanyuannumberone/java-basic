package com.basic.D13_extend;

public class D03_Son extends D02_Parent {
    //������Լ̳и���ĳ���private�͹��췽�����������
    String name = "lyy";

    public void show() {
        String name = "yy";
        System.out.println(name);//yy �����ڲ����ʱ����ͽ�ԭ��
        System.out.println(this.name); //lyy
        System.out.println(super.name); //liuyuanyuan  ����ĳ�Ա�������������û�У�����������
    }
}
