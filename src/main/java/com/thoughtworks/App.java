package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws ParseException {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", 1, "2019.02.11"));
        stuList.add(new Student("李四", 2, "2019.02.10"));
        stuList.add(new Student("王五", 1, "2019.02.09"));

        stuList.forEach(System.out::println);

        Teacher teacher = new Teacher("张龙", stuList);
        teacher.checkRepeat();
    }
}
