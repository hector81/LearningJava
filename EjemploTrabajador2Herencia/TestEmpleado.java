package EjemploTrabajador2Herencia;

public class TestEmpleado {
	 
    public static void main(String[] args) {
 
        //Creamos objetos de las clases hijas
        Comercial comercial1=new Comercial("Antonio", "Lopez", 24, 600, 50);
        Repartidor repartidor1=new Repartidor("Fernando", "Ureta", 43, 400, "Este");
 
        //Invocamos los metodos de la clase padre
        comercial1.plus(300);
        repartidor1.plus(300);
 
        //Mostramos los atributos, usando los metodos get de la clase padre
        System.out.println("El salario actual del comercial es "+comercial1.getSalario());
        System.out.println("El salario actual del repartidor es "+repartidor1.getSalario());
 
    }
 
}