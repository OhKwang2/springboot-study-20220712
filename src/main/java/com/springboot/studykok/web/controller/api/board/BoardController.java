package com.springboot.studykok.web.controller.api.board;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studykok.service.board.BoardService;
import com.springboot.studykok.web.dto.CMRespDto;
import com.springboot.studykok.web.dto.board.CreateBoardReqDto;
import com.springboot.studykok.web.dto.board.CreateBoardRespDto;
import com.springboot.studykok.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;

	// 게시글 작성 (자원 뒤에 번호를 주지 않음. 그 이유는 DB에서 오토인크리먼트로 인덱스를 생성)
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto){
		//JSON 요청인 경우 @RequestBody를 붙여줘야 함
		CreateBoardRespDto createBoardRespDto = null;
		try {
			createBoardRespDto = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(new CMRespDto<>(1, "게시글 등록 실패", createBoardRespDto));
		}
		
//		System.out.println("게시글 작성 요청");
//		System.out.println("title : " + createBoardReqDto.getTitle());
//		System.out.println("usercode : " + createBoardReqDto.getUsercode());
//		System.out.println("content : " + createBoardReqDto.getContent());
		
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("Content-Type", "text/html;charset=utf-8");
//		return ResponseEntity.ok().headers(headers).body("test");	//순서 지켜야 함.
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 등록 성공", createBoardRespDto));	//순서 지켜야 함.
//		return new ResponseEntity<>(title + " 게시글 작성 성공", HttpHeaders  HttpStatus.BAD_REQUEST);
	}
	
	// 게시글 조회
	@GetMapping("/content/{boardcode}")
	public ResponseEntity<?> getBoard(@PathVariable int boardcode) {
		ReadBoardRespDto readBoardDto = null;
		try {
			readBoardDto = boardService.readBoard(boardcode);
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "게시글 조회 실패", readBoardDto));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 조회 성공", readBoardDto));
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getBoardList(@RequestParam int page) {
		
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 리스트 " + page + "페이지 불러오기 성공", null));
		
	}
	// 게시글 수정
	
	
	// 게시글 삭제
}
