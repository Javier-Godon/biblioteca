package com.montarelo.biblioteca.service.impl;

import java.util.List;

import com.montarelo.biblioteca.exception.NoRecordFoundException;
import com.montarelo.biblioteca.persistance.model.Book;
import com.montarelo.biblioteca.persistance.model.User;
import com.montarelo.biblioteca.service.BookService;

public class BookServiceImpl implements BookService {

	@Override
	public Book findOne(int id) throws NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findAvailable(Boolean availability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findBooksByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findBooksOverdue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User user, Book book) {
		// TODO Auto-generated method stub
		return false;
	}

}
