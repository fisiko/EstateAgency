package com.example.estateagency.controller;

import com.example.estateagency.model.Bookings;
import com.example.estateagency.repo.BookingRepo;
import com.example.estateagency.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/booking")
public class BookingController {


    @Autowired
    BookingRepo mRepo;
    @Autowired
    BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @GetMapping("/read")
    public List<Bookings> read() {
        return service.getAll();
    }

    @GetMapping("/read/{id}")
    public Bookings readOne(@PathVariable long id) {
        return service.getBooking(id);
    }

    @PostMapping("/add")
    public Bookings add(@RequestBody Bookings newAddr) {
        return this.service.createBooking(newAddr);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        service.deleteBooking(id);
    }

    @PutMapping("/update/{id}")
    public Bookings updateProperty(@PathVariable long id, @RequestBody Bookings bookings) {
        return this.service.updateBooking(id, bookings);


    }
}
