package com.itheima.type;

public class while_xunhuan {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println("a");
            i++;
        }

        double h = 8848860;
        double pt = 0.1;
        int count = 0;
//        while (pt < h) {
//            pt *= 2;
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(pt);

        // 相当于：(不确定循环次数时用while)
        for ( ; pt < h; ) {
            pt *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println(pt);
    }
}
