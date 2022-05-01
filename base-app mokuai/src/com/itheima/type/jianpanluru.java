package com.itheima.type;

import java.util.Scanner;

public class jianpanluru {
    public static void main(String[] args) {
        // 键盘录入
        // 得到一个扫描器对象：
        Scanner sc = new Scanner(System.in);
        // 调用sc对象功能，接收数据
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("您的姓名是：" + name);
    }
}
