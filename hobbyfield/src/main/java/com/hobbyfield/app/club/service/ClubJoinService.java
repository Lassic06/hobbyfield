package com.hobbyfield.app.club.service;

import java.util.List;

public interface ClubJoinService {

   //소모임 가입 신청
   public int clubJoinInfo(ClubJoinVO joinVO);
   
   //소모임 가입 신청한 전체 회원 조회
   public List<ClubJoinVO> joinClubMemberInfo(ClubJoinVO joinVO);
}
