package assignment4;

public abstract class Shape{
	String name;
	
	Shape(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return this.name+ " is a shape";
	}
}