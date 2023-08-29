package com.hobbyfield.app.prdt.service;

import java.util.List;

public interface PrdtService {
	//상품등록
	public int insertPrdt(PrdtVO prdtVO);
		
	//상품상세보기
	public PrdtVO selectPrdt(int PrdtId);
		
	//상품목록조회
	public List<PrdtVO> selectAllPrdt();
	
	//상품수정하기
	public void updatePrdt(PrdtVO prdtVO);
	
	//등록된상품 삭제
	public void deletePrdt(int prdtId);
}
