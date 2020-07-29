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
    //Stream流  处理集合元素的接口（筛选、过滤、统计）   类似迭代器，但比迭代器强大，再结合lambda表达式，牛逼
    // 流的工作方式 ：每个操作后，这个流对象就成为垃圾，但是返回一个新流
    //流的获取方式：通过Collection集合（List和Set)获取流   Map集合获取流  数组获取流  其他
    List<String> list = new ArrayList<>();
    list.add("刘园园");
    list.add("刘爸爸");
    list.add("张三");
    filterTest(list);
    MapTest();
  }

  //Collection获取流
  public static void test() {
    List<String> list = new ArrayList<>();
    Stream<String> stream = list.stream();
  }

  //Map获取流
  public static void mapTest() {
    Map<String, String> map = new HashMap<>();
    Set<String> strkey = map.keySet();
    Stream<String> stream = strkey.stream();
  }

  //数组获取流
  public static void arrTest() {
    //引用类型的数组
    Integer[] integerArr = {1, 2, 3};
    String[] strArr = {"1", "2", "3"};
    Stream<Integer> integerStream = Stream.of(integerArr);
    Stream<String> stringStream = Stream.of(strArr);

    //基本类型的数组
    int[] arr = {1, 2, 3};
    IntStream intStream = IntStream.of(arr);

    //其他
    Stream<Integer> s1 = Stream.of(1, 2, 3, 54, 6, 7);
  }


  //forEach  ---理解匿名内部类、lambda表达式、方法引用的例子   挺好的
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
    list.stream().filter(s -> s.startsWith("刘")).forEach(System.out::println);
    System.out.println("-");
    long a = list.stream().filter(s -> s.startsWith("刘")).count();  //2
    list.stream().filter(s -> s.startsWith("刘")).limit(1).forEach(System.out::println);
    System.out.println("-");
    list.stream().filter(s -> s.startsWith("刘")).skip(1).forEach(System.out::println);
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

