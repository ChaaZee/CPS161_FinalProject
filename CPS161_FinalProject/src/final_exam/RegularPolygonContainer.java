package final_exam;

public class RegularPolygonContainer extends Container {
	 private double side;
	 private int numSides;
	
	 RegularPolygonContainer(double height, double side, int numSides) {
	     super(height);
	     this.side = side;
	     this.numSides = numSides;
	 }
	 
	 public double getTopArea() {
		 return numSides * side * side / ( 4*Math.tan(Math.PI/numSides));
	 }
	 
	 public double getTopPerimeter() {
		 return numSides * side;
	 }
	}
