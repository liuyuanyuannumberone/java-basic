package com.basic;

public class D12_StaticKey {
    /*

 ����: ��static���ε�����,����������ж�����ʹ��,��������,�;���Ķ����޹�,���ڴ���Ψһֻ��һ�ݡ�
           ���γ�Ա����(�����) ��������Ͷ����޹�
                   ������.��̬��Ա������     ---������ʹ��
                   ������.��̬��Ա������     ---����ʹ��
           ���γ�Ա����(�෽��) ��������Ͷ����޹�
                    ������.��̬��Ա������(...)     ---������ʹ��
                    ������.��̬��Ա������(...)     ---����ʹ��
     * */

    public static void main(String[] args) {
        D08_StandardStudent stu = new D08_StandardStudent();

        System.out.println(stu); //com.basic.D08_StandardStudent@7c30a502

        System.out.println(D08_StandardStudent.room);//841-401
        System.out.println(D08_StandardStudent.printRoom());//841-401
    }
}
