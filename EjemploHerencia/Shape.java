package EjemploHerencia;

public abstract class Shape {
	private String color;
	private boolean filled;
	
	//Constructor por defecto que inicaliza con valores
	Shape(){
		this.color = "green";
		this.filled = true;          //lleno o no lleno
			} 
			
	//constructor para establecer los valores del atributo
	Shape(String color ,boolean filled ){
		this.color = color;
		this.filled = filled;				
		} 	
	
	//METODOS
	public void setColor(String color) {
		this.color =  color;
		}
	
	public String getColor() {				
			return this.color;
		}
	
	public void setFilled(boolean filled) {
		this.filled =  filled;		
		}
	
	public String isFILLED() {				
			String ESTAFILLED = null;
			if (this.filled = true) {
				ESTAFILLED = "FILLED";
				//return filled;
			} else if (this.filled = false) {
				ESTAFILLED = "NOT FILLED";
				//return this.filled;
			}
			return ESTAFILLED;
		}
		
	
	abstract double getArea();
	
	abstract double getPerimeter();
	
	//METHOD TO STRING()
	public String toString(){
		return "The color is " + getColor() + " and filled is " + isFILLED();
	}
}
