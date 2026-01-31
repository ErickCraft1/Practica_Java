package practice.arrays;

public class exercise39 {
    /*
     * Practicando Arrays
     *
     * Crear una función maxPositive
     *
     * Debe:
     * - retornar el segundo mayor número positivo.
     *
     * Reglas:
     * - si no hay positivos → retorna -1
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     * - no usar Math.max
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - secondMaxPositive(new int[]{1, 5, 3, 10}) → 5
     * - secondMaxPositive(new int[]{10, 10,5}) → 5
     * - secondMaxPositive(new int[]{5}) → -1
     * - secondMaxPositive(new int[]{-1, -2}) → -1
     * - secondMaxPositive(new int[]{0, 10}) → -1
     */

    public static void main(String[] args){
        System.out.println(secondMaxPositive(new int[]{1, 5, 3, 10, 8}));
        System.out.println(secondMaxPositive(new int[]{10, 10, 5}));
        System.out.println(secondMaxPositive(new int[]{5}));
        System.out.println(secondMaxPositive(new int[]{-1, -2}));
        System.out.println(secondMaxPositive(new int[]{0, 10}));
    }

    static int secondMaxPositive(int[] num){
        int max=-1;
        int second = -1;

        for(int i = 0; i<num.length;i++){
            if(num[i]<1) return second;
            if(num[i]>max) {
                second = max;
                max = num[i];
            }
            if (num[i]<max && num[i]>second) second = num[i];
        }
        return second;

    }
}
