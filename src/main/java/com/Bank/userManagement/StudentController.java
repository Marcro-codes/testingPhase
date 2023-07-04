package com.Bank.userManagement;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    HashMap<Integer, Student> db = new HashMap<>();

//    // udpate using PathVariable
    @PutMapping("/update/{id}/{state}")
    public String updt(@PathVariable("id") int id, @PathVariable("state") String state){
        if(!db.containsKey(id)) return "Idvalid";

        db.get(id).setState(state);
        return "Kaam Hogya";
    }

//  //  Update using RequestParam

//    @PutMapping("/updateState")
//    public String update(@RequestParam("id") int no, @RequestParam("updateState") String state){
//
//        if(!db.containsKey(no)) return "invalid";
//
//        db.get(no).setState(state);
//        return "Update Successfully";
//    }


    @PostMapping("/post")
    public String postStudent(@RequestBody Student student) {
        int no = student.getNo();
        db.put(no ,student);
        return "Student added successfully";
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id") int no) {
        return db.get(no);
    }

    @DeleteMapping("/dlt/{no}")
    public String deleteStudent(@PathVariable("no") int no) {

        if(!db.containsKey(no)) return "INVALID";

        db.remove(no);
        return "Student Removed!";
    }

}
