package ArryListpackage;

import fengzhuang.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_test {
    public static void main(String[] args) {
        ArrayList<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass(7855, "赵一", 25, "4班"));
        students.add(new StudentClass(7875, "赵二", 22, "1班"));
        students.add(new StudentClass(7898, "赵三", 28, "2班"));
        students.add(new StudentClass(7895, "赵四", 22, "3班"));

        System.out.println("学号\t\t名称");
        for (int i = 0; i < students.size(); i++) {
            StudentClass s = students.get(i);
            System.out.println(s.getId() + "\t" + s.getName());
        }

        // 搜索
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("输入学号：");
            String studyNumberstr = sc.next();
            int studyNumber = Integer.parseInt(studyNumberstr);
            StudentClass object = getStudentById(students, studyNumber);
            if (object == null) {
                System.out.println("查无此人");
            }else {
                System.out.println(object.getId() + "\t" + object.getName());
            }
        }
    }

    /**
     * 根据学生学号查询学生对象
     * @param students  存储全部学生对象的集合
     * @param studyNumber  搜索的学生学号
     * @return  学生对象 | null
     */
    public static StudentClass getStudentById(ArrayList<StudentClass> students,int studyNumber) {
        for (int i = 0; i < students.size(); i++) {
            StudentClass s = students.get(i);
            if (s.getId() == (studyNumber)) {
                return s;
            }
            
        }
        return null;
    }
}
