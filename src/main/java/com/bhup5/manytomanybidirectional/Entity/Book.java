package com.bhup5.manytomanybidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;
    private String bookName;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Library>libraries =new ArrayList<>();

    public Book() {
    }

    public Book(int book_id, String bookName, List<Library> libraries) {
        this.book_id = book_id;
        this.bookName = bookName;
        this.libraries = libraries;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

}
