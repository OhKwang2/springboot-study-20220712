package com.springboot.studykok.service.board;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.springboot.studykok.domain.board.BoardRepository;
import com.springboot.studykok.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@Service //IoC에 해당 인터페이스를 등록해주는 역할 수행
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardRepository boardRepository;

	@Override
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
//		System.out.println(createBoardReqDto);
//		if(0 == 0) {
//			throw new RuntimeException();			
//		}
		return boardRepository.save(createBoardReqDto.toEntity()) > 0;
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
