package OOP_Project.ShapeGameProject;

import java.util.*;
public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Shape Game!");
		System.out.println("In this game, you will learn about different shapes and their properties.");
		System.out.println("Let's get started!");
		do {
			System.out.println("Press 1 to Start or any other number to Exit");
			int choice=sc.nextInt();
			if(choice==1) {
				Game g=new Game();
				g.start();
			}
			else {
				System.out.println("======Game Ends======");
				System.exit(1);
			}
		}while(true);
		
	}

}
