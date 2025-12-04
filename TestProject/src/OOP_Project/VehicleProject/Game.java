package OOP_Project.VehicleProject;

import java.util.Scanner;

public class Game {
	//generate selectVehicle() feature
	public	Vehicle selectVehicle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>For Car");
		System.out.println("Press 2==>For Bike");
		System.out.println("Press 3==>For Bus");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("You have selected Car");
			Car car=new Car();
			return car;
			case 2:
				System.out.println("You have selected Bike");
				return new Bike();
			case 3:	
				System.out.println("You have selected Bus");
				return new Bus();
			default:
				System.out.println("Invalid Selection");
				return selectVehicle();		
		}
	}

}
