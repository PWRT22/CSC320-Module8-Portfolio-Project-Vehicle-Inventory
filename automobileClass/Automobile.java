package automobileClass;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Automobile {
	//Variables that contain a car information.
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	private String vinNumber;
	
	//Method to Print on the display the car information.
	public void printCarInformation() {
		System.out.println("Car Make: " + make);
		System.out.println("Car Model: " + model);
		System.out.println("Car Color: " + color);
		System.out.println("Car Mileage: " + mileage);
		System.out.println("Car Vin Number: " + vinNumber);
	}
	
	//Default constructor.
	public Automobile() {
		make = "";
		model = "";
		color = "";
		year = 0;
		mileage = 0;
		vinNumber = "";
	}
	

	// Creating a constructor for the car information.
	public Automobile(String make, String model, String color, int year, int mileage, String vinNumber) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
		this.vinNumber = vinNumber;
	}
	
	//Method to remove a car information if information matches existing car information.
	public String removeCar(){
		try {
				make = null;
				model = null;
				color = null;
				year = 0;
				mileage = 0;
				vinNumber = null;
				
				return "Car has been removed";
				
		} catch (Exception e) {
			return "Car information does not exist. Unable to retrieve for removal: " + e.getMessage();
		}
		
	}
	
	//Method to add a new car to the inventory
	public String addNewCar(String newCarMake, String newCarModel, String newCarColor, int newCarYear, int newCarMileage, String newCarVinNumber) {
		try {
			make = newCarMake;
			model = newCarModel;
			color = newCarColor;
			year = newCarYear;
			mileage = newCarMileage;
			vinNumber = newCarVinNumber;
			
			return "Car added to inventory successfully";
		} catch (Exception e) {
			return "Failed to add vehicle to inventory: " + e.getMessage();
		}
			
	}
	
	//Method to display list of vehicle information
	public String[] listCarInformation() {
		try {
			String[] carInformation = {make, model, color, String.valueOf(year), String.valueOf(mileage), vinNumber};
			return carInformation;
		} catch (Exception e) {
			return new String[] {"Failed to retrieve and display vehicle information: " +e.getMessage()};
		}
	}
	
	//Update car description/attributes method
	public String updateCarAttributes(String updateMake, String updateModel, String updateColor, int updateYear, int updateMileage, String updateVinNumber) {
		try {
			make = updateMake;
			model = updateModel;
			color = updateColor;
			year = updateYear;
			mileage = updateMileage;
			vinNumber = updateVinNumber;
			
			return "Car Attributes updated successfully.";
		} catch (Exception e) {
			return "Failed to update car attributes: " + e.getMessage();
		}
	}
		
}



