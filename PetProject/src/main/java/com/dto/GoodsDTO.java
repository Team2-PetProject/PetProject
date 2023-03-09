package com.dto;

public class GoodsDTO {
	private String gCode;
	private String gCategory;
	private String gName;
	private String gInfo;
	private int gPrice;
	private String gImage;
	public GoodsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsDTO(String gCode, String gCategory, String gName, String gInfo, int gPrice, String gImage) {
		super();
		this.gCode = gCode;
		this.gCategory = gCategory;
		this.gName = gName;
		this.gInfo = gInfo;
		this.gPrice = gPrice;
		this.gImage = gImage;
	}
	public String getgCode() {
		return gCode;
	}
	public void setgCode(String gCode) {
		this.gCode = gCode;
	}
	public String getgCategory() {
		return gCategory;
	}
	public void setgCategory(String gCategory) {
		this.gCategory = gCategory;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgInfo() {
		return gInfo;
	}
	public void setgInfo(String gInfo) {
		this.gInfo = gInfo;
	}
	public int getgPrice() {
		return gPrice;
	}
	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}
	public String getgImage() {
		return gImage;
	}
	public void setgImage(String gImage) {
		this.gImage = gImage;
	}
	@Override
	public String toString() {
		return "GoodsDTO [gCode=" + gCode + ", gCategory=" + gCategory + ", gName=" + gName + ", gInfo=" + gInfo
				+ ", gPrice=" + gPrice + ", gImage=" + gImage + "]";
	}
	
}
