package practice.arrays;

public class exercise33 {
    /*
    * Practicando Arrays
    *
    * Crear una función sumArray que:
    * - reciba un array de enteros
    * - retorne la suma de todos sus elementos
    * - si el array está vacío, retorne 0
    * - no imprimir dentro de la función
    *
    * Desde main, prueba con:
    * - un array con varios números
    * - un array con un solo número
    * - un array vacío
    */

    public static void main(String[] args){
        System.out.println(sumArray(new int[]{1,6,4}));
        System.out.println(sumArray(new int[]{8}));
        System.out.println(sumArray(new int[]{}));
    }

    static int sumArray(int[] num){
        int acc = 0;
        int i = 0;
        int number;
        while (i<num.length){
            number = num[i];
            acc +=number;
            i++;
        }
        return acc;
    }
}
