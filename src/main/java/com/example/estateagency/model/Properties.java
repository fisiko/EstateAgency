package com.example.estateagency.model;

import jakarta.persistence.*;

@Entity
public class Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long property_id;
    String address;
    String postcode;
    String price;
    String status;
    String type;
    String bedrooms;
    String bathrooms;
    String garden;


    @JoinColumn(name = "seller_id_fk")
    @ManyToOne
    private Sellers sellers;

    public Properties() {
    }



    public long getId() {
        return property_id;
    }

    public void setId(long id) {
        this.property_id = id;
    }

    public Properties(long property_id, String address, String postcode, String price, String status, String type, String bedrooms, String bathrooms, String garden, String seller_id_fk, Sellers sellers) {
        this.property_id = property_id;
        this.address = address;
        this.postcode = postcode;
        this.price = price;
        this.status = status;
        this.type = type;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.garden = garden;
        this.sellers = sellers;
    }



    public long getProperty_id() {
        return property_id;
    }

    public void setProperty_id(long property_id) {
        this.property_id = property_id;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(String bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }


    public Sellers getSellers() {
        return sellers;
    }

    public void setSellers(Sellers sellers) {
        this.sellers = sellers;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "property_id=" + property_id +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", price='" + price + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", bedrooms='" + bedrooms + '\'' +
                ", bathrooms='" + bathrooms + '\'' +
                ", garden='" + garden + '\'' +
                ", sellers=" + sellers +
                '}';
    }
}

