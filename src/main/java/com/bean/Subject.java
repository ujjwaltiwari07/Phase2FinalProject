package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Subject {
@Id
private int subid;
private String subname;
private Integer tsid;

public Integer getTsid() {
	return tsid;
}
public void setTsid(Integer tsid) {
	this.tsid = tsid;
}
public int getSubid() {
	return subid;
}
public void setSubid(int subid) {
	this.subid = subid;
}
public String getSubname() {
	return subname;
}
public void setSubname(String subname) {
	this.subname = subname;
}

}
