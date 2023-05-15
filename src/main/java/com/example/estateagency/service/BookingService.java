package com.example.estateagency.service;

import com.example.estateagency.model.Bookings;
import com.example.estateagency.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepo repo;

    public BookingService(BookingRepo repo){
        this.repo = repo;
    }
    public BookingService(){

    }

    public List<Bookings> getAll() {
        return this.repo.findAll();
    }


    public Bookings getBooking(Long id) {
        return this.repo.findById(id).get();
    }


    public Bookings createBooking (Bookings book){
        return this.repo.save(book);

    }

    public Bookings deleteBooking (long id){
        Bookings removed = this.getBooking(id);
        this.repo.deleteById(id);
        return removed;

    }

    public Bookings updateBooking (long id, Bookings booking)    {

        Bookings toUpdate = this.getBooking(id);

        if (booking.getTimeslot()!=null) toUpdate.setTimeslot(booking.getTimeslot());
        //if (property.getSeller_id_fk()!=null) toUpdate.setAddress(property.getAddress());
        if (booking.getProperties()!=null) toUpdate.setProperties(booking.getProperties());
        if (booking.getBuyers()!=null) toUpdate.setBuyers(booking.getBuyers());

        return this.repo.save(toUpdate);

    }


}
