package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;

@Entity
public class ClassList {
@Id
private int cid;
private String section;
@OneToMany
@JoinColumn(name = "csid")
private List<Student> listOfStd;

private Integer tcid;

public Integer getTcid() {
	return tcid;
}
public void setTcid(Integer tcid) {
	this.tcid = tcid;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public List<Student> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Student> listOfStd) {
	this.listOfStd = listOfStd;
}

}
