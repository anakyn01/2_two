package com.cocea.books.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	//
	@GetMapping(value="/")//프로젝트 폴더명 아티팩트 까지 포함함
	public String mainPageGET() {
		logger.info("진입함");
		return "main";
	}

}
