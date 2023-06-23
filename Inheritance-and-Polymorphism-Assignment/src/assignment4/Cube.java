package assignment4;

public class Cube extends ThreeDShape{
	double edge;
	
	Cube (String name, double weight, double edge){
		super(name, weight);
		this.edge=edge;
	}

	@Override
	public double calculateVolume() {
		double volume;
		volume=Math.pow(this.edge, 3);
		return volume;
	}
	
	@Override
	public String toString() {
		return this.name+" is a 3D shape : Cube, its volume is " +calculateVolume();
	}
}