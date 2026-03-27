package practice.arrays;

public class exercise64 {
    /*
     * Practicando Arrays
     *
     * Crear una función detectPattern(int[] num, int[] pattern).
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
     * - detectPattern(new int[]{1,2,3,4,5}, new int[]{2,3,4})       → true
     * - detectPattern(new int[]{1,2,3,4,5}, new int[]{3,2,1})       → false
     * - detectPattern(new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5})   → true
     * - detectPattern(new int[]{1,2,3}, new int[]{})                → false
     * - detectPattern(new int[]{}, new int[]{1,2})                  → false
     * - detectPattern(new int[]{1,2,3}, new int[]{1,2,3,4})         → false
     * - detectPattern(new int[]{2,2,2}, new int[]{2,2})             → true
     * - detectPattern(new int[]{1,2,1,2,3}, new int[]{1,2,3})       → true
     */

    public static void main(String[] args) {
        System.out.println(detectPattern(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4}));
        System.out.println(detectPattern(new int[]{1,2,3,4,5}, new int[]{3,2,1}));
        System.out.println(detectPattern(new int[]{1,2,3,4,5}, new int[]{1,2,3,4,5}));
        System.out.println(detectPattern(new int[]{1, 2, 3}, new int[]{}));
        System.out.println(detectPattern(new int[]{}, new int[]{1, 2}));
        System.out.println(detectPattern(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4}));
        System.out.println(detectPattern(new int[]{2, 2, 2}, new int[]{2, 2}));
        System.out.println(detectPattern(new int[]{1, 2, 1, 2, 3}, new int[]{1, 2, 3}));
    }

    static boolean detectPattern(int[] num, int[] pattern){
        int p=0;
        if(num.length<1 || pattern.length<1 || num.length<pattern.length) return false;

        for(int i=0; i<= num.length- pattern.length;i++){
            while (p< pattern.length){
                if(num[i+p]==pattern[p]){
                    p++;
                }else {
                    p=0;
                    break;
                }
            }
            if(p== pattern.length) return true;
        }
        return false;
    }
}

/*
* Algoritmo -> Pattern Matching
* "Pattern Matching usa dos bucles: el externo prueba cada posición de inicio válida en
* num — válida significa que aún cabe el patrón completo — y el interno compara
* elemento por elemento hasta confirmar coincidencia total o descartar."
* Su complejidad algoritmica es O(n*m)
*/
