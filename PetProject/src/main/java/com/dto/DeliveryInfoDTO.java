package com.dto;

public class DeliveryInfoDTO {
	private int delivery_info_code;
	private String delivery_info_status;
	private String delivery_info_company;
	private String delivery_info_invoice_number;
	private String devliery_info_start_time;
	private String delivery_info_end_time;
	private int OrderInfo_Code;
	public DeliveryInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeliveryInfoDTO(int delivery_info_code, String delivery_info_status, String delivery_info_company,
			String delivery_info_invoice_number, String devliery_info_start_time, String delivery_info_end_time,
			int orderinfo_code) {
		super();
		this.delivery_info_code = delivery_info_code;
		this.delivery_info_status = delivery_info_status;
		this.delivery_info_company = delivery_info_company;
		this.delivery_info_invoice_number = delivery_info_invoice_number;
		this.devliery_info_start_time = devliery_info_start_time;
		this.delivery_info_end_time = delivery_info_end_time;
		this.OrderInfo_Code = orderinfo_code;
	}
	public int getDelivery_info_code() {
		return delivery_info_code;
	}
	public void setDelivery_info_code(int delivery_info_code) {
		this.delivery_info_code = delivery_info_code;
	}
	public String getDelivery_info_status() {
		return delivery_info_status;
	}
	public void setDelivery_info_status(String delivery_info_status) {
		this.delivery_info_status = delivery_info_status;
	}
	public String getDelivery_info_company() {
		return delivery_info_company;
	}
	public void setDelivery_info_company(String delivery_info_company) {
		this.delivery_info_company = delivery_info_company;
	}
	public String getDelivery_info_invoice_number() {
		return delivery_info_invoice_number;
	}
	public void setDelivery_info_invoice_number(String delivery_info_invoice_number) {
		this.delivery_info_invoice_number = delivery_info_invoice_number;
	}
	public String getDevliery_info_start_time() {
		return devliery_info_start_time;
	}
	public void setDevliery_info_start_time(String devliery_info_start_time) {
		this.devliery_info_start_time = devliery_info_start_time;
	}
	public String getDelivery_info_end_time() {
		return delivery_info_end_time;
	}
	public void setDelivery_info_end_time(String delivery_info_end_time) {
		this.delivery_info_end_time = delivery_info_end_time;
	}
	public int getOrderinfo_code() {
		return OrderInfo_Code;
	}
	public void setOrderinfo_code(int orderinfo_code) {
		this.OrderInfo_Code = orderinfo_code;
	}
	@Override
	public String toString() {
		return "DeliveryInfoDTO [delivery_info_code=" + delivery_info_code + ", delivery_info_status="
				+ delivery_info_status + ", delivery_info_company=" + delivery_info_company
				+ ", delivery_info_invoice_number=" + delivery_info_invoice_number + ", devliery_info_start_time="
				+ devliery_info_start_time + ", delivery_info_end_time=" + delivery_info_end_time + ", orderinfo_code="
				+ OrderInfo_Code + "]";
	}
	
}