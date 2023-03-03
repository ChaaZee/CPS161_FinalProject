package final_exam;

public class RectangularContainer extends Container {
	 private double width;
	 private double length;
	
	 RectangularContainer(double height, double width, double length) {
	     super(height);
	     this.width = width;
	     this.length = length;
	 }
	 
	 public double getTopArea() {
		 return width * length;
	 }
	 
	 public double getTopPerimeter() {
		 return 2.0 * (width + length);
	 }
}
