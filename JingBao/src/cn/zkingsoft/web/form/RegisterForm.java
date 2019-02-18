package cn.zkingsoft.web.form;

public class RegisterForm {
	private String email;
	private String telphone;
	private String uname;
	private String sex;
	private String upass;
	private String reupass;
	private String info;
	public RegisterForm() {
	}
	public RegisterForm(String email, String telphone, String uname, String sex, String upass, String reupass,
			String info) {
		super();
		this.email = email;
		this.telphone = telphone;
		this.uname = uname;
		this.sex = sex;
		this.upass = upass;
		this.reupass = reupass;
		this.info = info;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getReupass() {
		return reupass;
	}
	public void setReupass(String reupass) {
		this.reupass = reupass;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
