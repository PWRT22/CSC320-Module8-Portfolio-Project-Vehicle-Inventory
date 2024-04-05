package automobileClass;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutoInventory{
	//Text File generation method
	public static void printReport(String[] carInformation) {
		try {
			FileWriter writer = new FileWriter("AutoReport.txt");
			for (String details : carInformation) {
				writer.write(details + "\n");
			}
			writer.close();
			System.out.println("Report Generated");
		} catch (IOException e) {
			System.out.println("Unable to generate report: " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Call Automobile class with parameters
		Automobile car = new Automobile("Hyundai", "Elantra", "Electric Blue", 2017, 68500, "1G2WK52J93F111157");
		
		//List Car inventory information
		String[] carInformation = car.listCarInformation();
		System.out.println("Vehicle Details: ");
		for (String details : carInformation) {
			System.out.println(details);
		}
		
		//Remove vehicles by calling removeCar method
		System.out.println(car.removeCar());
		
		//Add new car to the inventory
		System.out.println(car.addNewCar("Nissan", "Rogue", "White Pearl", 2018, 56780, "3VWJP7AT5CM602599"));
		
		//Print the new car information on the display
		carInformation = car.listCarInformation();
		System.out.println("New Vehicle Details: ");
		for (String details : carInformation) {
			System.out.println(details);
		}
		
		//Update an attribute of the newly added vehicle
		System.out.println(car.updateCarAttributes("Nissan", "Rogue", "Midnight Black", 2018, 56780,"3VWJP7AT5CM602599"));
	
	
		//Print the updated attribute on the screen
		carInformation = car.listCarInformation();
		System.out.println("New Vehicle Details: ");
		for (String details : carInformation) {
			System.out.println(details);
		}
		
		//Ask the user if a printed report is required
		System.out.println("Do you wish to print the car information to a text file? (Y/N)");
		String userAnswer = scanner.next();
		
		if (userAnswer.equalsIgnoreCase("Y")) {
			printReport(carInformation);
		} else if (userAnswer.equalsIgnoreCase("N")) {
			System.out.println("The report will not be printed into a text file.");
		} else {
			System.out.println("Invalid entry. No report generated");
		}
		
		//Close the scanner object to save program resources
		scanner.close();
		
	}
}
