package OOP_Project.VehicleProject;

import java.util.Scanner;
public class User {
	 public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        System.out.println("Press 1==>For New Game");
        System.out.println("Press 1==>For Settings");
        System.out.println("Press 3==>For Exit");
        int choice=sc.nextInt();
        switch(choice) {
        case 1: 
			System.out.println("You have selected New Game");
			Game game=new Game();
			Vehicle vehicle=game.selectVehicle();
			vehicle.startRace();
			break;
		case 2:
			System.out.println("You have selected Settings");
			break;
		case 3:
			System.out.println("You have selected Exit");
			System.exit(0);
		default:
			System.out.println("Invalid Selection");
        }
        System.out.println("Thank you for playing the game");
	}

}
