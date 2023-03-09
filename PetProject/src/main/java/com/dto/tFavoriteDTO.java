package com.dto;

public class tFavoriteDTO {
	private int t_Num;

	public tFavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public tFavoriteDTO(int t_Num) {
		super();
		this.t_Num = t_Num;
	}

	public int getT_Num() {
		return t_Num;
	}

	public void setT_Num(int t_Num) {
		this.t_Num = t_Num;
	}

	@Override
	public String toString() {
		return "tFavoriteDTO [t_Num=" + t_Num + "]";
	}

	
	
}
