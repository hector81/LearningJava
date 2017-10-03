package DeliveryUnit1;

public class dfhdfh {

	//*Dentro de una clase joven tenemos las variables enteras edad,nivel_de_estudios e ingresos.
	//*Necesitamos almacenar en la variable booleana jasp el valor:
	//-Verdadero.Si la edad es menor o igual a 28 y el nivel_de_estudios es mayor que tres, o bien, la 
	//edad es menor de 30 y los ingresos superan los 28.000 euros.
	//-Falso. En caso contrario.
	//*Escribe el codigo necesario (2 lineas).

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			/*
			// NUMEROS ALEATORIOS POR PERSONAS		
			//PERSONA 1  CUMPLE ALGUNOS REQUISITOS Y OTROS NO
			int edad1;
			edad1 = (int)(Math.random()*65);
			int nivel_de_estudios1;
			nivel_de_estudios1 = (int)(Math.random()*5);
			int ingresos1;
			ingresos1 = (int)(Math.random()*60000);
			
			//PERSONA 2 CUMPLE TODOS LOS REQUISITOS
			int edad2;
			edad2 = (int)(Math.random()*65);
			int nivel_de_estudios2;
			nivel_de_estudios2 = (int)(Math.random()*5);
			int ingresos2;
			ingresos2 = (int)(Math.random()*60000);
			
			//PERSONA 3  NO CUMPLE TODOS LOS REQUISITOS
			int edad3;
			edad3 = (int)(Math.random()*65);
			int nivel_de_estudios3;
			nivel_de_estudios3 = (int)(Math.random()*5);
			int ingresos3;
			ingresos3 = (int)(Math.random()*60000);
			*/		
			
			// NUMEROS PUESTOS POR PERSONAS
			//PERSONA 1  CUMPLE ALGUNOS REQUISITOS Y OTROS NO
			int edad1;
			edad1 = 29;
			int nivel_de_estudios1;
			nivel_de_estudios1 = 5;
			int ingresos1;
			ingresos1 = 32000;
			
			
			
			//DESCIPCION PRIMERA PERSONA
			System.out.println("PERSONA 1 - La edad es: " + edad1 + " ,el nivel de estudios: " + nivel_de_estudios1 + " y el nivel de ingresos: " + ingresos1);
			

			
			//CUMPLIMIENTO CONDICIONES PRIMERA PERSONA
			
			boolean result1;
			result1 =edad1 <= 28 ;//false
			
			boolean result2;
			result2 = nivel_de_estudios1 > 3;//true

			boolean result3;
			result3 = ingresos1 > 28000;//true
			
			System.out.println("La edad de la primera persona es: " + result1);
			System.out.println("El nivel de estudios de la primera persona es: " + result2);
			System.out.println("El nivel de ingresos de la primera persona es: " + result3);
			
			
			///////////////////////////////////////////   &&  ||

			boolean jasp1;
			jasp1 = edad1 <= 28  && nivel_de_estudios1 > 3 && ingresos1 > 28000  ;//false
			boolean jasp2;


			System.out.println("La primera persona cumple " + jasp1); //false,no cumple
			
		}
	}


