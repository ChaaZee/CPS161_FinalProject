package final_exam;

public class ContainerCollection {
	 private Container[] collection;
	 private int maxNumContainers;
	 private int containerCount = 0;

	 ContainerCollection(int maxNumContainers) {
	     this.maxNumContainers = maxNumContainers;
	     collection = new Container[maxNumContainers];
	 }

	 void addContainer(Container c) {
	     // Fill in details
	     // Don't forget to check to see if there is enough room
	     // in collection before adding.  Complain if you can't add Container.
		 if(containerCount < collection.length) {
			 collection[containerCount] = c;
			 containerCount += 1;
		 } else {
			 System.out.println("Can't add container. Full.");
		 }
	 }

	 double getTotalVolume() {
	     // Fill in details to return the total volume of
	     // all Containers in collection
		 double volume = 0;
		 for(int i = 0; i < collection.length; i++) {
			 if(collection[i] != null) {
				 volume += collection[i].getVolume();
			 }
		 }
		 return volume;
	 }

	 double getTotalSurfaceArea() {
	     // Fill in details to return the total surface area of
	     // all Containers in collection
		 double surfaceArea = 0;
		 for(int i = 0; i < collection.length; i++) {
			 if(collection[i] != null) {
				 surfaceArea += collection[i].getSurfaceArea();
			 }
		 }
		 return surfaceArea;
	 }
	public static void main(String[] args) {
		ContainerCollection cc = new ContainerCollection(10);

	     cc.addContainer(new CircularContainer(10., 2.0)); // height, radius
	     cc.addContainer(new RectangularContainer(10., 2.0, 3.0)); // height, width, length
	     cc.addContainer(new TriangularContainer(10., 4.0, 3.0, 5.0)); // height, side_a, side_b, side_c
	     cc.addContainer(new RegularPolygonContainer(10., 1.0, 4)); // height, side, num_sides


	     cc.addContainer(new CircularContainer(5., 2.0)); // height, radius
	     cc.addContainer(new RectangularContainer(5., 2.0, 3.0)); // height, width, length
	     cc.addContainer(new TriangularContainer(5., 4.0, 3.0, 5.0)); // height, side_a, side_b, side_c
	     cc.addContainer(new RegularPolygonContainer(5., 1.0, 4)); // height, side, num_sides


	     cc.addContainer(new CircularContainer(2., 2.0)); // height, radius
	     cc.addContainer(new RectangularContainer(2., 2.0, 3.0)); // height, width, length
	     cc.addContainer(new TriangularContainer(2., 4.0, 3.0, 5.0)); // height, side_a, side_b, side_c
	     cc.addContainer(new RegularPolygonContainer(2., 1.0, 4)); // height, side, num_sides

	     System.out.println();
	     
	     System.out.println("Total Volume of all containers = " + cc.getTotalVolume());
	     System.out.println("Total Surface Area of all containers = " + cc.getTotalSurfaceArea());

	     System.out.println();
	     
	   // Container of Rectangular Prisms
	     ContainerCollection ccRect = new ContainerCollection(4);
	     ccRect.addContainer(new RectangularContainer(5.123456, 2.0, 3.0)); // height, width, length
	     ccRect.addContainer(new RectangularContainer(9., 2.0, 3.0)); // height, width, length
	     ccRect.addContainer(new RectangularContainer(8., 2.0, 3.0)); // height, width, length
	     System.out.println("Total Volume of all containers for ccRect = " + ccRect.getTotalVolume());
	     System.out.println("Total Surface Area for ccRect = " + ccRect.getTotalSurfaceArea());
	     
	     System.out.println();
	     
	   // Container of Circular  Prisms
	     ContainerCollection ccCirc = new ContainerCollection(4);
	     ccCirc.addContainer(new CircularContainer(1., 1.0)); // height, width, length
	     ccCirc.addContainer(new CircularContainer(10., 10.0)); // height, width, length
	     System.out.println("Total Volume of all containers for ccCirc = " + ccCirc.getTotalVolume());
	     System.out.println("Total Surface Area for ccCirc = " + ccCirc.getTotalSurfaceArea());
	     
	     System.out.println();
	     
	   // Container of Triangular Prisms
	     ContainerCollection ccTri = new ContainerCollection(4);
	     ccTri.addContainer(new TriangularContainer(1., 2.0, 2.0, 3.0)); // height, width, length
	     ccTri.addContainer(new TriangularContainer(2., 1.0, 1.0, 1.0)); // height, width, length
	     System.out.println("Total Volume of all containers for ccTri = " + ccTri.getTotalVolume());
	     System.out.println("Total Surface Area for ccTri = " + ccTri.getTotalSurfaceArea());
	     
	     System.out.println();
	     
	   // Container of Regular Polygon Prisms
	     ContainerCollection ccPoly = new ContainerCollection(4);
	     ccPoly.addContainer(new RegularPolygonContainer(2., 1.0, 4)); // height, width, length
	     ccPoly.addContainer(new RegularPolygonContainer(2., 2.0, 3)); // height, width, length
	     ccPoly.addContainer(new RegularPolygonContainer(2., 3.0, 5)); // height, width, length
	     System.out.println("Total Volume of all containers for ccPoly = " + ccPoly.getTotalVolume());
	     System.out.println("Total Surface Area for ccPoly = " + ccPoly.getTotalSurfaceArea());

	}

}

/*

Output:

Can't add container. Full.
Can't add container. Full.

Total Volume of all containers = 420.6283004441059
Total Surface Area of all containers = 763.0265241302609

Total Volume of all containers for ccRect = 132.740736
Total Surface Area for ccRect = 257.23456

Total Volume of all containers for ccCirc = 3144.734246243383
Total Surface Area for ccCirc = 1269.2034320502764

Total Volume of all containers for ccTri = 2.8503388870828816
Total Surface Area for ccTri = 17.834652370381324

Total Volume of all containers for ccPoly = 36.43269482573916
Total Surface Area for ccPoly = 86.43269482573916

*/
