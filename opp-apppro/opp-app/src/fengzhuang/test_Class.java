package fengzhuang;

public class test_Class {
    public static void main(String[] args) {
        Student s1 = new Student();
        int s1_age = s1.getAge();
        System.out.println(s1_age);

        s1.setAge(5);
        System.out.println(s1.getAge());
    }
}
