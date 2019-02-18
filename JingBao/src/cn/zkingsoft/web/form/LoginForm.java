package cn.zkingsoft.web.form;

import java.io.Serializable;

import cn.zkingsoft.web.core.ActionForm;
/**
 * ÕâÊÇµÇÂ¼µÄform
 * @author Lxp
 *
 */
public class LoginForm extends ActionForm implements Serializable{
	private String uname;
	private String upass;
	public LoginForm() {
	}
	public LoginForm(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
}
