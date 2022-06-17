package com.axyya.FlightReservationApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column
	private Long userId;
	@Column
	private String fullName;
	@Column
	private String email;
	@Column
	private String mobileNo;
	@Column
	private String password;
	@Column
	private  String gender;
	@Column
	private int age;
	
	
	public User() {
		super();
	}
	public User( Long id,String fullName, String email, String mobileNo, String password, String gender, int age) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
		this.gender = gender;
		this.age = age;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
