package com.library.management.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BorrowHistory")
public class BorrowHistory {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "memberId")
	private int memberId;
	@Column(name = "uuId")
	private int uuId;
	@Column(name = "borrowedDate")
	private Date borrowedDate;
	@Column(name = "returnDate")
	private Date returnDate;
	@Column(name = "dueDate")
	private String dueDate;
	@Column(name = "charges")
	private int charges;

	public BorrowHistory(int id, int memberId, int uuId, Date borrowedDate, Date returnDate, String dueDate,
			String status, int charges) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.uuId = uuId;
		this.borrowedDate = borrowedDate;
		this.returnDate = returnDate;
		this.dueDate = dueDate;
		this.charges = charges;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getUuId() {
		return uuId;
	}

	public void setUuId(int uuId) {
		this.uuId = uuId;
	}

	public Date getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "BorrowHistory [id=" + id + ", memberId=" + memberId + ", uuId=" + uuId + ", borrowedDate="
				+ borrowedDate + ", returnDate=" + returnDate + ", dueDate=" + dueDate 
				+ ", charges=" + charges + "]";
	}

}
