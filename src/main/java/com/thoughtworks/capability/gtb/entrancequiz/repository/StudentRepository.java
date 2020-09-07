package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Team;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> studentList = new ArrayList<>();
    {
        studentList.add(Student.builder().id(1).name("沈乐棋").build());
        studentList.add(Student.builder().id(2).name("徐慧慧").build());
        studentList.add(Student.builder().id(3).name("陈思聪").build());
        studentList.add(Student.builder().id(4).name("王江林").build());
        studentList.add(Student.builder().id(5).name("王登宇").build());
    }
    public List<Student> getStudentList(){
        return studentList;
    }

    public Student saveStudent(Student student) {
        student.setId(studentList.size() + 1);
        studentList.add(student);
        return studentList.get(studentList.size()-1);
    }

}
