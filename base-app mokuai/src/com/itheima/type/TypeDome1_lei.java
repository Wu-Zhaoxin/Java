package com.itheima.type;

public class TypeDome1_lei {
    public static void main(String[] args) {
        // 自动类型转换原理 范围小的变量可以直接复制给类型范围大的变量：byte<short<int<long<float<double char:2字节
        byte a = 12;  // byte类型占1字节（8位00001100）
        int b = a;  //int类型占4字节（32位0*32）8位赋给32位后 剩余空位用0填补
        System.out.println(a);
        System.out.println(b);

        int age = 23;
        double db = age;
        System.out.println(db);

        char ch = 'a'; // 00000000 01100001 a的二进制编码为97
        int code = ch;
        System.out.println(code);
    }
}
