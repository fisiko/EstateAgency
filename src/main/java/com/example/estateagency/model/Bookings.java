package com.example.estateagency.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Table (name= "bookings")
@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long booking_id;


//    @ManyToMany
//    @JoinTable(name = "bookings_properties",
//            joinColumns = @JoinColumn(name = "booking_id"),
//            inverseJoinColumns = @JoinColumn(name = "property_id"))
//    private Set<Properties> properties = new HashSet<>();
//
//    @ManyToMany
//    @JoinTable(name = "bookings_buyers",
//            joinColumns = @JoinColumn(name = "booking_id"),
//            inverseJoinColumns = @JoinColumn(name = "buyer_id"))
//    private Set<Buyers> buyers = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "property_id_fk")
    private Properties properties;

    @ManyToOne
    @JoinColumn(name = "buyer_id_fk")
    private Buyers buyers;


    @Column(name = "timeslot")
    private LocalDateTime timeslot;


    public Bookings() {
    }

    public Bookings(long booking_id, Properties properties, Buyers buyers, LocalDateTime timeslot) {
        this.booking_id = booking_id;
        this.properties = properties;
        this.buyers = buyers;
        this.timeslot = timeslot;
    }

    public long getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(long booking_id) {
        this.booking_id = booking_id;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties bookedProperties) {
        this.properties = bookedProperties;
    }

    public Buyers getBuyers() {
        return buyers;
    }

    public void setBuyers(Buyers bookedBuyers) {
        this.buyers = bookedBuyers;
    }

    public LocalDateTime getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(LocalDateTime timeslot) {
        this.timeslot = timeslot;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "booking_id=" + booking_id +
                ", properties=" + properties +
                ", buyers=" + buyers +
                ", timeslot=" + timeslot +
                '}';
    }

//    @JoinColumn(name = "property_id_fk")
//    @ManyToMany
//    private Set<Properties> property;
//
//    @JoinColumn(name = "buyer_id_fk")
//    @ManyToMany
//    private Set<Buyers> buyers;
//
//    private LocalDateTime  timeslot;
//
//
//    public Bookings() {
//    }
//
//    public Bookings(long booking_id, Set<Properties> property, Set<Buyers> buyers, LocalDateTime timeslot) {
//        this.booking_id = booking_id;
//        this.property = property;
//        this.buyers = buyers;
//        this.timeslot = timeslot;
//    }
//
//    public long getBooking_id() {
//        return booking_id;
//    }
//
//    public void setBooking_id(long booking_id) {
//        this.booking_id = booking_id;
//    }
//
//    public Set<Properties> getProperty() {
//        return property;
//    }
//
//    public void setProperty(Set<Properties> property) {
//        this.property = property;
//    }
//
//    public Set<Buyers> getBuyers() {
//        return buyers;
//    }
//
//    public void setBuyers(Set<Buyers> buyers) {
//        this.buyers = buyers;
//    }
//
//    public LocalDateTime getTimeslot() {
//        return timeslot;
//    }
//
//    public void setTimeslot(LocalDateTime timeslot) {
//        this.timeslot = timeslot;
//    }
//
//    @Override
//    public String toString() {
//        return "Bookings{" +
//                "booking_id=" + booking_id +
//                ", property=" + property +
//                ", buyers=" + buyers +
//                ", timeslot=" + timeslot +
//                '}';
//    }
}

