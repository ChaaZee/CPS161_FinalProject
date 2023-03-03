package final_exam;

public class TriangularContainer extends Container {
	 private double side_a;
	 private double side_b;
	 private double side_c;

	 TriangularContainer(double height, double side_a, double side_b, double side_c) {
	     super(height);
	     this.side_a = side_a;
	     this.side_b = side_b;
	     this.side_c = side_c;
	 }

	 public double getTopArea() {
		 double s = (side_a + side_b + side_c)/2.0;
		 return Math.sqrt(s*(s-side_a)*(s-side_b)*(s-side_c));
	 }
	 
	 public double getTopPerimeter() {
		 return side_a + side_b + side_c;
	 }
}
