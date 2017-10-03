package EjemploHerencia;

public class Square extends Rectangule {
	private double side;
	
	///CONSTRUCTORES
	Square(){                ///primer constructor 
		}
			
	Square(double side){ // segundo constructor que pasa variables			
			this.side= side;
		}
		
	Square(double side,String color, boolean filled){ // tercer constructor que pasa variables
			super.setFilled(filled);
			super.setColor(color);
			this.side= side;	
		}

	
	public void setSide(double side) {
		this.side =  side;
		}
	
	public double getSide() {				
			return this.side;
		}
	
	@Override
	public void setLenght(double lenght) {
		this.lenght = lenght;
		}
	
	@Override
	public void setWidht(double widht) {
		this.widht =  widht;
		}
	
	//METHOD TO STRING()
		public String toString(){
			return "The width of Square is " + getWidht() + " and lenght of Square is "
		+ getLenght() + " .The color of Square is " + getColor() + " and filled of Square is " 
					+ isFILLED() + " and area of Square is " + getArea() + 
					" and perimeter of Square is " + getPerimeter() + "y llamando al tostring de la superclase shape que da : "
							 + super.toString();
	}
}
