package com.bhup5.manytomanybidirectional.Service;

import com.bhup5.manytomanybidirectional.Entity.Library;

import java.util.List;

public interface LibraryService {

    public List<Library> getAllLibrary();

    public Library getLibrary(int lib_id);

    public String createLibrary(Library library);

    public void deleteLibrary(int lib_id);

    public Library updateLibrary(int lin_id, Library library);
}
