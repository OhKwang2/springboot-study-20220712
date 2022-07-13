package com.springboot.studykok.web.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studykok.web.dto.TestRespDto;
import com.springboot.studykok.web.dto.User;

@RestController
//RestController <- 데이터 통신용. 데이터만 보내줌.
@RequestMapping("api/v1")
//RequestMapping이 붙으면 뒤에 get or post mapping 주소 앞에 위에 설정한 주소도 함께 넣어야 함.
public class ApiTestController {
	
	@GetMapping("/test")
	public Object getTest() {
		return TestRespDto.builder().username("junil").password("1234").build();
	}
	
	@PostMapping("/test")
	public String postTest() {
		return "test data(post)";
	}
	
	/*
	 *요청 메소드 : post
	 *요청 주소 : /api/v1/user
	 *User 클래스 생성
	 *username
	 *password
	 *name
	 *email
	 *
	 *JSON으로 응답받기
	 */
	
	@PostMapping("/user")
	public Object postUser() {
		return User.builder().username("Ohkwang").password("1234").name("권오광").email("ohkwang2@gmail.com").build();
	}

	
}