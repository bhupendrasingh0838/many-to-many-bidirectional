package com.bhup5.manytomanybidirectional.Controller;

import com.bhup5.manytomanybidirectional.Entity.Library;
import com.bhup5.manytomanybidirectional.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    LibraryService service;

    @GetMapping("/getLibrary")
    public List<Library> getAllLibrary(){
        return (List<Library>) service.getAllLibrary();
    }
    @GetMapping("/getLibrary/{lib_id}")
    public Library getLibrary(@PathVariable int lid_id){
        Library library = service.getLibrary(lid_id);
        return library;
    }
    @PostMapping("/createLibrary")
    public String createLibrary(@RequestBody Library library){
        service.createLibrary(library);
        return "Data Successfully Created";
    }
    @PostMapping("/updateLibrary")
    public Library updateLibrary(@PathVariable int lib_id,@RequestBody Library library){
        service.updateLibrary(lib_id, library);
        return library;
    }
}
