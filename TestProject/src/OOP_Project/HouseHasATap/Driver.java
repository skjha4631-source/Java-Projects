package OOP_Project.HouseHasATap;

public class Driver {
	public static void main(String[] args) {
		House h1=new House();
		System.out.println("House obj ref is: "+h1);
		System.out.println("House tap obj ref is: "+h1.t);
		Water w=h1.t.on();
		System.out.println("Water obj ref is: "+w);
		w.drink();
		h1.t.off();
	}
}
