package com.example.estateagency.controller;

import com.example.estateagency.model.Buyers;
import com.example.estateagency.repo.BuyerRepo;
import com.example.estateagency.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class BuyerController {

    @Autowired
    BuyerService service;

    @Autowired
    BuyerRepo mRepo;

    @GetMapping("/read")
    public List<Buyers> read() {
        return service.getAll();
    }

    @GetMapping("/read/{id}")
    public Buyers readOne(@PathVariable long id ) {
        return service.getDepartment(id);
    }

    @PostMapping("/add")
    public Buyers add(@RequestBody Buyers newDep){
        return service.createDepartment(newDep);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id ) {
        service.deleteDepartment(id);
    }

}
