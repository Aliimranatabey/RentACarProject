package com.finalProject.rentAcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalProject.rentAcar.entity.Rent;

public interface RentRepository extends JpaRepository<Rent,Long> {
    
}
