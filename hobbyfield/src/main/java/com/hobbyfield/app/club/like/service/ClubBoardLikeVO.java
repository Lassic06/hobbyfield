package com.hobbyfield.app.club.like.service;

import lombok.Data;

@Data
public class ClubBoardLikeVO {
//	LIKE_NUMBER      NOT NULL NUMBER(4)    
//	PROFILE_NICKNAME NOT NULL VARCHAR2(50) 
//	BOARD_NUMBER     NOT NULL NUMBER(4)    
	private Integer likeNumber;
	private String profileNickname;
	private Integer boardNumber;
	
	
}
