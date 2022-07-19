package com.springboot.studykok.service.board;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.springboot.studykok.domain.board.Board;
import com.springboot.studykok.domain.board.BoardRepository;
import com.springboot.studykok.web.dto.board.CreateBoardReqDto;
import com.springboot.studykok.web.dto.board.CreateBoardRespDto;
import com.springboot.studykok.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;

@Service //IoC에 해당 인터페이스를 등록해주는 역할 수행
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardRepository boardRepository;

	@Override
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
//		System.out.println(createBoardReqDto);
//		if(0 == 0) {
//			throw new RuntimeException();			
//		}
//		Board board = createBoardReqDto.toEntity();
//		System.out.println("DB 다녀오기 전 : " + board);
//		int result = boardRepository.save(board);
//		System.out.println("DB 다녀온 후 : " + board);
		
		Board boardEntity = createBoardReqDto.toEntity();
		boolean insertStatus = boardRepository.save(boardEntity) >0;
		
//		return boardRepository.save(createBoardReqDto.toEntity()) > 0;
		return boardEntity.toCreateBoardDto(insertStatus);
	}
	
	@Override
	public ReadBoardRespDto readBoard(int boardcode) throws Exception {
		return boardRepository.findBoardByBoardcode(boardcode).toReadBoardDto();
	}

	@Override
	public ReadBoardRespDto readBoardList(int page) throws Exception {
		return null;
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
