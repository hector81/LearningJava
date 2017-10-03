package EjemploHerencia;

public class Test {
	public static void main(String[] args) {
	
	System.out.println("ESTA ES LA HERENCIA DE CIRCULO");
	Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
	System.out.println("TO STRING: " + s1);                    // which version?
	System.out.println("AREA: " + s1.getArea());          // which version?
	System.out.println("PERIMETRO: " + s1.getPerimeter());     // which version?
	System.out.println(s1.getColor());
	System.out.println(s1.isFILLED());
	System.out.println(((Circle) s1).getRadius());
	 
	System.out.println("ESTA ES LA HERENCIA DE CIRCULO");
	Circle c1 = (Circle)s1;                   // Downcast back to Circle
	System.out.println(c1);
	System.out.println("AREA: " + c1.getArea());
	System.out.println(c1.getPerimeter());
	System.out.println(c1.getColor());
	System.out.println(c1.isFILLED());
	System.out.println(c1.getRadius());
	   
	//Shape s2 = new Shape();
	System.out.println("ESTA ES LA HERENCIA DE CIRCULO"); 
	Shape s3 = new Rectangule(1.0, 2.0, "RED", false);   // Upcast
	System.out.println(s3);
	System.out.println("AREA: " + s3.getArea());
	System.out.println(s3.getPerimeter());
	System.out.println(s3.getColor());
	System.out.println(((Rectangule) s3).getLenght());
	 
	System.out.println("ESTA ES LA HERENCIA DE CIRCULO");
	Rectangule r1 = (Rectangule)s3;   // downcast
	System.out.println(r1);
	System.out.println("AREA: " + r1.getArea());
	System.out.println(r1.getColor());
	System.out.println(r1.getLenght());

	System.out.println("ESTA ES LA HERENCIA DE CIRCULO");
	Shape s4 = new Square(6.6);     // Upcast
	System.out.println(s4);
	System.out.println("AREA: " + s4.getArea());
	System.out.println(s4.getColor());
	System.out.println(((Square) s4).getSide());
	
	System.out.println("ESTA ES LA HERENCIA DE SQUARE");
	// Take note that we downcast Shape s4 to Rectangle, 
	//  which is a superclass of Square, instead of Square
	Rectangule r2 = (Rectangule)s4;
	System.out.println(r2);
	System.out.println(r2.getArea());
	System.out.println(r2.getColor());
	System.out.println(((Square) r2).getSide());
	System.out.println(r2.getLenght());
	
	System.out.println("ESTA ES LA HERENCIA DE SQUARE");
	// Downcast Rectangle r2 to Square
	Square sq1 = (Square)r2;
	System.out.println(sq1);
	System.out.println(sq1.getArea());
	System.out.println(sq1.getColor());
	System.out.println(sq1.getSide());
	System.out.println(sq1.getLenght());
	
    }
}