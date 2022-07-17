package com.example.Library_Application.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.model.source.spi.IdentifierSourceNonAggregatedComposite;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 100,nullable = false,unique = true)
    private String name;

    @Column(name= "description",length = 250,nullable = false)
    private String description;

    @ManyToMany(mappedBy = "authors",cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

    public Author(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
