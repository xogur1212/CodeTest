class Shape{
	
	protected double area;

	

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}
	
	
}

class Circle extends Shape{

	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public void setArea(int radius) {
		this.area=radius*radius*3.14;
	}
	
	public double getArea() {
		return area;
	}
	
	
}
public class OverridingTest {

	public static void main(String[] args) {
	
		Shape s1= new Shape();
		s1.setArea(5);
		System.out.println(s1.toString());
		Circle c1= new Circle();
		c1.setArea(5);
		System.out.println(c1.toString());
	
	}
}
