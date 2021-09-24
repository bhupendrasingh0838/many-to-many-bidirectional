package com.bhup5.manytomanybidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lib_id;
    private String libName;
    //@ManyToMany(cascade = CascadeType.ALL,mappedBy = "libraries")
    @ManyToMany(cascade = CascadeType.ALL )
    private List<Book> books = new ArrayList<>();

    public Library() {
    }

    public Library(int lib_id, String libName, List<Book> books) {
        this.lib_id = lib_id;
        this.libName = libName;
        this.books = books;
    }

    public int getLib_id() {
        return lib_id;
    }

    public void setLib_id(int lib_id) {
        this.lib_id = lib_id;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}