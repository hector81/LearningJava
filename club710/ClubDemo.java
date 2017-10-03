package club710;

public class ClubDemo {
	
	public static void main(String[] args) {
	
	
    Club testClub = new Club();

    testClub.join(new Membership("Julio Aranda Sanchez", 7, 2000));
    testClub.join(new Membership("Miguel Marquez Sampedro", 9, 2004));
    testClub.join(new Membership("Juan Eguizabal Perez", 6, 2006));
    testClub.join(new Membership("Isabel Garcia Araca", 5, 2009));
    testClub.join(new Membership("Gabriel Miquelez Urbion", 4, 2011));
    testClub.join(new Membership("Roberto Muñoz Gonzalez", 10, 2014));
        
    System.out.println("El club en 2014 tiene " + testClub.numberOfMembers() + " miembros");
    System.out.println("Estos son los socios actuales del club en 2014 ");
    testClub.print();
    
    testClub.join(new Membership("Hector Angulo Garcia", 7, 2015));
    testClub.join(new Membership("Pedro Etxeberria Laboa", 9, 2015));
    testClub.join(new Membership("Maria Santiago Perez", 6, 2015));
    
    System.out.println("El club en 2015 tiene " + testClub.numberOfMembers() + " miembros");
    System.out.println("Estos son los socios actuales del club en 2015 ");
    testClub.print();
    }
    
}