package com.library.management.model;

import java.sql.Date;

public class BookHistory {

	private int uuId;
	private String name;
	private Date date;
	public int getUuId() {
		return uuId;
	}
	public void setUuId(int uuId) {
		this.uuId = uuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BookHistory(int uuId, String name, Date date) {
		super();
		this.uuId = uuId;
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		return "BookHistory [uuId=" + uuId + ", name=" + name + ", date=" + date + "]";
	}

	

}
