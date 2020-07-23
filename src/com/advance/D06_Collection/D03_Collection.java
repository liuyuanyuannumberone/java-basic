package com.advance.D06_Collection;

import java.util.*;

public class D03_Collection {
  public static void main(String[] args) {
    //java���ṩ�˴����ļ����࣬��������Ķ��󡣲�ͬ�ļ�������ò�ͬ�����ݽṹ�洢����
    // �Լ���Ԫ����ɾ�Ĳ�Ч�ʲ�ͬ

    // �����ࣺ
    // ArrayList  LinkedList   �� List(�ӿ�) ������ͨ����������   �����ظ���ͬԪ��
    //                                            �� Collection���ӿڣ������м��ϣ� List��Set ���з���
    // LinkedHashSet           �� Set���ӿڣ������� ��������      ���ܴ���ͬ


    // linkedHashMap            �� Map���ӿڣ���˫�м��ϣ�

    /*
    ���������ݽṹ��
    ���飺ArrayList�����߳� Ч�ʸߣ� Vector���̰߳�ȫ Ч�ʵͣ�
    ���� LinkedList
    ��ϣ�� HashSet HashMap
    ����  TreeSet TreeMap
    ջ�� ����ȳ�
    ���У� �Ƚ��ȳ�
    * */

    //��ɾ�飨������
    Collection<String> list = new ArrayList<>();
    list.add("lyy");//���Ԫ��
    boolean flag = list.add("adf"); //����list���ϣ�������ԶΪtrue������set���ϣ�����ظ�ֵʱ������Ϊfalse

    //�����������϶�����ʹ��
    // for (int n : array) { System.out.println(n)}  ����������ͨforѭ��
    for (String str : list) {
      System.out.println(str + "one");
    }  //�������ǵ�����������������ӻ���ɾ��


    //���������� Iterator ������
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {//�Ƿ���Ԫ�ؿɵ���
      if (Objects.equals(it.next(), "lyy")) {
        it.remove();    //ֻ��ͨ������������ɾ��/���Ӽ���Ԫ�أ��������������޸��쳣
      }
      System.out.println(it.next());       //lyy  ��һ��Ԫ��
    }


    Object[] objArr = list.toArray();//[lyy, adf]     ת��Ϊ����
    list.size(); //����Ԫ�ظ���
    list.remove("lyy");//ɾ��Ԫ��
    list.contains("lyy");//�Ƿ����
    list.clear();//��ռ���
    list.isEmpty(); //�����Ƿ�Ϊ��


  }
}
