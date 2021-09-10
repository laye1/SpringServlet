package com.saraya.car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
	
	
	
	private static List<Car> listCars = new ArrayList<>();
	
	
	static {
		
		listCars.add(new Car("BMW","B2010","the descriptions","5000$"));
		listCars.add(new Car("Ranger","R2020","the descriptions","10000$"));
		
	}
	
	public List<Car>  showCars( ){
		
		
		
		return  listCars;
		
		}
		
	
	public void addCars(Car car) {
		  
	listCars.add(car);
		
		
	}
	
   public void deleteCar(Car car) {
		  
		
		listCars.remove((car));
	
		
		
	}

}
