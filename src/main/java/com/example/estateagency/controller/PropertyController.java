package com.example.estateagency.controller;

import com.example.estateagency.model.Properties;
import com.example.estateagency.model.Sellers;
import com.example.estateagency.repo.PropertyRepo;
import com.example.estateagency.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/property")
public class PropertyController {


        @Autowired
        PropertyRepo mRepo;


    @Autowired
    PropertyService service;

    public PropertyController(PropertyService service){
        this.service = service;
    }

        @GetMapping("/read")
        public List<Properties> read() {
            return service.getAll();
        }

        @GetMapping("/read/{id}")
        public Properties readOne(@PathVariable long id ) {
            return service.getProperty(id);
        }

        @PostMapping("/add")
        public Properties add(@RequestBody Properties newAddr){
            return this.service.createProperty(newAddr);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable long id ) {
            service.deleteProperty(id);
        }

    @PutMapping ("/update/{id}")
    public Properties updateProperty (@PathVariable long id, @RequestBody Properties properties ){
        return this.service.updateProperty(id, properties );


    }
    }
