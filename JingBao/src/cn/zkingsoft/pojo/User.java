package cn.zkingsoft.pojo;

import java.io.Serializable;

public class User implements Serializable{
	private String id ;
	private String username ;
	private String password ;
	private String gender ;
	private String email ;
	private String telephone ;
	private String introduce ;
	private String activeCode;
	private Integer state;
	private String role;
	private String regisTime;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String username, String password, String gender, String email, String telephone,
			String introduce, String activeCode, int state, String role, String regisTime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.telephone = telephone;
		this.introduce = introduce;
		this.activeCode = activeCode;
		this.state = state;
		this.role = role;
		this.regisTime = regisTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRegisTime() {
		return regisTime;
	}
	public void setRegisTime(String regisTime) {
		this.regisTime = regisTime;
	}
	
}