package assignment4;

public abstract class ThreeDShape extends Shape implements Holdable{
	double weight;
	
	ThreeDShape(String name, double weight){
		super(name);
		this.weight=weight;
	}
		
	public void hold() {
		if (weight<25) {
			System.out.println("This " +this.name+"'s weight is "+this.weight+", it is holdable");
		}else {
			System.out.println("This " +this.name+"'s weight is "+this.weight+", it is not holdable");
		}
	}
	
	public abstract double calculateVolume();

	@Override
	public String toString() {
		return this.name + " is a 3D shape, its weight is " + this.weight;
	}
}