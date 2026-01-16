package practice.arrays;

public class exercise35 {
    /*
     * Practicando Arrays
     *
     * Crear una función sumPositive
     *
     * Debe:
     * - contar sumar números positivos hay en el array
     * - retornar la suma
     * - no imprimir
     * - usar while
     *
     * Desde main:
     * - prueba con al menos 3 arrays
     *
     * Ejemplos:
     * - {1, -2, 3, 0} → 4
     * - {-1, -2} → 0
     * - {} → 0
     * - {15, 8, 0, 3} → 26
     */

    public static void main(String[] args){
        System.out.println(sumPositive(new int[]{1,-2,3,0}));
        System.out.println(sumPositive(new int[]{-1,-2}));
        System.out.println(sumPositive(new int[]{}));
        System.out.println(sumPositive(new int[]{15,8,0,3}));
    }

    static int sumPositive(int[] num) {
        int acc = 0;
        int l;
        int i = 0;
        while (i<num.length){
            l = num[i];
            if(l>0)acc +=l;
            i++;
        }
        return acc;
    }
}
