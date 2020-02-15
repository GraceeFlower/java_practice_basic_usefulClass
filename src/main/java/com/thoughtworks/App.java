package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws ParseException {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", 1, "2019.02.11"));
        stuList.add(new Student("李四", 2, "2019.02.10"));
        stuList.add(new Student("王五", 1, "2019.02.09"));
        stuList.add(new Student("小六", 2, "2019.02.08"));

        for (Student stu: stuList) {
            System.out.println("我叫" + stu.getName()
                + "，我的学号是" + stu.getStudentId() + "，"
                + stu.getAdmissionDate() + "入学" + "，学龄"
                + stu.getStudyAge());
        }

        Teacher teacher = new Teacher("张龙", stuList);
        teacher.checkRepeat();
    }
}
