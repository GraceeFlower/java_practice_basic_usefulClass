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

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return "00" + studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAdmissionDate() throws ParseException {
        SimpleDateFormat rowFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date rowDate = rowFormat.parse(admissionDate);
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy年M月dd日");
        return newFormat.format(rowDate);
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }
}
