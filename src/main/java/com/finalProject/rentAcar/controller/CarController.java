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

import com.finalProject.rentAcar.entity.Car;
import com.finalProject.rentAcar.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarService carService;

    // @GetMapping("/rentAcar/{id}")
    // Car readCar(@PathVariable Long id){
    //     return carService.findById(id);
    // }

    @GetMapping("/getCars")
    public ResponseEntity<List<Car>> getCars(){
        return new ResponseEntity<List<Car>>( carService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/rentAcar")
    void addCar(@RequestBody Car car){
        carService.saveCar(car);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id){
        return new ResponseEntity<String>(carService.delete(id) , HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCar(@PathVariable Long id, @RequestBody Car car){
        return new ResponseEntity<String>(carService.update(car) , HttpStatus.OK);
    }
}
