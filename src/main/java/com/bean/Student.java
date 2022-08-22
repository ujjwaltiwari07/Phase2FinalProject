package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
@Id
private int sid;
private String sname;
private int age;
private Integer csid;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Integer getCsid() {
	return csid;
}
public void setCsid(Integer csid) {
	this.csid = csid;
}

}
