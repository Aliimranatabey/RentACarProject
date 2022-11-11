package com.finalProject.rentAcar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finalProject.rentAcar.entity.Car;
import com.finalProject.rentAcar.service.CarService;

@RestController
public class CarController {
    @Autowired
    CarService carService;

    // @GetMapping("/rentAcar/{id}")
    // Car readCar(@PathVariable Long id){
    //     return carService.findById(id);
    // }

    @GetMapping("/rentAcar")
    List<Car> all() {
    return carService.findAll();
    }

    @PostMapping("/rentAcar")
    void addCar(@RequestBody Car car){
        carService.saveCar(car);
    }

    @DeleteMapping("/rentAcar")
        public void deleteCar(@RequestParam("id") Long id) {
        carService.delete(id);
    }

    // @PutMapping(value = "/schools/{textId}")
    //         public Car updateCar(@PathVariable Long textId, @RequestBody Car
    //         car) {
    //         return carService.updateCar(textId, car);
    //         }
}
