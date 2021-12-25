package com.liujun.Service;

import com.liujun.entity.Student;

import java.util.List;

/**
 * @author
 */
public interface StudentService {
    boolean addStudent(Student student);
    boolean deleteStudent(int sid);
    boolean updateStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentById(int sid);
}
