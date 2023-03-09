package com.dto;

public class OrderInfoDTO {
	private int num;
	private String userid;
	private String gCode;
	private String gName;
	private int gPrice;
	private String gSpec;
	private String gTaste;
	private int gAmount;
	private String gImage;
	private String orderName;
	private String post;
	private String addr1;
	private String addr2;
	private String phone;
	private String paymethod;
	private String orderDay;
	public OrderInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderInfoDTO(int num, String userid, String gCode, String gName, int gPrice, String gSpec, String gTaste,
			int gAmount, String gImage, String orderName, String post, String addr1, String addr2, String phone,
			String paymethod, String orderDay) {
		super();
		this.num = num;
		this.userid = userid;
		this.gCode = gCode;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gSpec = gSpec;
		this.gTaste = gTaste;
		this.gAmount = gAmount;
		this.gImage = gImage;
		this.orderName = orderName;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone = phone;
		this.paymethod = paymethod;
		this.orderDay = orderDay;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getgCode() {
		return gCode;
	}
	public void setgCode(String gCode) {
		this.gCode = gCode;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getgPrice() {
		return gPrice;
	}
	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}
	public String getgSpec() {
		return gSpec;
	}
	public void setgSpec(String gSpec) {
		this.gSpec = gSpec;
	}
	public String getgTaste() {
		return gTaste;
	}
	public void setgTaste(String gTaste) {
		this.gTaste = gTaste;
	}
	public int getgAmount() {
		return gAmount;
	}
	public void setgAmount(int gAmount) {
		this.gAmount = gAmount;
	}
	public String getgImage() {
		return gImage;
	}
	public void setgImage(String gImage) {
		this.gImage = gImage;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public String getOrderDay() {
		return orderDay;
	}
	public void setOrderDay(String orderDay) {
		this.orderDay = orderDay;
	}
	@Override
	public String toString() {
		return "OrderInfoDTO [num=" + num + ", userid=" + userid + ", gCode=" + gCode + ", gName=" + gName + ", gPrice="
				+ gPrice + ", gSpec=" + gSpec + ", gTaste=" + gTaste + ", gAmount=" + gAmount + ", gImage=" + gImage
				+ ", orderName=" + orderName + ", post=" + post + ", addr1=" + addr1 + ", addr2=" + addr2 + ", phone="
				+ phone + ", paymethod=" + paymethod + ", orderDay=" + orderDay + "]";
	}
	
}
