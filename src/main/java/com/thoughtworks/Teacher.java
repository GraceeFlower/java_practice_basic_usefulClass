package com.thoughtworks;

import java.util.ArrayList;
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

    public void checkRepeat() {
        System.out.println("\n" + this.name + "老师的重复学生信息：");

        HashSet<Student> idSet = new HashSet<>();
        for (int i = 0; i < stuList.size() - 1; i++) {
            for(int j = i + 1; j < stuList.size(); j++) {
                if (stuList.get(i).equals(stuList.get(j))) {
                    idSet.add(stuList.get(i));
                    idSet.add(stuList.get(j));
                }
            }
        }
        idSet.forEach(System.out::println);
    }
}
