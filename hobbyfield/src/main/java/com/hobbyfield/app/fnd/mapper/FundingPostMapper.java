package com.hobbyfield.app.fnd.mapper;

import java.util.List;

import com.hobbyfield.app.fnd.service.FundingPostVO;

public interface FundingPostMapper {
	//전체조회
	public List<FundingPostVO> selectFundingPostList();
	
	//상세조회
	public FundingPostVO selectFundingPost(FundingPostVO fundingPostVO);
	
	//등록
	public int insertFundingPost(FundingPostVO fundingPostVO);
	
	//수정
	public int updateFundingPost(FundingPostVO fundingPostVO);
	
	//조회수
	public int FundingPostViewsCount(FundingPostVO fundingPostVO);
	
	//펀딩결제시 모인금액 참여인원 업데이트
	public int updateFundingPostPayment(FundingPostVO fundingPostVO);
	
	//삭제
	public int deleteFundingPost(FundingPostVO fundingPostVO);
}
