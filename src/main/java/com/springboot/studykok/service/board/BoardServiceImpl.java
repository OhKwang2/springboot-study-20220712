package com.springboot.studykok.service.board;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.springboot.studykok.web.dto.board.CreateBoardReqDto;

@Service //IoC에 해당 인터페이스를 등록해주는 역할 수행
public class BoardServiceImpl implements BoardService{

	@Override
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		System.out.println(createBoardReqDto);
		if(0 == 0) {
			throw new RuntimeException();			
		}
		return true;
	}

	@Override
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
		return false;
	}

	@Override
	public boolean deleteBoard(int boardcode) throws Exception {
		return false;
	}
	
	
}
