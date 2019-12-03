package com.github.hongkaiwen.kotlinplay.l5

import com.github.hongkaiwen.kotlinplay.step2.Student

class TeacherService(private val student: Student) {

    fun sHello() {
        student.hello()
    }

}
