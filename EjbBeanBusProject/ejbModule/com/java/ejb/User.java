package com.java.ejb;

import java.io.Serializable;

public class User implements Serializable{
	
	private String user_id;
	private String full_name;
	private String contact_no;
	private String email;
	private String username;
	private String psswd;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPsswd() {
		return psswd;
	}
	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", full_name=" + full_name + ", contact_no=" + contact_no + ", email="
				+ email + ", username=" + username + ", psswd=" + psswd + "]";
	}
	public User(String user_id, String full_name, String contact_no, String email, String username, String psswd) {
		
		this.user_id = user_id;
		this.full_name = full_name;
		this.contact_no = contact_no;
		this.email = email;
		this.username = username;
		this.psswd = psswd;
	}
	public User() {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
