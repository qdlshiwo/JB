package cn.zkingsoft.web.form;

import java.io.Serializable;

import cn.zkingsoft.web.core.ActionForm;

/**
 * ÕâÊÇ×¢²áµÄform
 * @author Lxp
 */
public class RegisterForm extends ActionForm implements Serializable{
	private String email;
	private String telephone;
	private String username;
	private String sex;
	private String password;
	private String confirmpassword;
	private String introduce;
	public RegisterForm() {
	}
	public RegisterForm(String email, String telephone, String username, String sex, String password,
			String confirmpassword, String introduce) {
		this.email = email;
		this.telephone = telephone;
		this.username = username;
		this.sex = sex;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.introduce = introduce;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
}
