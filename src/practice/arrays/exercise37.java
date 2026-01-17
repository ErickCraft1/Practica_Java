package practice.arrays;

public class exercise37 {
    /*
     * Practicando Arrays
     *
     * Crear una función maxPositive
     *
     * Debe:
     * - retornar el mayor número positivo.
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
     * - maxPositive(new int[]{1, -2, 5, 3}) → 5
     * - maxPositive(new int[]{-1, -2}) → -1
     * - maxPositive(new int[]{0, 10}) → 10
     * - maxPositive(new int[]{}) → -1
     */

    public static void main(String[] args){
        System.out.println(maxPositive(new int[]{1,-2,5,3}));
        System.out.println(maxPositive(new int[]{-1,-2}));
        System.out.println(maxPositive(new int[]{10,-2,7,15}));
        System.out.println(maxPositive(new int[]{0,10}));
            System.out.println(maxPositive(new int[]{}));
    }

    static int maxPositive(int[] num) {
        int max = -1;
         for (int i = 0; i<num.length;i++) {
            if(num[i]>max && num[i]>0) {
                max = num[i];
            }
        }
        return max;
    }
}
