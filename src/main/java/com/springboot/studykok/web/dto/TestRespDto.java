package com.springboot.studykok.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestRespDto {
	private String username;
	private String password;
}
