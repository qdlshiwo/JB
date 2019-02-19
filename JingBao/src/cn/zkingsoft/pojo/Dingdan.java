package cn.zkingsoft.pojo;

import java.io.Serializable;

public class Dingdan implements Serializable{
	private String did;
	private String uid;
	private String pid;
	private Integer dnum;
	private Integer dno;
	private String address;
	private String discount;
	public Dingdan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dingdan(String did, String uid, String pid, Integer dnum, Integer dno, String address, String discount) {
		super();
		this.did = did;
		this.uid = uid;
		this.pid = pid;
		this.dnum = dnum;
		this.dno = dno;
		this.address = address;
		this.discount = discount;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Integer getDnum() {
		return dnum;
	}
	public void setDnum(Integer dnum) {
		this.dnum = dnum;
	}
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
}
