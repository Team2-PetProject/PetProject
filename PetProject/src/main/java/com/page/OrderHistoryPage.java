package com.page;

import java.util.List;

import com.dto.OrderHistoryDTO;

public class OrderHistoryPage {
	

	public String getPerPage() {
		return perPage;
	}
	public void setPerPage(String perPage) {
		this.perPage = perPage;
	}
	private List<OrderHistoryDTO> list; //현재페이지에 들어갈 레코드를 perPage만큼만 저장할 것입니다.
	private int curPage; //현재 볼 페이지 번호 OrderSearchServlet에서 perPage=1로 설정함
	private String perPage="10"; //한 페이지에 보여질 목록 수 10개씩 보여질 예정임
	private int totalCount; //전체 레코드 갯수 오라클에서 구해올 예정임
	private int totalPage; //이건 최대 게시판 숫자.
	
	public List<OrderHistoryDTO> getList() {
		return list;
	}
	public void setList(List<OrderHistoryDTO> list) {
		this.list = list;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public int setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		return totalCount;
	}
	public int getTotalPage() {
		return (totalCount-1)/Integer.parseInt(perPage)+1;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
	
}
