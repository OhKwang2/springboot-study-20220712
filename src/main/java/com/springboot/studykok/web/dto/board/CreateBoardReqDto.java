package com.springboot.studykok.web.dto.board;

import lombok.Builder;
import lombok.Data;

//RequestDto에서는 Builder 가 필요 없음 (ResponseDto에서 필요)
@Data
public class CreateBoardReqDto {
	
	private String title;
	private int usercode;
	private String content;
}
