package practice.arrays;

public class exercise54 {
    /*
     * Practicando Arrays
     *
     * Crear una función countLocalPeaks
     *
     * Debe:
     * - retorna la cantidad de picos que existen en un array.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - countLocalPeaks(new int[]{1, 3, 2, 4, 1}) -> 2
     * - countLocalPeaks(new int[]{1, 2, 3}) -> 0
     * - countLocalPeaks(new int[]{3, 1, 3, 1}) -> 2
     * - countLocalPeaks(new int[]{5, 3, 2, 4, 1}) -> 2
     */

    public static void main(String[] args) {
        System.out.println(countLocalPeaks(new int[]{1, 3, 2, 4, 1})); // 2
        System.out.println(countLocalPeaks(new int[]{1, 2, 3})); // 0
        System.out.println(countLocalPeaks(new int[]{3, 1, 3, 1})); // 1
        System.out.println(countLocalPeaks(new int[]{5, 3, 2, 4, 1})); // 1
        System.out.println(countLocalPeaks(new int[]{5})); // 0
        System.out.println(countLocalPeaks(new int[]{5, 3})); // 0
        System.out.println(countLocalPeaks(new int[]{1, 5, 2})); // 1
        System.out.println(countLocalPeaks(new int[]{5, 1, 5})); // 0
        System.out.println(countLocalPeaks(new int[]{2, 2, 2})); // 0
        System.out.println(countLocalPeaks(new int[]{1, 3, 3, 2})); // 0
        System.out.println(countLocalPeaks(new int[]{1, 3, 2, 3, 2})); // 2
        System.out.println(countLocalPeaks(new int[]{5, 4, 3, 2, 1})); // 0
        System.out.println(countLocalPeaks(new int[]{1, 2, 3, 4, 5})); // 0
        System.out.println(countLocalPeaks(new int[]{3, 1, 2})); // 0
        System.out.println(countLocalPeaks(new int[]{1, 2, 3, 2, 1})); // 1
        System.out.println(countLocalPeaks(new int[]{5, 3, 5, 3, 5})); // 1
        System.out.println(countLocalPeaks(new int[]{10, 1, 2, 1, 3})); // 1
        System.out.println(countLocalPeaks(new int[]{1, 1, 2, 1, 1})); // 1
        System.out.println(countLocalPeaks(new int[]{-1, -5, -2})); // 0
        System.out.println(countLocalPeaks(new int[]{-5, 0, -3})); // 1
    }

    static int countLocalPeaks(int [] n) {
        if(n.length<3) return 0;
        int count = 0;
        for (int i=1;i<n.length-1;i++){
            if(n[i-1]<n[i]&&n[i]>n[i+1]){
                count++;
            }
        }
        return count;
    }
}
