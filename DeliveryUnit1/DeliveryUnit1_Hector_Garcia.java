package DeliveryUnit1;
//Complementa la siguiente tabla y explicar porque da ese resultado: 

//boolean adivina = ((97 == 'a')&& true );
//System.out.println(adivina); 

//int a=1;
//int b = a>>>2;
//System.out.println(b);

//int a = 7 | 4;
//System.out.println(a);
//int a = 3 | 4;
//System.out.println(b);

//int a = 7 & 4;
//System.out.println(a);
//int a = 3 & 4;
//System.out.println(b);

//int a= ~4
//System.out.println(a);

//int a= (~4*5)&1;
//System.out.println(a);

public class DeliveryUnit1_Hector_Garcia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1-CASO RESUELTO
		//boolean adivina = ((97 == 'a')&& true );
		//System.out.println(adivina); 
		//DA TRUE, FUNCIONA
		//EXPLICACION:  
		//EL simbolo && siginifica que "((97 == 'a')" tiene que ser TRUE para que el resultado de TRUE.
		//Si fuera FALSE, el resultado dara FALSE.  El simbolo == significa que 97 debe ser igual a 'a'. 
		//El resultado de la operacion:
		//boolean adivina = 97 == 'a';
		//System.out.println(adivina);
		//97 es igual a 'a'. Da TRUE. Por lo tanto boolean adivina = (true && true );  da TRUE y funciona.		
		
		//2-CASO 
		//int a=1;
		//int b = a>>>2;
		//System.out.println(b);
		// DA 0, FUNCIONA
		//EXPLICACION            
		//El simbolo >>>2 significa que desplaza 2 bytes a la derecha. "a" es 1, un valor hexadecimal que en
		//binaro da 0001, por lo tanto "b" dara como binario 0000 y el resultado de "b" es 0.
		//Si "a" hubiera sido por ejemplo 1100 el resultado de "b" hubiera sido 0011 y dara 3.				
		
		//3-CASO 
		//int a = 7 | 4;
		//System.out.println(a);
		//int b = 3 | 4;          
		//System.out.println(b);
		//FUNCIONA
		//EXPLICACION:
		//En este caso las variables a y b dan 7 y 7. EL operator OR da verdadero cuando ambos valores son
		//verdaderos o por lo menos uno de ellos. Ambos valores lo son.		
		// 7= 0111 
		//-4= 0100
		// a= 0111
		// 3= 0011
		//-4= 0100
		// b= 0111
		//En este caso el resultado es 1 si alguno de ellos esta en 1. En caso contrario devuelve 0 
			
		//4-CASO 
		//int a = 7 & 4;
		//System.out.println(a);
		//int b = 3 & 4;            
		//System.out.println(b);
		//FUNCIONA, "a" da 4 y "b" da 0.
		//EXPLICACION
		//El operador & devuelve true si ambos operandos son true. En estos casos ambos valores son TRUE.
		//Compara los bytes y siempre se evalua el segundo operando.
		// 7= 0111 
		//-4= 0100
		// a= 0100
		// 3= 0011
		//-4= 0100
		// b= 0000
		//Cada bits es 1 si los bits correspondientes de los operandos estan a 1. 
		//En caso contrario, el bit es 0 
		
		//5-CASO 
		//int a= ~4;    
		//System.out.println(a);
		//Da -5,FUNCIONA
		//EXPLICACION
		//Tiene complementoo A2
		//  ~   este simbolo invierte los bites
		//El valor hexadecimal 4 es equivalente al valor binario 0100 . 
		//El operador NOT bit a bit (~) invertira los 0 en 1 y viceversa. Ahora 4 es en binario 1011.
		//  4= 0100
		// ~4= 1011 que en complemento a dos, es equivalente a -5.
		
		//6-CASO 
		//int a= (~4*5)&1;
		//System.out.println(a);
		// DA 1, FUNCIONA
		//EXPLICACION
		//Tiene complementoo A2
		//  ~   este simbolo invierte los bites
		//En el anterior caso (int a= ~4) daba -5. Se quedara en (-5*5)&1; o lo que es lo mismo
		//int a= -25&1;. En este caso el operador and (&) evaluara los 2 operandos para ver si son
		//valores TRUE y evaluara el segundo operando (1).
		//25 = 0010 0101
		//1  = 0000 0001
		//a  = 0000 0001
		//Cada bits es 1 si los bits correspondientes de los operandos estan a 1. 
		//En caso contrario, el bit es 0
		
	}
}
