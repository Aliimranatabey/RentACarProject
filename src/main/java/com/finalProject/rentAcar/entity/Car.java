package com.finalProject.rentAcar.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private long id;

    @Column(length = 255)
	private String brand;

    @Column(length = 255)
	private String model;

    @Column(length = 255)
	private int price;

    @Column(length = 255)
	private short year;

    @Column(length = 255)
    private int kilometer;

    @Column(length = 255)
    private String fuel;

    @Column(length = 255)
    private String gear;

    @Column(length = 255)
    private String caseType;

    @Column(length = 255)
    private String location;
}
