package com.library.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	@Id
	@Column(name = "uuId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uuId;
	@Column(name = "title")
	private String title;
	@Column(name = "authorName")
	private String authorName;
	@Column(name = "category")
	private String category;
	@Column(name = "count")
	private int count;

	public Book(int uuId, String title, String authorName, String category, int count) {
		super();
		this.uuId = uuId;
		this.title = title;
		this.authorName = authorName;
		this.category = category;
		this.count = count;
	}

	public int getUuid() {
		return uuId;
	}

	public void setUuid(int uuId) {
		this.uuId = uuId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Book [uuId=" + uuId + ", title=" + title + ", authorName=" + authorName + ", category=" + category
				+ ", count=" + count + "]";
	}

}
