package com.rocketpowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@AllArgsConstructor
@Data
public class CarController {
	
	
	@Autowired
	CarRepository repository;

	@GetMapping("/car")
	public List<Car> getAllCars(){
		return repository.findAll();
		
	}
	@GetMapping("/car/{id}")
	public Car getCarById(@PathVariable Long id) {
		return repository.findById(id).get();
		
	}
	
	
	@PostMapping("/car")
	public Car saveCar(@RequestBody Car car) {
		return repository.save(car);
	}
	
	
	@DeleteMapping("/car/{id}")
	public void deleteCar(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
	 @PutMapping("/car")
	    public Car updateCar(@RequestBody Car car){
	        return repository.save(car);
	    }
	
	
}
