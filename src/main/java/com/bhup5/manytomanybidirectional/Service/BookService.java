package com.bhup5.manytomanybidirectional.Service;

import com.bhup5.manytomanybidirectional.Entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBook();

    public Book getBook(int book_id);

    public String createBook(Book book);

    public void deleteBook(int book_id);

    public Book updateBook(int book_id,Book book);
}
