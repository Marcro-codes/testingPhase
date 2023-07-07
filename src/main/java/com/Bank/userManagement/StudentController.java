package com.Bank.userManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/post")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

//        just for Port Reference : localhost:1111/post
    }

    @GetMapping("/get/{no}")
    public Student getStudent(@PathVariable("no") int no){
        return studentService.getStudent(no);

//        refer : localhost:1111/get/2
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("no") int no) {
        return studentService.deleteStudent(no);

//        refer : localhost:1111/delete?no=2
    }

    @PutMapping("/updateState/{no}/{state}")
    public String updateState(@PathVariable("no") int no, @PathVariable("state") String state){
        return  studentService.updateState(no, state);

//        refer : localhost:1111/updateState/1/dhule-chinchgalli
    }

    @PutMapping("/updateName")
    public String updateName(@RequestParam("no") int no, @RequestParam("name") String name) {
        return studentService.updateName(no, name);

//        refer : localhost:1111/updateName?no=1&name=RassMalai
    }
}
