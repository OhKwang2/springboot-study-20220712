package com.springboot.studykok.domain.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	public int save(Board board);
	public Board findBoardByBoardcode(int boardcode);
	public List<Board> getBoardListOfIndex(int index); //List<객체> <- 리스트로 가져옴
}
