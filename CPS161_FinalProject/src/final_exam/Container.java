package final_exam;

public abstract class Container {
	 private double height;
	 
	 Container(double height) {
	     this.height = height;
	 }
	 
	 abstract double getTopArea();
	 abstract double getTopPerimeter();

	 double getVolume() {
	     return height * getTopArea();
	 }
	 
	 double getSurfaceArea() {
	     return 2*getTopArea() + height * getTopPerimeter();
	 }
	}