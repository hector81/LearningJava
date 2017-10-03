package EjemploTrabajador2Herencia;

public class Comercial extends Empleado{
	 
    //Atributo
    private double comision;
 
    // Constructor 
    public Comercial(){
        this.comision=0;
    }
    
    public Comercial(String nombre, String apellido, int edad, double salario, double comision) {
        super(nombre, apellido, edad, salario);
        this.comision=comision;
    }
}