package practice.arrays;

public class exercise34 {
    /*
     * Practicando Arrays
     *
     * Crear una función countPositive
     *
     * Debe:
     * - contar cuántos números positivos hay en el array
     * - retornar el conteo
     * - no imprimir
     * - usar while
     *
     * Desde main:
     * - prueba con al menos 3 arrays
     *
     * Ejemplos:
     * - {1, -2, 3, 0} → 2
     * - {-1, -2} → 0
     * - {} → 0
     */

    public static void main(String[] args){
        System.out.println(countPositive(new int[]{1,-2,3,0}));
        System.out.println(countPositive(new int[]{-1,-2}));
        System.out.println(countPositive(new int[]{}));
    }

    static int countPositive(int[] num) {
        int count = 0;
        int l;
        int i = 0;
        while (i<num.length){
            l = num[i];
            if(l>0)count ++;
            i++;
        }
        return count;
    }


}
