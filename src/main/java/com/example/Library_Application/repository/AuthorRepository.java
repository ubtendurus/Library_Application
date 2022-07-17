package com.example.Library_Application.repository;

import com.example.Library_Application.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {


}
