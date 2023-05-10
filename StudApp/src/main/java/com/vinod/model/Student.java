package com.vinod.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudApp")
public class Student {
	@Id
	private Integer stdId;
	private String stdName;
	private String stdMail;
	private String course;
	private double fees;
	public Student() {
		super();
	}
	public Student(Integer stdId, String stdName, String stdMail, String course, double fees) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdMail = stdMail;
		this.course = course;
		this.fees = fees;
	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdMail() {
		return stdMail;
	}
	public void setStdMail(String stdMail) {
		this.stdMail = stdMail;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMail=" + stdMail + ", course=" + course
				+ ", fees=" + fees + "]";
	}
		
}
