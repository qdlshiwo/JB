package cn.zkingsoft.pojo;

import java.io.Serializable;

public class Dingdan implements Serializable{
	private String uid;
	private String pid;
	private String pname;
	private String category;//Ʒ��
	private String color;//��ɫ
	private Double kucun;//���
	private Integer dnum;//��������
	private Double dprice;//�����۸�
	private Integer dno;//����״̬
	
	public Dingdan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dingdan(String uid, String pid, String pname, String category, String color, Double kucun, Integer dnum,
			Double dprice, Integer dno) {
		super();
		this.uid = uid;
		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.color = color;
		this.kucun = kucun;
		this.dnum = dnum;
		this.dprice = dprice;
		this.dno = dno;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getKucun() {
		return kucun;
	}

	public void setKucun(Double kucun) {
		this.kucun = kucun;
	}

	public Integer getDnum() {
		return dnum;
	}

	public void setDnum(Integer dnum) {
		this.dnum = dnum;
	}

	public Double getDprice() {
		return dprice;
	}

	public void setDprice(Double dprice) {
		this.dprice = dprice;
	}

	public Integer getDno() {
		return dno;
	}

	public void setDno(Integer dno) {
		this.dno = dno;
	}
	
}
