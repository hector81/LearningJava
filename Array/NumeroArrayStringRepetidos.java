package Array;

//Dada 2 matrices que son de la misma longitud que contiene secuencias, 
//comparar la primera cadena en un arreglo a la primera cadena en la otra serie 
//, 2 al segundo y así sucesivamente. Cuente el número de veces que las 2 cadenas 
//no son vacías y comienzan con el mismo carbón . Las cuerdas pueden ser de cualquier
//longitud , incluyendo 0 .

//matchUp({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) → 1
//matchUp({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) → 2
//matchUp({"aa", "bb", "cc"}, {"", "", "ccc"}) → 1

public class NumeroArrayStringRepetidos {
    //atributo

    public static String[] letras1 = {"aa", "bb", "cc"};
    public static String[] letras2 = {"aa", "bb", "cc"};

    public static int NumeroArrayStringRepetidos(String[] letras1, String[] letras2) {
        //declaramos contador
        int count = 0;
        for (int i = 0; i < letras1.length; i++) {
            if (letras1[i].equals("") && letras2[i].equals("")
                    && letras1[i].charAt(0) == letras2[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    //main
    public static void main(String[] args) {

        System.out.println("La cadena devuelve : "
                + NumeroArrayStringRepetidos(letras1, letras2));
    }
}
