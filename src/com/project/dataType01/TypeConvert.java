package com.project.dataType01;

/*
  自动转换：将取值范围小的类型自动提升为取值范围大的类型 。

*/

/*
强制类型转换：将取值范围大的类型强制转换成取值范围小的类型
	格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
	byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算。
	浮点转成整数，直接取消小数点，可能造成数据损失精度。
	int 强制转成short 砍掉2个字节，可能造成数据丢失。
*/


/*
在给变量进行赋值的时候，如果右侧的表达式当中全都是常量，没有任何变量，
那么编译器javac将会直接将若干个常量表达式计算得到结果。
short result = 5 + 8; // 等号右边全都是常量，没有任何变量参与运算
编译之后，得到的.class字节码文件当中相当于【直接就是】：
short result = 13;
右侧的常量结果数值，没有超过左侧范围，所以正确。

这称为“编译器的常量优化”。

但是注意：一旦表达式当中有变量参与，那么就不能进行这种优化了。
*/


public class TypeConvert {
    public static void main(String[] args) {

        int c = 1;
        byte d = 2;
        // byte x = b + i; // 报错
        int j = c + d;  //int类型和byte类型运算，结果是int类型



        int force = (int)1.5;  // double类型数据强制转成int类型，直接去掉小数点。
        int num = (int) 100L;// long强制转换成为int类型
        int num3 = (int) 3.99;  // double --> int，强制类型转换
//      System.out.println(num3); // 3，这并不是四舍五入，所有的小数位都会被舍弃掉


        {
            short a = 5;
            short b = 8;
            // short + short --> int + int --> int
            // short result = a + b; // 错误写法！左侧需要是int类型

            // 右侧不用变量，而是采用常量，而且只有两个常量，没有别人
            short result = 5 + 8;
            System.out.println(result);
        }


    }
}