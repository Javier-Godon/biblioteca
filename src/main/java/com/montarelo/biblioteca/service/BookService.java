package com.montarelo.biblioteca.service;

import java.util.List;

import com.montarelo.biblioteca.exception.NoRecordFoundException;
import com.montarelo.biblioteca.persistance.model.Book;
import com.montarelo.biblioteca.persistance.model.User;



public interface BookService {
	Book findOne(int id) throws NoRecordFoundException;
	List<Book> findAvailable (Boolean availability);
	List<Book> findBooksByUser (User user);
	List<Book> findBooksOverdue ();
	boolean update(User user, Book book);

}
