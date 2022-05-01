package com.itheima.type;

public class switch_fenzhi {
    public static void main(String[] args) {
        // switc值匹配 if范围匹配+值匹配
        String weekday = "周";
        switch (weekday){
            case "周一":
                System.out.println("1");
                break;
            case "周二":
                System.out.println("2");
                break;
            case "周三":
                System.out.println("3");
                break;
            default:
                System.out.println("数据有误");

        }
    }
}
