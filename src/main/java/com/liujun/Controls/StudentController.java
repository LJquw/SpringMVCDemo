package com.liujun.Controls;

import com.liujun.Service.StudentServiceImpl;
import com.liujun.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author liujun
 */
@RequestMapping("/stuManager")
@Controller
public class StudentController {
    @Qualifier("studentServiceImpl")
    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping("/all")
    public String list(Model model){
        List<Student> students=studentServiceImpl.getAllStudent();
        model.addAttribute("stus",students);
        return "/index";
    }
    @GetMapping("/delete/{sid}")
    public String deleteStu(@PathVariable("sid") int sid){
        studentServiceImpl.deleteStudent(sid);
        return "redirect:/stuManager/all";
    }
    @PostMapping("/add")
    public String addMan(Student student){
        studentServiceImpl.addStudent(student);
        return "redirect:/stuManager/all";
    }
    @GetMapping("/toUpdate")
    public String toUpdate(Model model,int sid){
        Student student = studentServiceImpl.getStudentById(sid);
        model.addAttribute("stu",student);
        return "/updateStudent";
    }
    @PostMapping("/update")
    public String updateStu(Student student){
        studentServiceImpl.updateStudent(student);
        return "redirect:/stuManager/all";
    }
    @GetMapping("/toAdd")
    public String toAdd(){
        return "/addStudent";
    }

}
