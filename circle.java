
public class circle extends Shape {

	circle(float radius){
		length = 0;
		width = 0;
		this.radius = radius;
	}
	
	@Override
	float getArea() {
		return (float) (3.14 * radius * radius);
	}

	@Override
	float getPerimeter() {
		return (float) (radius * 2 * 3.14);
	}

	
}
