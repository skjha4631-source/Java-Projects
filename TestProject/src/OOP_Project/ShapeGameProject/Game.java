package OOP_Project.ShapeGameProject;


import java.util.*;
public class Game {
	static Scanner sc=new Scanner(System.in);
	
	{
		System.out.println("=====Game Has Started=====");
	}
	
	public void start() {
		System.out.println("Press 1 ===>For 2D Shape");
		System.out.println("Press 2 ===>For 3D Shape");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected 2D Shape");
			TwoDShape t1= selectTwoDShape();
			System.out.println("Area is: "+t1.getArea());
			System.out.println("Perimeter is: "+t1.getPerimeter());
		}else if(choice==2) {
			System.out.println("You have selected 3D Shape");
			ThreeDShape t1= selectThreeDShape();
			System.out.println("Volume is: "+t1.getVolume());
			System.out.println("LSA is: "+t1.getLateralSurfaceArea());
			System.out.println("TSA is: "+t1.getTotalSurfaceArea());
		}
		else {
			System.out.println("Invalid choice entered! Select from valid options!");
			start();
		}
		
	}
	
	public  TwoDShape    selectTwoDShape() {
		System.out.println("Press 1 ===>For Circle");
		System.out.println("Press 2 ===>For Rectangle");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter the Radius: ");
			double r=sc.nextDouble();
			return new Circle(r);
		}else if(choice==2) {
			System.out.println("You have selected Rectangle");
			System.out.println("Enter the Length: ");
			double l=sc.nextDouble();
			System.out.println("Enter the Width: ");
			double w=sc.nextDouble();
			return new Rectangle(l,w);
		}else {
			System.out.println("Invalid choice entered! Select from valid options!");
			return selectTwoDShape();
		}
		
		
	
	}
	public  ThreeDShape    selectThreeDShape() {
		System.out.println("Press 1 ===>For Sphere");
		System.out.println("Press 2 ===>For Cylinder");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Sphere");
			System.out.println("Enter the Radius: ");
			double r=sc.nextDouble();
			return new Sphere(r);
		}else if(choice==2) {
			System.out.println("You have selected Cylinder");
			System.out.println("Enter the Radius: ");	
			double r=sc.nextDouble();
			System.out.println("Enter the Height: ");
			double h=sc.nextDouble();
			return new Cylinder(r,h);
			
		}else {
			System.out.println("Invalid choice entered! Select from valid options!");
			return selectThreeDShape();
		}	
	}

}