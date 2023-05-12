package com.example.estateagency.service;

import com.example.estateagency.model.Buyers;
import com.example.estateagency.model.Properties;
import com.example.estateagency.repo.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepo repo;

    public PropertyService(PropertyRepo repo){
        this.repo = repo;
    }
    public PropertyService(){

    }

    public List<Properties> getAll() {
        return this.repo.findAll();
    }


    public Properties getProperty(Long id) {

        return this.repo.findById(id).get();

    }


    public Properties createProperty (Properties prop){

        return this.repo.save(prop);

    }

    public Properties deleteProperty (long id){
        Properties removed = this.getProperty(id);
        this.repo.deleteById(id);
        return removed;

    }

    public Properties updateProperty (long id, Properties property)    {

        Properties toUpdate = this.getProperty(id);
        if (property.getAddress()!=null) toUpdate.setAddress(property.getAddress());
        if (property.getPostcode()!=null) toUpdate.setPostcode(property.getPostcode());
        if (property.getPrice()!=null) toUpdate.setPrice(property.getPrice());
        if (property.getStatus()!=null) toUpdate.setStatus(property.getStatus());
        if (property.getType()!=null) toUpdate.setType(property.getType());
        if (property.getBathrooms()!=null) toUpdate.setBathrooms(property.getBathrooms());
        if (property.getBedrooms()!=null) toUpdate.setBedrooms(property.getBedrooms());
        if (property.getGarden()!=null) toUpdate.setGarden(property.getGarden());
        //if (property.getSeller_id_fk()!=null) toUpdate.setAddress(property.getAddress());
        if (property.getSellers()!=null) toUpdate.setSellers(property.getSellers());

        return this.repo.save(toUpdate);

    }


}
