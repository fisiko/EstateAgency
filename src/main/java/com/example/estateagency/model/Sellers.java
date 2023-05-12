package com.example.estateagency.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Sellers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seller_id;
    private String firstName;
    private String lastName;
    private String email;

    private String address;

    private String postcode;

    private String phone;

//    @ManyToOne
//    private Properties property;

    @OneToMany(mappedBy = "sellers", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Properties> propertiesList;

    public long getSeller_id() {
        return seller_id;
    }

    public Sellers(long id, String firstName, String lastName, String email, String address, String postcode, String phone, List<Properties> propertiesList) {
        this.seller_id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.propertiesList = propertiesList;
    }

    public Sellers(long id, String firstName, String lastName, String email, String address, String postcode, String phone) {
        this.seller_id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public List<Properties> getPropertiesList() {
        return propertiesList;
    }

    public void setPropertiesList(List<Properties> propertiesList) {
        this.propertiesList = propertiesList;
    }

    public Sellers() {
    }
    public Sellers(long id) {
        this.seller_id = id;
    }

    public void setSeller_id(long id) {
        this.seller_id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Sellers{" +
                "id=" + seller_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", postcode=" + postcode +
                ", phone=" + phone +
                ", propertiesList=" + propertiesList +
                '}';
    }
}
