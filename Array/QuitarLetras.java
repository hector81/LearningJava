package Array;

//wordsWithout({"a", "b", "c", "a"}, "a") → {"b", "c"}
//wordsWithout({"a", "b", "c", "a"}, "b") → {"a", "c", "a"}
//wordsWithout({"a", "b", "c", "a"}, "c") → {"a", "b", "a"}

public class QuitarLetras {
    //ATRIBUTOS
    public static String[] letras = {"a", "b", "c", "a"};
    public static String letra = "a";
    //metodos
    public static String[] quitarLetras(String[] letras, String letra) {
        int contador = 0;
        String nuevaLetra = null;
        //recorremos el array para averiguar las letras que no son b y poder
        //iniciar el array con ese tamaño
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] != letra) {//si la letra no es b
                contador++;
            }
        }
        int nuevoContador =0;
        String[] arrayAux = new String[contador];//iniciamos el array
        //volvemos a recorrer y añadimos las letras al array que no sean b
        for (int i = 0; i < arrayAux.length; i++) {
            if (letras[i] != letra) //si la letra no es b
                nuevaLetra = letras[i];                
                arrayAux[nuevoContador] = nuevaLetra;
                nuevoContador++;
        }
        return arrayAux;
    }
    //main
    public static void main(String[] args) {
        String[] resultado = quitarLetras(letras, letra);
        //recorremos para imprimirlo
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }       
    }
}
