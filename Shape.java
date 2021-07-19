
public abstract class Shape {
	//impelent square, rectangle, triangle, cirle
	float length, width, radius;
	abstract float getArea();
	abstract float getPerimeter();
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getradius() {
		return radius;
	}
	public void setradius(float radius) {
		this.radius = radius;
	}
	
	
	
	
	
}
