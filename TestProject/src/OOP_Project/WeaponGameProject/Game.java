package OOP_Project.WeaponGameProject;

import java.util.*;
public class Game {
	
	
	{
		System.out.println("===Game Has Started===");
	}
	
	public  Weapon   selectWeapon() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score = scanner.nextInt();
		if(score<=400) {
			System.out.println("You got Knife!");
			Knife k = new Knife();
		return k;
		}else if(score<=800) {
			System.out.println("Press 1==>For Knife, 2==>For Gun");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("You have selected Knife!");
				return new Knife();
			case 2:
				System.out.println("You have selected Gun");
				return new Gun();
			default:
				System.out.println("This is Invalid Choice!");
				return selectWeapon();
			}
		}
		else {
			System.out.println("Press 1==>For Knife, 2==>For Gun, 3==>For Bomb");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("You have selected Knife!");
				return new Knife();
			case 2:
				System.out.println("You have selected Gun");
				return new Gun();
			case 3:
				System.out.println("You have selected Bomb");
				return new Bomb();
			default:
				System.out.println("This is Invalid Choice!");
				return selectWeapon();
			}
		}
	}

}