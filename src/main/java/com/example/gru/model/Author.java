package com.example.gru.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String fNAme ;
    private String lName ;
    @ManyToMany(mappedBy = "authors")
    private Set<Book>books=new HashSet<>();

    public Author() {
    }

    public Author(String fNAme, String lName) {
        this.fNAme = fNAme;
        this.lName = lName;

    }

    public Author(String fNAme, String lName, Set<Book> books) {
        this.fNAme = fNAme;
        this.lName = lName;
        this.books = books;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfNAme() {
        return fNAme;
    }

    public void setfNAme(String fNAme) {
        this.fNAme = fNAme;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
