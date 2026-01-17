package practice.arrays;

public class exercise38 {
    /*
     * Practicando Arrays
     *
     * Crear una función countPositives
     *
     * Debe:
     * - retornar cuántos números positivos hay en un array.
     *
     * Reglas:
     * - si no hay positivos → retorna 0
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - countPositives(new int[]{1, -2, 3   }) → 2
     * - countPositives(new int[]{-1, -2}) → 0
     * - countPositives(new int[]{0, 0, 0}) → 0
     * - countPositives(new int[]{5, 10, 15}) → 3
     * - countPositives(new int[]{}) → 0
     */

    public static void main(String[] args){
        System.out.println(countPositives(new int[]{1,-2,3,0}));
        System.out.println(countPositives(new int[]{-1,-2}));
        System.out.println(countPositives(new int[]{0,0,0}));
        System.out.println(countPositives(new int[]{5,10,15}));
        System.out.println(countPositives(new int[]{}));
    }

    static int countPositives(int[] num) {
        int count = 0;
        for (int i = 0; i<num.length;i++) {
            if(num[i]>0) count++;
        }
        return count;
    }
}
