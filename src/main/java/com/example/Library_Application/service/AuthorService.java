package com.example.Library_Application.service;

import com.example.Library_Application.entity.Author;
import com.example.Library_Application.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors(){
        return authorRepository.findAll();
    }

    public Author findAuthorById(Long id){
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public void createAuthor(Author author){
        authorRepository.save(author);
    }

    public void deleteAuthor(Long id){
        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
        authorRepository.deleteById(author.getId());
    }

    public void updateAuthor(Author author){
        authorRepository.save(author);
    }
}
