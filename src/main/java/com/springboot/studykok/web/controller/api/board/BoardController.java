package com.springboot.studykok.web.controller.api.board;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studykok.service.board.BoardService;
import com.springboot.studykok.web.dto.board.CreateBoardReqDto;

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
		boolean responseData = false;
		try {
			responseData = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
		}
		
//		System.out.println("게시글 작성 요청");
//		System.out.println("title : " + createBoardReqDto.getTitle());
//		System.out.println("usercode : " + createBoardReqDto.getUsercode());
//		System.out.println("content : " + createBoardReqDto.getContent());
		
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("Content-Type", "text/html;charset=utf-8");
//		return ResponseEntity.ok().headers(headers).body("test");	//순서 지켜야 함.
		return ResponseEntity.ok().body(responseData);	//순서 지켜야 함.
//		return new ResponseEntity<>(title + " 게시글 작성 성공", HttpHeaders  HttpStatus.BAD_REQUEST);
	}
	
	// 게시글 조회
	
	
	// 게시글 수정
	
	
	// 게시글 삭제
}
