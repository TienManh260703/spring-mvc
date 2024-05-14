package com.foly.lab.buoi4.service;

import com.foly.lab.buoi4.entity.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student("ID1", "Man1", 13, "Dak Nong", true));
        students.add(new Student("ID2", "Manh2", 18, "Dak Nong", false));
        students.add(new Student("ID3", "Manh3", 21, "Dak Nong", true));
        students.add(new Student("ID4", "Manh4", 23, "Dak Nong", false));
        students.add(new Student("ID5", "Manh5", 18, "Dak Nong", true));
        students.add(new Student("ID6", "Manh6", 12, "Dak Nong", false));
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student findById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void create(Student student) {
        students.add(student);
    }

    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                students.set(i, student);
            }
        }
    }

    public void delete(String id) {
        List<Student> deleteStudent = new ArrayList<>();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                deleteStudent.add(student);
            }
        }
        students.removeAll(deleteStudent);
    }
}
