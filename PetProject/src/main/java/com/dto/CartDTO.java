package com.dto;

public class CartDTO {
	private int num;
	private String userid;
	private String gCode;
	private int gAmount;
	private String gSpec;
	private String gTaste;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(int num, String userid, String gCode, int gAmount, String gSpec, String gTaste) {
		super();
		this.num = num;
		this.userid = userid;
		this.gCode = gCode;
		this.gAmount = gAmount;
		this.gSpec = gSpec;
		this.gTaste = gTaste;
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
	public int getgAmount() {
		return gAmount;
	}
	public void setgAmount(int gAmount) {
		this.gAmount = gAmount;
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
	@Override
	public String toString() {
		return "CartDTO [num=" + num + ", userid=" + userid + ", gCode=" + gCode + ", gAmount=" + gAmount + ", gSpec="
				+ gSpec + ", gTaste=" + gTaste + "]";
	}
}
