package com.montarelo.biblioteca.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montarelo.biblioteca.model.response.CommonResponse;
import com.montarelo.biblioteca.model.response.ResponseCodeEnum;
import com.montarelo.biblioteca.persistance.model.Book;
import com.montarelo.biblioteca.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {
	
	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;
	
	//Aquí se montarían los endpoint que llamarían a los métodios de bookservice, ejemplo
	@PostMapping(value = "/overdue", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CommonResponse> getAllUsers() {
		List<Book> userList = bookService.findBooksOverdue();
		return new ResponseEntity<>(new CommonResponse(ResponseCodeEnum.OK, userList), HttpStatus.OK);

	}
}
