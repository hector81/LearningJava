package EjemploTrabajador2Herencia;

public class Repartidor extends Empleado{
	 
    //Atributo
    private String zona;
 
   //Constructor
    public Repartidor(){
        this.zona="";
    }
 
    public Repartidor(String nombre, String apellido, int edad, double salario, String zona) {
        super(nombre, apellido, edad, salario);
        this.zona=zona;
    }
}