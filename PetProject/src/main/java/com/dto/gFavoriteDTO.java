package com.dto;

public class gFavoriteDTO {
	private String userid;
	private String gCode;
	public gFavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public gFavoriteDTO(String userid, String gCode) {
		super();
		this.userid = userid;
		this.gCode = gCode;
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
	@Override
	public String toString() {
		return "gFavoriteDTO [userid=" + userid + ", gCode=" + gCode + "]";
	}
	
}
