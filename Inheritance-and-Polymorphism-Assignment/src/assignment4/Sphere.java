package assignment4;

public class Sphere extends ThreeDShape{
	double radius;
	
	Sphere(String name, double weight, double radius){
		super(name, weight);
		this.radius=radius;
	}

	@Override
	public double calculateVolume() {
		double volume;
		volume = Math.PI*Math.pow(this.radius, 3)*4/3;
		return volume;
	}

	@Override
	public String toString() {
		return this.name+" is a 3D shape : Sphere, its volume is " +calculateVolume();
	}	
}