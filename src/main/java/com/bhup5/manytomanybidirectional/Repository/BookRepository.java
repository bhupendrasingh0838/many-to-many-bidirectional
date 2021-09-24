package com.bhup5.manytomanybidirectional.Repository;

import com.bhup5.manytomanybidirectional.Entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
}
