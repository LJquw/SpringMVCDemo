package com.liujun.Service;

import com.liujun.dao.StudentMapper;
import com.liujun.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentMapper studentMapper;

    @Override
    public boolean addStudent(Student student){
        int ok = studentMapper.addStudent(student);
        return ok == 1;

    }
    @Override
    public boolean deleteStudent(int sid){
        int ok = studentMapper.deleteStudent(sid);
        return ok == 1;
    }
    @Override
    public boolean updateStudent(Student student){
        int ok = studentMapper.updateStudent(student);
        return ok == 1;
    }
    @Override
    public List<Student> getAllStudent()  {
       boolean k = studentMapper == null;
        System.out.println(k);
      return  studentMapper.getAllStudent();
    }
    @Override
    public Student getStudentById(int sid)  {
        return  studentMapper.getStudentById(sid);
    }

}
