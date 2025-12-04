package OOP_Project.ShapeBasedProject;

public class Circle {
double r;
	
	Circle(){
		
	}
	Circle(double r){
		if(r>0)
			this.r=r;
		else
			System.out.println("Invalid Radius Entered!");
	}
	public String getDetails() {
		return "Radius is: "+r+" Unit";
	}
	public double getArea() {
		return Math.PI*r*r;
	}
	public double getPerimeter() {
		return 2*Math.PI*r;
	}
}
