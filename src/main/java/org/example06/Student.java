package org.example06;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(point);
        subjectList.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;
        for (Subject subject : subjectList) {
            total += subject.getScorePoint();
            System.out.println(studentName + " 학생의 " + subject.getName() + " 과목 성적은 " + subject.getScorePoint());
        }
        System.out.println("total = " + total);
    }
}
