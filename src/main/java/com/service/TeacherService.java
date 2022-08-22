package com.service;

import java.util.List;

import com.bean.Teacher;
import com.dao.TeacherDao;


public class TeacherService {
TeacherDao sd = new TeacherDao();
    
    public String storeTeacherDetails(Teacher teacher) {
        if(sd.storeTeacher(teacher)>0) {
            return "Teacher details stored successfully";
        }else {
            return "Teacher details didn't store";
        }
    }
    
    public List<Teacher> findAllTeacher() {
        return sd.findAllTeacher();
    }
}
