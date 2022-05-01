package fengzhuang;

public class Student {
    private int age;

    public void setAge(int age){
        if (age >= 0 && age <= 200) {
            this.age = age;
        }else {
            System.out.println("亲重新输入：");
        }
    }

    public int getAge(){
        return age;
    }
}
