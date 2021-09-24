package com.bhup5.manytomanybidirectional.Service;

import com.bhup5.manytomanybidirectional.Entity.Library;
import com.bhup5.manytomanybidirectional.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImp implements LibraryService {
    @Autowired
    LibraryRepository repository;

    @Override
    public List<Library> getAllLibrary() {
        return (List<Library>) repository.findAll();
    }

    @Override
    public Library getLibrary(int lib_id) {
        return repository.findById(lib_id).get();
    }

    @Override
    public String createLibrary(Library library) {
        repository.save(library);
        return "Data Created";
    }

    @Override
    public void deleteLibrary(int lib_id) {
        repository.deleteById(lib_id);

    }

    @Override
    public Library updateLibrary(int lin_id, Library library) {
        Library library1=repository.findById(lin_id).get();
        library1.setLibName(library.getLibName());
        repository.save(library1);
        return library1;
    }
}
