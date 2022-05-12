package com.example.demo.employee.entity;

import java.sql.Date;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Recognition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recogid;
	private int fromaitid;
	private int toaitid;
	private int messageid;
	private Date posteddate;
	public Recognition() {
		super();
	}
	public Recognition(int recogid, int fromaitid, int toaitid, int messageid, Date posteddate) {
		super();
		this.recogid = recogid;
		this.fromaitid = fromaitid;
		this.toaitid = toaitid;
		this.messageid = messageid;
		this.posteddate = posteddate;
	}
	public int getRecogid() {
		return recogid;
	}
	public void setRecogid(int recogid) {
		this.recogid = recogid;
	}
	public int getFromaitid() {
		return fromaitid;
	}
	public void setFromaitid(int fromaitid) {
		this.fromaitid = fromaitid;
	}
	public int getToaitid() {
		return toaitid;
	}
	public void setToaitid(int toaitid) {
		this.toaitid = toaitid;
	}
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	public Date getPosteddate() {
		return posteddate;
	}
	public void setPosteddate(Date posteddate) {
		this.posteddate = posteddate;
	}
	
	@Override
	public String toString() {
		return "Recognition [recogid=" + recogid + ", fromaitid=" + fromaitid + ", toaitid=" + toaitid + ", messageid="
				+ messageid + ", posteddate=" + posteddate + ", getRecogid()=" + getRecogid() + ", getFromaitid()="
				+ getFromaitid() + ", getToaitid()=" + getToaitid() + ", getMessageid()=" + getMessageid()
				+ ", getPosteddate()=" + getPosteddate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
