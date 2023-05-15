package com.example.estateagency.repo;


import com.example.estateagency.model.Bookings;
import com.example.estateagency.model.Properties;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepo extends CrudRepository<Bookings,Long> {
    List<Bookings> findAll();
}
