package com.finalProject.rentAcar.controller;

import java.util.List;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finalProject.rentAcar.entity.Rent;
import com.finalProject.rentAcar.service.RentService;

@RestController
public class RentController {
    
    @Autowired
    private RentService rentService;

    @GetMapping("/rents")
    List<Rent> all(){
            return rentService.findAll();
        }
    

    @PostMapping("/rents")
    void addRent(@RequestBody Rent rent){
        rentService.saveRent(rent);
    }

    // @GetMapping("/rents")
    // Rent readRent(@PathVariable Long id){
    //     return rentService.findById(id);
    // }

    @DeleteMapping("/rents")
    public void deleteRent(@RequestParam("id") Long id){
        rentService.delete(id);
    }

    // @PutMapping("/rents")
    // public void updateRent(@RequestBody Rent rent){
    //     rentService.updateRent(rent);
    // }
    
}
