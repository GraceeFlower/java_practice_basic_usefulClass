package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Teacher {

    private String name;
    private ArrayList<Student> stuList;

    public Teacher() {
    }

    public Teacher(String name, ArrayList<Student> stuList) {
        this.name = name;
        this.stuList = stuList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }

    public void checkRepeat() throws ParseException {
        System.out.println("\n" + this.name + "老师的重复学生信息：");
        ArrayList<String> idList = new ArrayList<>();
        for (Student stu: stuList) {
            idList.add(stu.getStudentId());
        }
        HashSet<String> idSet = new HashSet<>();
        for (int i = 0; i < idList.size(); i++) {
            if (i != idList.indexOf(idList.get(i))) {
                idSet.add(idList.get(i));
            }
        }
        for (Student i: stuList) {
            if (idSet.contains(i.getStudentId())) {
                System.out.println(i.toString());
            }
        }
    }
}
