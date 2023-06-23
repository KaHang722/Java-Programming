package assignment4;

public abstract class TwoDShape extends Shape implements Drawable{
	double area;
	
	TwoDShape(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return this.name +" a 2D shape, its area is "+ this.area;
	}
}