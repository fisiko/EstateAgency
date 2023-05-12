package com.example.estateagency.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Buyers {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long buyer_id;
    private String firstName;
    private String lastName;

    private String email;

    private String address;

    private String postcode;

    private String phone;

    @OneToMany(mappedBy = "buyers", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Properties> propertiesList;

    public long getBuyer_id() {
        return buyer_id;
    }

    public Buyers(long buyer_id, String firstName, String lastName, String email, String address, String postcode, String phone, Buyers buyers) {
        this.buyer_id = buyer_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
    }

    public Buyers(long buyer_id, String firstName, String lastName, String email, String address, String postcode, String phone, List<Properties> propertiesList) {
        this.buyer_id = buyer_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.propertiesList = propertiesList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Properties> getPropertiesList() {
        return propertiesList;
    }

    public void setPropertiesList(List<Properties> propertiesList) {
        this.propertiesList = propertiesList;
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

    public Buyers() {
    }

    public void setBuyer_id(long id) {
        this.buyer_id = id;
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
        return "Buyers{" +
                "id=" + buyer_id +
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
