package com.finalProject.rentAcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.rentAcar.entity.Car;
import com.finalProject.rentAcar.repository.CarRepository;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Car findById(long id){
        Optional<Car> result =carRepository.findById(id);
        return result.get();
    }

    public String saveCar(Car car){
        carRepository.save(car);
        return "Added";
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }

    public String delete(long id) {
        carRepository.deleteById(id);
        return "Deleted";
    }

    public String update(Car car) {
        carRepository.saveAndFlush(car);
        return "Updated";
    }
}


