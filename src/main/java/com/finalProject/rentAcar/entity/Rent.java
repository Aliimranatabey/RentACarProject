package com.finalProject.rentAcar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "identificationNumber", nullable = false)
    private Long identificationNumber;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "gender", nullable = false)
    private boolean gender;

    @ManyToOne()
    @JoinColumn(name = "car_id")
    private Car car;

    
}
