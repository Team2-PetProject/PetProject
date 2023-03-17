package com.dto;

public class TourDTO {
	private int Tour_Code;
	private String Tour_Name;
	private String Tour_Image;
	private String Tour_Info;
	private String Tour_Day;
	public TourDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TourDTO(int tour_Code, String tour_Name, String tour_Image, String tour_Info, String tour_Day) {
		super();
		Tour_Code = tour_Code;
		Tour_Name = tour_Name;
		Tour_Image = tour_Image;
		Tour_Info = tour_Info;
		Tour_Day = tour_Day;
	}
	public int getTour_Code() {
		return Tour_Code;
	}
	public void setTour_Code(int tour_Code) {
		Tour_Code = tour_Code;
	}
	public String getTour_Name() {
		return Tour_Name;
	}
	public void setTour_Name(String tour_Name) {
		Tour_Name = tour_Name;
	}
	public String getTour_Image() {
		return Tour_Image;
	}
	public void setTour_Image(String tour_Image) {
		Tour_Image = tour_Image;
	}
	public String getTour_Info() {
		return Tour_Info;
	}
	public void setTour_Info(String tour_Info) {
		Tour_Info = tour_Info;
	}
	public String getTour_Day() {
		return Tour_Day;
	}
	public void setTour_Day(String tour_Day) {
		Tour_Day = tour_Day;
	}
	@Override
	public String toString() {
		return "TourDTO [Tour_Code=" + Tour_Code + ", Tour_Name=" + Tour_Name + ", Tour_Image=" + Tour_Image
				+ ", Tour_Info=" + Tour_Info + ", Tour_Day=" + Tour_Day + "]";
	}
	
}
