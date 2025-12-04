package OOP_Project.ShapeBasedProject;

public class Rectangle {
double l,w;
	
	Rectangle(){
		
	}
	Rectangle(double l, double w){
		if(l>0 && w>0) {
			this.l=l;
			this.w=w;
		}else if(l>0) {
			this.l=l;
			System.out.println("Invalid Width Entered!");
		}else if(w>0) {
			this.w=w;
			System.out.println("Invalid Length Entered");
		}
		else
			System.out.println("Invalid Length and Width Entered!");
	}
	public String getDetails() {
		return "Length is: "+l+" Unit and Width is: "+w+" Unit";
	}
	public double getArea() {
		return l*w;
	}
	public double getPerimeter() {
		return 2*(l+w);
	}
}
