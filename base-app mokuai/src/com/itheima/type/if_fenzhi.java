package com.itheima.type;

public class if_fenzhi {
    public static void main(String[] args) {
        int a = 10;
        if (a > 100 || a <60 ){
            System.out.println("不在范围内");
        }else {
            System.out.println("在范围内");
        }

        if (a >= 100){
            System.out.println("a");
        }else if(60 <= a  && a < 100){
            System.out.println("b");
        }
        else {
            System.out.println("c");
        }




        }
}
