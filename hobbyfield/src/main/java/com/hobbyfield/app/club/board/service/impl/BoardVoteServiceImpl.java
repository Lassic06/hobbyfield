package com.hobbyfield.app.club.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hobbyfield.app.club.board.service.BoardVoteOptionVO;
import com.hobbyfield.app.club.board.service.BoardVoteResultVO;
import com.hobbyfield.app.club.board.service.BoardVoteService;
import com.hobbyfield.app.club.board.service.BoardVoteVO;

@Service
public class BoardVoteServiceImpl implements BoardVoteService {
	
	@Override
	public int insertVote(BoardVoteVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int insertVoteOption(BoardVoteOptionVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertVoteResult(BoardVoteResultVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteVoteResult(BoardVoteResultVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVoteVO> allBoardVote(BoardVoteVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVoteVO selectBoardVote(BoardVoteVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVoteOptionVO> getVoteOption(BoardVoteOptionVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVoteResultVO> getVoteResult(BoardVoteResultVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
