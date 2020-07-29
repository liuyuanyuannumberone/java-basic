package com.net.D07_StreamFlow;

import com.basic.D18_DuoTai.Interface;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D01_Stream {
  private List<String> list;

  public static void main(String[] args) {
    //Stream��  ������Ԫ�صĽӿڣ�ɸѡ�����ˡ�ͳ�ƣ�   ���Ƶ����������ȵ�����ǿ���ٽ��lambda���ʽ��ţ��
    // ���Ĺ�����ʽ ��ÿ�����������������ͳ�Ϊ���������Ƿ���һ������
    //���Ļ�ȡ��ʽ��ͨ��Collection���ϣ�List��Set)��ȡ��   Map���ϻ�ȡ��  �����ȡ��  ����
    List<String> list = new ArrayList<>();
    list.add("��԰԰");
    list.add("���ְ�");
    list.add("����");
    filterTest(list);
    MapTest();
  }

  //Collection��ȡ��
  public static void test() {
    List<String> list = new ArrayList<>();
    Stream<String> stream = list.stream();
  }

  //Map��ȡ��
  public static void mapTest() {
    Map<String, String> map = new HashMap<>();
    Set<String> strkey = map.keySet();
    Stream<String> stream = strkey.stream();
  }

  //�����ȡ��
  public static void arrTest() {
    //�������͵�����
    Integer[] integerArr = {1, 2, 3};
    String[] strArr = {"1", "2", "3"};
    Stream<Integer> integerStream = Stream.of(integerArr);
    Stream<String> stringStream = Stream.of(strArr);

    //�������͵�����
    int[] arr = {1, 2, 3};
    IntStream intStream = IntStream.of(arr);

    //����
    Stream<Integer> s1 = Stream.of(1, 2, 3, 54, 6, 7);
  }


  //forEach  ---��������ڲ��ࡢlambda���ʽ���������õ�����   ͦ�õ�
  public static void forEachTest(List<String> list) {

    list.stream().forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
//        System.out.println(s);
      }
    });

    list.stream().forEach((String s) -> {
//      System.out.println(s);
    });

    list.stream().forEach(System.out::println);
  }
  //filter---count--limit--skip
  public static void filterTest(List<String> list) {
    list.stream().filter(new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return false;
      }
    });
    list.stream().filter(s -> s.startsWith("��")).forEach(System.out::println);
    System.out.println("-");
    long a = list.stream().filter(s -> s.startsWith("��")).count();  //2
    list.stream().filter(s -> s.startsWith("��")).limit(1).forEach(System.out::println);
    System.out.println("-");
    list.stream().filter(s -> s.startsWith("��")).skip(1).forEach(System.out::println);
    System.out.println("-");

  }
   //map
  public static void MapTest() {
    List<String> list = new ArrayList<>();
    list.add("18");
    list.add("28");
    list.add("8");
    list.add("78");
    list.stream().map(new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return null;
      }
    });
    list.stream().map((String s) -> {
      return Integer.valueOf(s);
    }).forEach(s -> System.out.println(s + 1));
  }
}

