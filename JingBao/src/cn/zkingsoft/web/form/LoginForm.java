package cn.zkingsoft.web.form;

import java.io.Serializable;

import cn.zkingsoft.web.core.ActionForm;
/**
 * ÕâÊÇµÇÂ¼µÄform
 * @author Lxp
 *
 */
public class LoginForm extends ActionForm implements Serializable{
	private String username;
	private String password;
	public LoginForm() {
	}
	public LoginForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	
}
