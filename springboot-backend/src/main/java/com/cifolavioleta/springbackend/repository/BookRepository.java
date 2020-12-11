package com.cifolavioleta.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cifolavioleta.springbackend.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
