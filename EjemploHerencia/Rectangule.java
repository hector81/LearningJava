package EjemploHerencia;

public class Rectangule extends Shape {
	protected double widht;
	protected double lenght;

///CONSTRUCTORES
	Rectangule(){                ///primer constructor 
	}
		
	Rectangule(double widht, double lenght){ // segundo constructor que pasa variables			
		this.widht= widht;
		this.lenght= lenght;
	}
	
	Rectangule(double widht, double lenght, String color, boolean filled){ // tercer constructor que pasa variables
		super.setFilled(filled);
		super.setColor(color);
		this.widht= widht;
		this.lenght= lenght;		
	}

//METODOS GETTERS y SETTERS
public void setWidht(double widht) {
	this.widht =  widht;
	}

public double getWidht() {				
		return this.widht;
	}

public void setLenght(double lenght) {
	this.lenght = lenght;
	}

public double getLenght() {				
	return this.lenght;
}

// //Area = length*width;
	@Override
	public double getArea() {				
		return this.lenght*this.widht;
	}
//perimeter = (length * 2 + width * 2); 
	@Override
	public double getPerimeter() {				
		return (this.lenght * 2 + this.widht * 2); 	
	}

//METHOD TO STRING()
	public String toString(){
		return "The width of rectangule is " + getWidht() + " and lenght of rectangule is "
	+ getLenght() + " .The color of rectangule is " + getColor() + " and filled of rectangule is " 
				+ isFILLED() + " and area of rectangule is " + getArea() + 
				" and perimeter of rectangule is " + getPerimeter() + "y llamando al tostring de la superclase shape que da : "
						 + super.toString();
}

	
}
