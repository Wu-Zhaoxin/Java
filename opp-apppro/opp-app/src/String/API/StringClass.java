package String.API;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
//        扫描器
        Scanner sc1 = new Scanner(System.in);
        System.out.print("请输入：");
//        输入
        String name1 = sc1.next();
        String name2 = "qwe";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
//        忽略大小写：
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.length());
//        找指定索引字符
        char text = name1.charAt(1);
        System.out.println(text);
        for (int i = 0; i < name1.length(); i ++) {
            char text1 = name1.charAt(i);
            System.out.println(text1);
        }
//        字符串转为字符数组
        char[] chars = name1.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i ++) {
            char text1 = chars[i];
            System.out.println(text1);
        }

//        截取
        String section1 = name1.substring(2, 5);
        String section2 = name1.substring(3);
        System.out.println(section1);
//        替换
        String replace1 = name1.replace("a", "换");
        System.out.println(replace1);
//        判断是否包含
        System.out.println(name1.contains("敏感"));
//        判断开始的字符
        System.out.println(name1.startsWith("as"));
//        按字符串分割
        String name3 = "一,二,三,四,五六,七八九,十";
        String[] names = name3.split(",");
        for (int i = 0; i < names.length; i ++) {
            String n = names[i];
            System.out.println(n);
        }

    }
}
