package assignment4;

public class Line extends TwoDShape{
	int length;
	
	Line(String name, int length){
		super(name);
		this.length=length;
		this.area=0;
	}

	@Override
	public void draw() {
		System.out.println("<< "+this.name+" >>");
		for(int i=0; i<this.length; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

	@Override
	public String toString() {
		return this.name+ " is a 2D shape : Line, its length is "+ this.length;
	}
}