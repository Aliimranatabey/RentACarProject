package com.finalProject.rentAcar.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalProject.rentAcar.entity.Rent;
import com.finalProject.rentAcar.service.RentService;

@RestController
@RequestMapping("/rent")
public class RentController {
    
    @Autowired
    RentService rentService;

    @GetMapping("/getRents")
    public ResponseEntity<List<Rent>> getCars(){
        return new ResponseEntity<List<Rent>>( rentService.findAll(), HttpStatus.OK);
    }
    

    @PostMapping("/addRents")
    void addRent(@RequestBody Rent rent){
        rentService.saveRent(rent);
    }

    // @GetMapping("/rents")
    // Rent readRent(@PathVariable Long id){
    //     return rentService.findById(id);
    // }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id){
        return new ResponseEntity<String>(rentService.delete(id) , HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateRent(@PathVariable Long id, @RequestBody Rent rent){
        return new ResponseEntity<String>(rentService.update(rent) , HttpStatus.OK);
    }
    
}
