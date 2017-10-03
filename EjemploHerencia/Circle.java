package EjemploHerencia;

public class Circle extends Shape {
	private double radius = 1.0;
	private String color = "red";
	
	
	///CONSTRUCTORES
	Circle(){                ///primer constructor 
	}
	
	
	Circle(double radius){ // segundo constructor que pasa variables
		this.radius= radius;	
	}
	
	Circle(double radius, String color,boolean filled){ // tercer constructor que pasa variables
		this.radius= radius;
		this.color= color;
		super.setFilled(filled);		
	}
	
	// METODOS SETTER Y GETTER		 
			public void setRadius(double rad) {
				this.radius =  rad;
				}
			
			public double getRadius() {				
					return radius;
				}
							
			public String getColor() {				
				return color;
			}		
			
			@Override
			public double getArea() {				
				return radius*radius*Math.PI;
			}	
			
			@Override
			public double getPerimeter() {				
				return 2*Math.PI*radius;			
			}	
			
			//METHOD TO STRING()
			public String toString(){
				return "The circle has radius of " + getRadius() + " and area of " 
						+ getArea() + " and Perimeter is " + getPerimeter();
			}
			
			
}