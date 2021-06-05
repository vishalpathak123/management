package com.library.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Member")
public class Member {
	@Id
	@Column(name = "memberId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String memberId;
	@Column(name = "memberName")
	private String memberName;
	@Column(name = "email")
	private String email;
	@Column(name = "role")
	private String role;

	public Member(String memberId, String memberName, String email, String role) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.email = email;
		this.role = role;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", email=" + email + ", role=" + role
				+ "]";
	}

}
