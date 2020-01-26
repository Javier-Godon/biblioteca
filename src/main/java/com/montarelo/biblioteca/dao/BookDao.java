package com.montarelo.biblioteca.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montarelo.biblioteca.persistance.model.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

}
