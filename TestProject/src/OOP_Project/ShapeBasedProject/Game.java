package OOP_Project.ShapeBasedProject;

import java.util.Scanner;
public class Game {
	Game(){
		System.out.println("=========Game Has Started==========");
	}
	
	public void selectOption() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Select From Below Options: ");
		System.out.println("1===> For Circle");
		System.out.println("2===> For Rectangle");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle!");
			System.out.println("Enter the Radius: ");
			double r=sc.nextDouble();
			Circle c1=new Circle(r);
			System.out.println(c1.getDetails());
			System.out.println("Area is: "+c1.getArea()+" Sq. Unit");
			System.out.println("Perimeter is: "+c1.getPerimeter()+" Unit");
		}else if(choice==2) {
			System.out.println("You have selected Rectangle!");
			System.out.println("Enter the length: ");
			double l=sc.nextDouble();
			System.out.println("Enter the Width: ");
			double w=sc.nextDouble();
			Rectangle r1=new Rectangle(l,w);
			System.out.println(r1.getDetails());
			System.out.println("Area is: "+r1.getArea()+" Sq. Unit");
			System.out.println("Perimeter is: "+r1.getPerimeter()+" Unit");
		}else {
			System.out.println("Invalid Option! Plese select from valid Options!");
		}
		
		System.out.println("Press Y/y==>To Continue or any other character to Exit!");
		char c=sc.next().charAt(0);
		if(c=='Y' || c=='y')
			selectOption();
		else
			return;
			
	}
}
