package com.bhup5.manytomanybidirectional.Controller;

import com.bhup5.manytomanybidirectional.Entity.Book;
import com.bhup5.manytomanybidirectional.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService service1;

    @GetMapping("/getBook")
    public List<Book> getAllBook(){
        return (List<Book>) service1.getAllBook();
    }

    @GetMapping("/getBook/{book_id}")
    public Book getBook(@PathVariable int book_id){
        Book book=service1.getBook(book_id);
        return book;
    }
    @PostMapping("/createBook")
    public String createBook(@RequestBody Book book){
        service1.createBook(book);
        return "Data Successfully Created";
    }
    @DeleteMapping("/deleteBook/{book_id}")
    public String deleteBook(@PathVariable int book_id){
        service1.deleteBook(book_id);
        return "Data Deleted Successfully";
    }
    @PutMapping("/updateBook/{book_id}")
    public Book updateBook(@PathVariable int book_id,@RequestBody Book book){
        service1.updateBook(book_id, book);
        return book;
    }

}
