package com.itheima.type;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class deadFor_sixunhuan {
    public static void main(String[] args) {
//        for (int i = 0; ; i++) {
//            System.out.println("a");
//        }
        // 相当于
//        for ( ; ; ) {
//            System.out.println("a");
//        }
//        while (true) {
//            System.out.println("b");
//        }
//        do {
//            System.out.println("s");
//        }while(true);

//        案例：
        System.out.println("--------------------------------");
        int okpassword = 520;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入:");
            int password = sc.nextInt();
            if(password == okpassword) {
                System.out.println("登陆成功！");
                break;
            }else {
                System.out.println("密码错误！");
            }
        }
    }
}
