package hausaufgaben1;

public class Test {
	public static void main(String[] args) {

	Shape[] objects= new Shape[1];
	objects[0]= new Square(2);
	
	for(Shape shp: objects) {
		System.out.print(shp);
	}
	
	
	}
}