package practice.arrays;

public class exercise63 {
    /*
     * Practicando Arrays
     *
     * Crear una función countValidSubarrays(int[] num, int k).
     *
     * Debe:
     * - retornar la cantidad de subarrays cuya suma sea exactamente k.
     *
     * Reglas:
     * - Puede haber negativos.
     * - No uses métodos built-in.
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - countValidSubarrays(new int[]{1, 1, 1}, k=2)         → 2
     * - countValidSubarrays(new int[]{1, 2, 3}, k=3)         → 2
     * - countValidSubarrays(new int[]{3, 1, 1, 1, 3}, k=3)   → 3
     * - countValidSubarrays(new int[]{0, 0, 0}, k=0)         → 6
     * - countValidSubarrays(new int[]{-1, 1, 1, -1}, k=0)    → 3
     * - countValidSubarrays(new int[]{5}, k=5)               → 1
     * - countValidSubarrays(new int[]{5}, k=6)               → 0
     */

    public static void main(String[] args) {
        System.out.println(countValidSubarrays(new int[]{1, 1, 1}, 2));
        System.out.println(countValidSubarrays(new int[]{1, 2, 3}, 3));
        System.out.println(countValidSubarrays(new int[]{3, 1, 1, 1, 3}, 3));
        System.out.println(countValidSubarrays(new int[]{0, 0, 0}, 0));
        System.out.println(countValidSubarrays(new int[]{-1, 1, 1, -1}, 0));
        System.out.println(countValidSubarrays(new int[]{5}, 5));
        System.out.println(countValidSubarrays(new int[]{5}, 0));
    }

    static int countValidSubarrays(int[]num, int k){
        if(num.length<1)return 0;
        int acc=0, sum=0, left=0, right=0;

        while (left< num.length){
            while (right< num.length){
                sum+=num[right];
                if(sum==k) acc++;
                right++;
            }
            sum=0;
            left++;
            right=left;
        }
        return acc;
    }
}
