package com.bhup5.manytomanybidirectional.Repository;

import com.bhup5.manytomanybidirectional.Entity.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Library,Integer> {
}
