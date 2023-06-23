package assignment4;

public class Rectangle extends TwoDShape{
	double width;
	double height;
	
	Rectangle(String name, double width, double height){
		super(name);
		this.width=width;
		this.height=height;
		this.area=this.width*this.height;
	}

	@Override
	public void draw() {
		System.out.println("<< "+this.name+" >>");
		for(int i1 = 0; i1 <this.height+2; i1++){
			for(int i2 = 0; i2<this.width+1; i2++){
				if (i1 == 0 || i1== this.height+1) {
					if (i2<this.width)
						System.out.print("-"); 
					}else {
						if(i2 == 0|| i2== this.width){
							System.out.print("|"); 
						}else {
							System.out.print(" "); 
						}
					}
			}System.out.print("\n"); 
		}
	}

	@Override
	public String toString() {
		return this.name+ " is a 2D shape : Rectangle ,its area is " + this.area;
	}
}