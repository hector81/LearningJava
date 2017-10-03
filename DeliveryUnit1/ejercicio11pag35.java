package DeliveryUnit1;
//Realiza un programa con una variable entera t la cual contiene un tiempo en segundos y
//queremos conocer este tiempo pero expresado en horas, minutos y segundos.
//proceso horas- segundos -->  hora:minuto:segundo  ejemplo: 15horas:21minutos:32segundos
//probar el resto%  es decir que me de 3 dias y con el resto 23 horas y con el resto 12 minutos y 5segs


public class ejercicio11pag35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t;
		//EJEMPLO:    t = 61200;      //17 horas  // 1020 minutos // 61200 segundos
		t =(int)(Math.random()*6840000);
		System.out.println("El numero aleatorio es: " + t);
		
		int ts;  //ts significa tiempo en segundos
		ts = t;
		System.out.println("Tiempo equivalente en segundos: " + ts + " segundos");
		
		int tm;  //tm significa tiempo en minutos
		tm = ts/60;
		int rs;  //rm significa tiempo restante en segundos
		rs = ts % 60;
		System.out.println("Tiempo equivalente en minutos: " + tm + " minutos y " + rs + " segundos");
		
		int th;  //th significa tiempo en horas
		th = tm/60;
		int rm;  //rm significa tiempo restante en minutos
		rm = tm % 60;
		System.out.println("Tiempo equivalente en horas: " + th + " horas , " + rm + " minutos");
		
		int hd;
		hd= 24;		
		int td;  //td significa tiempo en dias
		td = th/hd;
		int rh1;  //td significa resto tiempo en horas
		rh1 = th % 24;

		System.out.println("Tiempo equivalente en d�as: " + td + " d�as " + rh1 + " horas");
		
	}
}