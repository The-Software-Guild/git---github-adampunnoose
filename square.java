
public class square extends Shape {

	
	square(float length){
		this.length = length;
		width = 0;
		radius = 0;
		
	}
	public float getArea() {
		return length * length;
	}
	public float getPerimeter() {
		return 4*length;
	}
	
}
