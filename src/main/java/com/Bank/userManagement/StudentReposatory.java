package com.Bank.userManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

@Repository
public class StudentReposatory {
//this is the standard changes
    HashMap<Integer,Student> db = new HashMap<>();

    public String addStudent(Student student) {
        int id = student.getNo();
        db.put(id, student);
        return "Student Added Successful.";
    }

    public Student getStudent(int id){
        return db.get(id);
    }

    public String deleteStudent(int no){
        if(!db.containsKey(no))
            return "Invalid ID";

            db.remove(no);
            return "Number removed Successfully.";
    }

    public String updateState(int no, String state) {
            if(!db.containsKey(no)) return "Invalid ID";

            db.get(no).setState(state);
            return "State Updated Successfully";
    }

    public String updateName(int no, String name){
        if(!db.containsKey(no)) return "Invalid ID";

        db.get(no).setName(name);
        return "New Name Updated Successfully";
    }
}
