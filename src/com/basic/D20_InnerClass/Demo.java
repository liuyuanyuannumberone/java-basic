package com.basic.D20_InnerClass;

public class Demo {
    public static void main(String[] args) {
        /*
        *   �ⲿ������ڲ��࣬�����ڲ���Ķ���
           �ڲ���ֱ�ӷ����ⲿ��
        * */
        Person p = new Person();
        Person.Heart h = new Person().new Heart();

        // �����ڲ���     BirdImp b = new BirdImp();  b.fly();
        // ����������ù��췽�� ���ڲ�����һ���ӿڵ�ʵ���࣬���ǿ��������൱��new һ��ʵ����
        // ��̬ Bird b=new BirdImp();  b.fly();
        //���ã���������ʵ������󣬲���ʹ�ö�̬
        Bird b = new Bird() {
            @Override
            public void fly() {
                System.out.println("��");
            }
        };
        b.fly();
    }
}
