package com.service;

import java.util.List;

import com.bean.ClassList;
import com.dao.ClassDao;


public class ClassService {
ClassDao sd = new ClassDao();
    
    public String storeClassDetails(ClassList cls) {
        if(sd.storeClass(cls)>0) {
            return "Class details stored successfully";
        }else {
            return "Class details didn't store";
        }
    }
    
    public List<ClassList> findAllClass() {
        return sd.findAllClass();
    }
    
    public String updateClass(ClassList cls) {
    	if(sd.updateClass(cls)>0) {
			return "Class Updated Successfully";
		}
		else {
			return "Class didnt updated";
		}
	}
    
    public List<Object[]> getClassTeacher(){
		return sd.findClassAndTeacherDetails();
	}
    
    public List<Object[]> getClassReport(int cid){
    	System.out.println(cid);
		return sd.findClassReport(cid);
	}

}
