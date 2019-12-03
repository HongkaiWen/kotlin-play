package com.github.hongkaiwen.kotlinplay.l5;

import com.github.hongkaiwen.kotlinplay.step2.Student;

public class JEntry {

    public static void main(String[] args) {
        TeacherService ts = new TeacherService(new Student());
        ts.sHello();
        EKt.getStudentName(ts);
    }

}
