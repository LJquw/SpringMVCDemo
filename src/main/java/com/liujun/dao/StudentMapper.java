package com.liujun.dao;

import com.liujun.entity.Student;

import java.util.List;

/**
 * @author liujun
 */

public interface StudentMapper {
     int addStudent(Student student);
     int deleteStudent(int sid);
     int updateStudent(Student student);
     List<Student> getAllStudent();
     Student getStudentById(int sid);
}
