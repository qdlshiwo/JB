package cn.zkingsoft.pojo;

public class Sptab {
	private String pid;
	private String pname;
	private Double price;
	private String category;//Ʒ��
	private String pnum;//��Ʒ���
	private String imgurl;//ͼƬurl
	private String description;//����
	private String color;//��ɫ
	private String cpu;//���봦����
	private String gpu;//�Կ�
	private String neicun;//�ڴ�
	private String yingpan;//Ӳ��
	private Integer kucun;//���
	private Integer pstate;//��Ʒ״̬
	private String pinglun;//����Ʒ����id��1��2��3��4...��
	public Sptab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sptab(String pid, String pname, Double price, String category, String pnum, String imgurl,
			String description, String color, String cpu, String gpu, String neicun, String yingpan, Integer kucun,
			Integer pstate, String pinglun) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.category = category;
		this.pnum = pnum;
		this.imgurl = imgurl;
		this.description = description;
		this.color = color;
		this.cpu = cpu;
		this.gpu = gpu;
		this.neicun = neicun;
		this.yingpan = yingpan;
		this.kucun = kucun;
		this.pstate = pstate;
		this.pinglun = pinglun;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getNeicun() {
		return neicun;
	}
	public void setNeicun(String neicun) {
		this.neicun = neicun;
	}
	public String getYingpan() {
		return yingpan;
	}
	public void setYingpan(String yingpan) {
		this.yingpan = yingpan;
	}
	public Integer getKucun() {
		return kucun;
	}
	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}
	public Integer getPstate() {
		return pstate;
	}
	public void setPstate(Integer pstate) {
		this.pstate = pstate;
	}
	public String getPinglun() {
		return pinglun;
	}
	public void setPinglun(String pinglun) {
		this.pinglun = pinglun;
	}
	
}
