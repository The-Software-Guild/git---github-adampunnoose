
public class rectangle extends Shape {
	rectangle(float length, float width){
		this.length = length;
		this.width = width;
		radius = 0;
	}

	@Override
	float getArea() {
		return length * width;
	}

	@Override
	float getPerimeter() {
		return 2 * length + 2 * width;
	}
	
	
	
	
}
