package com.dto;

public class MemberDTO {
	private String member_code;
	private String member_passwd;
	private String member_name;
	private String member_post;
	private String addr1;
	private String addr2;
	private String phone1;
	private String phone2;
	private String phone3;
	private String email1;
	private String email2;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String member_code, String member_passwd, String member_name, String member_post, String addr1,
			String addr2, String phone1, String phone2, String phone3, String email1, String email2) {
		super();
		this.member_code = member_code;
		this.member_passwd = member_passwd;
		this.member_name = member_name;
		this.member_post = member_post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.email1 = email1;
		this.email2 = email2;
	}
	public String getMember_code() {
		return member_code;
	}
	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}
	public String getMember_passwd() {
		return member_passwd;
	}
	public void setMember_passwd(String member_passwd) {
		this.member_passwd = member_passwd;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_post() {
		return member_post;
	}
	public void setMember_post(String member_post) {
		this.member_post = member_post;
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
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	@Override
	public String toString() {
		return "MemberDTO [member_code=" + member_code + ", member_passwd=" + member_passwd + ", member_name="
				+ member_name + ", member_post=" + member_post + ", addr1=" + addr1 + ", addr2=" + addr2 + ", phone1="
				+ phone1 + ", phone2=" + phone2 + ", phone3=" + phone3 + ", email1=" + email1 + ", email2=" + email2
				+ "]";
	}
	
	
	
}