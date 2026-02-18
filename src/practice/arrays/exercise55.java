package practice.arrays;

public class exercise55 {
    /*
     * Practicando Arrays
     *
     * Crear una función firstStableWindowSum
     *
     * Debe:
     * - Evaluar ventanas de 3 elementos consecutivos.
     * - Los 3 deben ser estrictamente positivos.
     * - La suma debe ser > 10
     * - Retornar la primera suma que cumpla.
     * - Si no existe → retornar -1
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - firstStableWindowSum(new int[]{1, 2, 3, 5, 6}) → 14   (3+5+6)
     * - firstStableWindowSum(new int[]{4, 4, 4})       → 12
     * - firstStableWindowSum(new int[]{1, -2, 10, 1})  → -1
     * - firstStableWindowSum(new int[]{5, 3, 1})       → -1   (suma = 9)
     * - firstStableWindowSum(new int[]{2, 5, 4})       → 11
     * - firstStableWindowSum(new int[]{0, 6, 6, 6})    → 18   (6+6+6)
     */

    public static void main(String[] args) {
        System.out.println(firstStableWindowSum(new int[]{1, 2, 3, 5, 6}));
        System.out.println(firstStableWindowSum(new int[]{4, 4, 4}));
        System.out.println(firstStableWindowSum(new int[]{1, -2, 10, 1}));
        System.out.println(firstStableWindowSum(new int[]{5, 3, 1}));
        System.out.println(firstStableWindowSum(new int[]{2, 5, 4}));
        System.out.println(firstStableWindowSum(new int[]{0, 6, 6, 6}));
        System.out.println(firstStableWindowSum(new int[]{1,-2,10,1,5,5,5}));
        System.out.println(firstStableWindowSum(new int[]{3,4,5,-1,6,6,6}));
        System.out.println(firstStableWindowSum(new int[]{-5,-5,20,1,1}));
    }

    static int firstStableWindowSum(int[] num) {
        if(num.length<3) return -1;

        for (int i = 0; i < num.length-2; i++) {
            if(num[i]>0 && num[i+1]>0 &&num[i+2]>0) {
                int sum= num[i] + num[i+1] + num[i+2];
                if(sum>10) return sum;
            }
        }

        return -1;
    }
}
