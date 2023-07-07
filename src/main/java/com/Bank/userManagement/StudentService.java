package com.Bank.userManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentReposatory studentReposatory;

    public String addStudent(Student student) {
        return studentReposatory.addStudent(student);
    }

    public Student getStudent(int id) {
        return studentReposatory.getStudent(id);
    }

    public String deleteStudent(int id){
        return  studentReposatory.deleteStudent(id);
    }

    public String updateState(int no, String state) {
        return studentReposatory.updateState(no, state);
    }

    public String updateName(int no, String name){
        return studentReposatory.updateName(no, name);
    }
}
