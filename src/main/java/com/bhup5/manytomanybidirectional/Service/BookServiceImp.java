package com.bhup5.manytomanybidirectional.Service;

import com.bhup5.manytomanybidirectional.Entity.Book;
import com.bhup5.manytomanybidirectional.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookService{
    @Autowired
    BookRepository repository1;


    @Override
    public List<Book> getAllBook() {
        return (List<Book>) repository1.findAll();
    }

    @Override
    public Book getBook(int book_id) {
        return repository1.findById(book_id).get();
    }

    @Override
    public String createBook(Book book) {
        repository1.save(book);
        return "Data Added";
    }

    @Override
    public void deleteBook(int book_id) {
        repository1.deleteById(book_id);

    }

    @Override
    public Book updateBook(int book_id, Book book) {
        Book book1 = repository1.findById(book_id).get();
        book1.setBookName(book.getBookName());
        repository1.save(book1);
        return book1;
    }
}
