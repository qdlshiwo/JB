package cn.zkingsoft.pojo;

public class User {
	private String id ;
	private String username ;
	private String password ;
	private String gender ;
	private String email ;
	private String telephone ;
	private String introduce ;
	private String activecode;
	private Integer state;
	private String role;
	private String registime;
	public User() {
	}
	public User(String id, String username, String password, String gender, String email, String telephone,
			String introduce, String activecode, Integer state, String role, String registime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.telephone = telephone;
		this.introduce = introduce;
		this.activecode = activecode;
		this.state = state;
		this.role = role;
		this.registime = registime;
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
	public String getActivecode() {
		return activecode;
	}
	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRegistime() {
		return registime;
	}
	public void setRegistime(String registime) {
		this.registime = registime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender
				+ ", email=" + email + ", telephone=" + telephone + ", introduce=" + introduce + ", activecode="
				+ activecode + ", state=" + state + ", role=" + role + ", registime=" + registime + "]";
	}
}
