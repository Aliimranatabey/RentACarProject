package com.finalProject.rentAcar.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.finalProject.rentAcar.entity.Car;

    public interface CarRepository extends JpaRepository<Car,Long> {
        
    
}