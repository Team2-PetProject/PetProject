package com.dto;

public class TourDTO {
	private int t_Num;
	private String t_Name;
	private String t_Image;
	private String t_Info;
	private String t_Fnum;
	private String t_Day;
	public TourDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TourDTO(int t_Num, String t_Name, String t_Image, String t_Info, String t_Fnum, String t_Day) {
		super();
		this.t_Num = t_Num;
		this.t_Name = t_Name;
		this.t_Image = t_Image;
		this.t_Info = t_Info;
		this.t_Fnum = t_Fnum;
		this.t_Day = t_Day;
	}
	@Override
	public String toString() {
		return "TourDTO [t_Num=" + t_Num + ", t_Name=" + t_Name + ", t_Image=" + t_Image + ", t_Info=" + t_Info
				+ ", t_Fnum=" + t_Fnum + ", t_Day=" + t_Day + "]";
	}
	public int getT_Num() {
		return t_Num;
	}
	public void setT_Num(int t_Num) {
		this.t_Num = t_Num;
	}
	public String getT_Name() {
		return t_Name;
	}
	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}
	public String getT_Image() {
		return t_Image;
	}
	public void setT_Image(String t_Image) {
		this.t_Image = t_Image;
	}
	public String getT_Info() {
		return t_Info;
	}
	public void setT_Info(String t_Info) {
		this.t_Info = t_Info;
	}
	public String getT_Fnum() {
		return t_Fnum;
	}
	public void setT_Fnum(String t_Fnum) {
		this.t_Fnum = t_Fnum;
	}
	public String getT_Day() {
		return t_Day;
	}
	public void setT_Day(String t_Day) {
		this.t_Day = t_Day;
	}
	
}
