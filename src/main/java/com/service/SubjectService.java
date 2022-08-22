package com.service;

import java.util.List;

import com.bean.Student;
import com.bean.Subject;
import com.dao.SubjectDao;


public class SubjectService {
SubjectDao sd = new SubjectDao();
    
    public String storeSubjectDetails(Subject subject) {
        if(sd.storeSubject(subject)>0) {
            return "Subject details stored successfully";
        }else {
            return "Subject details didn't store";
        }
    }
    
    public List<Subject> findAllSubject() {
        return sd.findAllSubject();
    }
    public String updateSubject(Subject sub) {
    	if(sd.updateSubject(sub)>0) {
			return "Subject Updated Successfully";
		}
		else {
			return "Subject didnt updated";
		}
	}
    
    public List<Object[]> getSubjectTeacher(){
		return sd.findSubjectAndTeacherDetails();
	}
}
