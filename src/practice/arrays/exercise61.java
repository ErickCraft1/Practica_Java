package practice.arrays;

public class exercise61 {
    /*
     * Practicando Arrays
     *
     * Crear una función longestSubarraySumAtMostK(int[] num, int k).
     *
     * Debe:
     * - retornar la longitud del subarray más largo cuya suma sea <= k.
     *
     * Reglas:
     * - Puede haber negativos.
     * - No se reinicia al encontrar negativo.
     * - Ya no sirve el patrón "bloques".
     * - Aquí necesitas ventanas deslizantes real (two poniters).
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - longestSubarraySumAtMostK(new int[]{1, 2, 1, 0, 1, 1, 0}, k=4)         → [1,0,1,1,0] -> suma = 3 -> longitud 5
     * - longestSubarraySumAtMostK(new int[]{5, 2, 2, 5, 1, 1, 1, 1, 4}, k=4)   → [1,1,1,1] -> suma = 4 -> longitud 4
     * - longestSubarraySumAtMostK(new int[]{1, 1, 1, 1}, k=4)                  → [1,1,1,1] -> suma = 4 -> longitud 4
     * - longestSubarraySumAtMostK(new int[]{4, 4, 4, 4}, k=4)                  → [4] -> suma = 4 -> longitud 1
     * - longestSubarraySumAtMostK(new int[]{6, 1, 2, 1}, k=4)                  → [1,2,1] -> suma = 4 -> longitud 3
     * - longestSubarraySumAtMostK(new int[]{0, 0, 0, 1}, k=0)                  → [4] -> suma = 4 -> longitud 3
     */

    public static void main(String[] args) {
        System.out.println(longestSubarraySumAtMostK(new int[]{1, 2, 1, 0, 1, 1, 0}, 4)); // 5
        System.out.println(longestSubarraySumAtMostK(new int[]{5, 2, 2, 5, 1, 1, 1, 1, 4}, 4)); // 4
        System.out.println(longestSubarraySumAtMostK(new int[]{1, 1, 1, 1}, 4)); // 4
        System.out.println(longestSubarraySumAtMostK(new int[]{4, 4, 4, 4}, 4)); // 1
        System.out.println(longestSubarraySumAtMostK(new int[]{6, 1, 2, 1}, 4)); // 3
        System.out.println(longestSubarraySumAtMostK(new int[]{0, 0, 0, 1}, 0)); // 3
    }

    static int longestSubarraySumAtMostK(int[] num, int k){
        if(num.length<1) return 0;
        int left=0, right=0, acc=0, len=0, wind=0;

        while(right< num.length){
            if(acc<=k){
                acc+=num[right];
                right++;
                wind=right-left;
                while (acc>k){
                    acc -= num[left];
                    left++;
                    wind=right-left;
                }
            }
            if(wind>len) len =wind;
        }
        return len;
    }
}



/*
* Este ejercicio introduce el patrón "two pointers" con un único límite *<=k* que define su validez.
* El patrón "two pointers" me permite expandir mientras la suma se mantiene dentro del límite,
* y contraer cuando lo exceda. El desafío no radicaba en la expansión en sí, sino en comprender cuándo realizar la contracción,
* y que esta debe hacerse con un bucle while y no una sentencia if.
*
*
*
*
* This exercise introduces "two pointers" with a single boundary *<=k* which defines when it's valid.
* The "two pointers" pattern allows me to expand while the sum remains within the limit,
* and contract when it exceeds it. The challenge wasn't the expansion itself, but understanding when to perform the contraction,
* and that it must be done with a while loop, not an if statement.
*
*
* */