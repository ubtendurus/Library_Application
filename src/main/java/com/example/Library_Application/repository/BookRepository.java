package com.example.Library_Application.repository;

import com.example.Library_Application.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BookRepository extends JpaRepository<Book, Long> {

}

