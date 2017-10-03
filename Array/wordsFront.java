package Array;

//wordsFront({"a", "b", "c", "d"}, 1) → {"a"}
//wordsFront({"a", "b", "c", "d"}, 2) → {"a", "b"}
//wordsFront({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}
public class wordsFront {
    //ATRIBUTOS

    public static String[] letras = {"a", "b", "c", "d"};
    public static int numero = 3;

    //metodos
    public static String[] wordsFront(String[] letras, int numero) {
        String[] newWords = new String[numero];
        for (int i = 0; i < numero; i++) {
            newWords[i] = letras[i];
        }
        return newWords;
    }
    //main

    public static void main(String[] args) {
        String[] resultado = wordsFront(letras, numero);

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
