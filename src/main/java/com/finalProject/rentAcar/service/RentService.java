package com.finalProject.rentAcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.rentAcar.entity.Rent;
import com.finalProject.rentAcar.repository.RentRepository;

@Service
public class RentService {
    
    @Autowired
    private RentRepository rentRepository;

    public Rent findById(long id){
        Optional<Rent> result = rentRepository.findById(id);
        return result.get();
    }

    public String saveRent(Rent rent){
        rentRepository.save(rent);
        return "Added";
    }

    public List<Rent> findAll(){
        return rentRepository.findAll();
    }

    public String delete(long id){
        rentRepository.deleteById(id);
        return "Deleted";
    }

    public String update(Rent rent){
        rentRepository.saveAndFlush(rent);
        return "Updated";
    }
}
