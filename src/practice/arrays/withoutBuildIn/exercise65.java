package practice.arrays.withoutBuildIn;

public class exercise65 {
    /*
     * Practicando Arrays
     *
     * Crear una función combinedChallenge(int[] num, int k, int[] pattern).
     *
     * Debe:
     * - retornar true si el pattern aparece como subarray contiguo dentro de num.
     * - retornar false si no aparece.
     *
     * Reglas:
     * - No uses métodos built-in.
     * - El pattern puede ser de cualquier longitud.
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - combinedChallenge(new int[]{1,2,3,1,2,3}, k=3, pattern={1,2,3})  → 2
     * - combinedChallenge(new int[]{1,2,3,4,5}, k=3, pattern={2,3})      → 2
     * - combinedChallenge(new int[]{1,2,3,4,5}, k=3, pattern={1,2,3,4})  → 0
     * - combinedChallenge(new int[]{1,2,3}, k=3, pattern={})             → 0
     * - combinedChallenge(new int[]{}, k=3, pattern={1,2})               → 0
     * - combinedChallenge(new int[]{1,2,1,2,3}, k=3, pattern={2,3})      → 1
     * - combinedChallenge(new int[]{2,2,2,2}, k=2, pattern={2,2})        → 3
     */

    public static void main(String[] args) {
        System.out.println(combinedChallenge(new int[]{1, 2, 3, 1, 2, 3}, 3, new int[]{1, 2, 3}));
        System.out.println(combinedChallenge(new int[]{1, 2, 3, 4, 5}, 3, new int[]{2, 3}));
        System.out.println(combinedChallenge(new int[]{1, 2, 3, 4, 5}, 3, new int[]{1, 2, 3, 4}));
        System.out.println(combinedChallenge(new int[]{1, 2, 3}, 3, new int[]{}));
        System.out.println(combinedChallenge(new int[]{}, 3, new int[]{1, 2}));
        System.out.println(combinedChallenge(new int[]{1, 2, 1, 2, 3}, 3, new int[]{2, 3}));
        System.out.println(combinedChallenge(new int[]{2, 2, 2, 2}, 2, new int[]{2, 2}));
    }

    static int combinedChallenge(int[] num, int k, int[] pattern){
        int patternIndex =0,acc=0;
        int windowLimit = num.length-k;
        boolean hasInvalidInputs = (
                (num.length < 1) ||
                (pattern.length < 1) ||
                (num.length < pattern.length) ||
                (pattern.length > k)
        );
        if (hasInvalidInputs) return 0;

        for(int i=0;i<=windowLimit;i++){
            int patternLimit = i+k- pattern.length;
            for(int j=i;j<=patternLimit;j++){
                while (patternIndex <pattern.length){
                    if(num[j+patternIndex]==pattern[patternIndex]){
                        patternIndex++;
                    } else {
                        patternIndex=0;
                        break;
                    }
                }
                if(patternIndex == pattern.length) {
                    acc++;
                    patternIndex =0;
                }
            }
        }

        return acc;
    }
}

/*
 * Algoritmo -> Sliding Window + Pattern Matching
 * "En este ejercicio se combino ambos algoritmos con la finalidad de interiorizar el uso de estos y también
 *  ayuda a entender como descomponer y que se debe hacer ante este tipo de casos"
 *
 * Su complejidad algoritmica es O(n*m)
 *
 *
 *
 *
 * Algorithm -> Sliding Window + Pattern Matching
 * "In this exercise both algorithms were combined with the purpose of internalizing the use of these and also
 * helps to understand how to decompose and what should be done in this type of case"
 *
 * Its algorithmic complexity is O(n*m)
 */
