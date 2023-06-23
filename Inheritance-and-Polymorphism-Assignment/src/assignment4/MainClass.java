package assignment4;

public class MainClass {

	public static void main(String[] args) {
		
		Drawable tdshaps[] = { 
				new Line("String ", 20) ,
				new Rectangle ("Window", 15,6),
				new Line("Charger Cord ", 35) , 
				new Rectangle ("Book", 5,4) 
				
		};
		
		for (int i = 0 ; i < tdshaps.length; i ++) {
			tdshaps[i].draw();
		}
		
		Holdable thdshaps[] = { 
				new Sphere("Ball", 40, 30) , 
				new Sphere("Orange", 4, 1) , 
				new Cube ("Lunch Cube", 0.5 , 20) ,
				new Cube ("Box ", 10 , 100) };
		
		for (int i = 0 ; i < thdshaps.length; i ++) {
			thdshaps[i].hold();
		}
		
		Shape[] allshapes = {
				new Line("String ", 15) , 
				new Line("Charger Cord ", 35) , 
				new Rectangle ("Window", 10,15) ,
				new Rectangle ("Book", 4,9) ,
				new Sphere("Ball", 40, 30) , 
				new Sphere("Orange", 4, 10) , 
				new Cube ("Lunch Cube", 0.5 , 20) ,
				new Cube ("Box ", 10 , 100) 
		};
		
		System.out.println();
		for (int i = 0 ; i < allshapes.length ; i++) {
			System.out.println(allshapes[i]);
		}
	}
}