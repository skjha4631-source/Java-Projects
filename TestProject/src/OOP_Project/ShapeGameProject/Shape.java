package OOP_Project.ShapeGameProject;

public interface Shape {
	
	
	//java 8 feature: default method
	
	default void rotate() {
		System.out.println("The shape is rotating.");
		move();
	}
	
	default void resize() {
		System.out.println("The shape is resizing.");
		move();
	}

	default void display() {
		System.out.println("Displaying the shape.");
		move();
	}
	
	//java9 feature: private method
	private  void move() {
		System.out.println("The shape is moving.");
	}
	
	private static void printDetails() {
		System.out.println("Printing shape information.");
	}
	
	//java 8 feature: static method
	public static void test() {
		System.out.println("test shape");
		printDetails();
		
	}
	
	public static void info() {
		System.out.println("This is a shape.");
		printDetails();
	}
	
	
	

}
