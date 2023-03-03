package final_exam;

public class CircularContainer extends Container {
    private double radius;
    
	CircularContainer(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	public double getTopArea() {
		return Math.PI * radius * radius;
	}
	
	public double getTopPerimeter() {
		return 2.0 * Math.PI * radius;
	}
 
}

