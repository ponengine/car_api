package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Car;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car,Long>{

	Optional<Car> findByBrand(@Param("brand") String brand);
	
	Optional<Car> findByColor(@Param("color") String color);
	
	Optional<Car> findByYear(int year);
	
	Optional<Car> findByBrandAndModel(String brand, String model);
	
	Optional<Car> findByBrandOrColor(String brand, String color);
	
	Optional<Car> findByBrandOrderByYearAsc(String brand);
	
	Optional<Car> findByBrandEndsWith(String brand);
	
}
