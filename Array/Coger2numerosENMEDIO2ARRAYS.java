package Array;

/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements. 

middleWay({1, 2, 3}, {4, 5, 6}) → {2, 5}
middleWay({7, 7, 7}, {3, 8, 0}) → {7, 8}
middleWay({5, 2, 9}, {1, 4, 5}) → {2, 4}*/
public class Coger2numerosENMEDIO2ARRAYS {

    public static void main(String[] args) {
        int[] numeros1 = {1, 2, 9};
        int[] numeros2 = {1, 3, 9};
        int medio1 = 0;
        int medio2 = 0;
        for (int i = 0; i < numeros1.length; i++) {
            medio1 = numeros1[1];
            for (int j = 0; j < numeros2.length; j++) {
                medio2 = numeros2[1];
            }
        }
        System.out.println(medio1);
        System.out.println(medio2);
    }
}
