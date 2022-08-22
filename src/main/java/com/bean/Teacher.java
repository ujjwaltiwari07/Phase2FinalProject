package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
@Id
private int tid;
private String tname;
@OneToMany
@JoinColumn(name = "tcid")
private List<ClassList> listOfCls;
@OneToMany
@JoinColumn(name ="tsid")
private List<Subject> listofsub;

public List<Subject> getListofsub() {
	return listofsub;
}
public void setListofsub(List<Subject> listofsub) {
	this.listofsub = listofsub;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public List<ClassList> getListOfCls() {
	return listOfCls;
}
public void setListOfCls(List<ClassList> listOfCls) {
	this.listOfCls = listOfCls;
}

}
