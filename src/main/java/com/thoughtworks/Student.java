package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String name;
    private int studentId;
    private String admissionDate;

    public Student() {
    }

    public Student(String name, int studentId, String admissionDate) {
        this.name = name;
        this.studentId = studentId;
        this.admissionDate = admissionDate;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return "00" + studentId;
    }

    public String getAdmissionDate() throws ParseException {
        SimpleDateFormat rowFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date rowDate = rowFormat.parse(admissionDate);
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy年M月dd日");
        return newFormat.format(rowDate);
    }

    public String getStudyAge() {
        String startYear = admissionDate.substring(0, 4);
        Date now = new Date();
        SimpleDateFormat currentYear = new SimpleDateFormat("YYYY");
        int studyAge = Integer.parseInt(currentYear.format(now)) - Integer.parseInt(startYear);
        return studyAge + "年";
    }

    @Override
    public String toString() {
        return "我是" + name
            + "，我的学号是" + studentId + "，"
            + admissionDate + "入学" + "，学龄"
            + getStudyAge();
    }
}
