package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@RestController
public class CarController {

	@Autowired
	private CarRepository carRepository;
	
	@GetMapping("/cars")
	public Iterable<Car> getCars(){
		return carRepository.findAll();
	}
}
