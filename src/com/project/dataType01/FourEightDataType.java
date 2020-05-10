package com.project.dataType01;

/*

常量的分类：四类八种

1. 字符串常量：凡是用双引号引起来的部分，叫做字符串常量。例如："abc"、"Hello"、"123"
2. 整数常量：直接写上的数字，没有小数点。例如：100、200、0、-250
3. 浮点数常量：直接写上的数字，有小数点。例如：2.5、-3.14、0.0
4. 字符常量：凡是用单引号引起来的单个字符，就做字符常量。例如：'A'、'b'、'9'、'中'
5. 布尔常量：只有量中取值。true、false。
6. 空常量：null。代表没有任何数据。
*/


public class FourEightDataType {
    public static void main(String[] args) {
        // 字符串常量
        System.out.println("ABC");
        // 整数常量
        System.out.println(30);
        // 浮点数常量（小数）
        System.out.println(3.14);
        // 字符常量
        System.out.println('A');
        System.out.println('6');
        // 布尔常量
        System.out.println(true);
        System.out.println(false);
        // 空常量。空常量不能直接用来打印输出。
        //  System.out.println(null);



        byte b = 100;
        short s = 1000;
        int i = 10;
        int x = 100, y = 200, z = 300;
        int num2; // 定义了一个变量，但是没有进行赋值
        // System.out.println(num2); // 直接使用打印输出就是错误的！
        long l = 12345678900L;


        float f = 5.5F;
        double d = 8.5;

        char c = 'A';



        boolean bool = false;
        boolean boolO = true;


    }
}
