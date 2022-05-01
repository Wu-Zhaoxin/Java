package com.itheima.type;

public class sanyuanyunsuanfu {
    public static void main(String[] args) {
//         三元运算符
        double score = 87;
        String rs = score >= 60 ? "通过" : "挂科了";
        System.out.println(rs);

        int a = 10000;
        int b = 2000;
        int max = a > b ? a : b;
        System.out.println(max);

        int i = 10;
        int j = 30;
        int k = 50;
        int temp = i > j ? i : j;
        int rsmax = temp > k ? temp : k;
        System.out.println(rsmax);
        int rsMax = i > j ? (i > k ? i : k ) : (j > k ? j : k);
    }
}
