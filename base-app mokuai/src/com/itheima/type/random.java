package com.itheima.type;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
//        循环结构生成快捷键：ctrl+alt+t
        for (int i = 0; i < 10; i++) {
            int data = r.nextInt(15);
            System.out.println(data);
        }

    }
}
