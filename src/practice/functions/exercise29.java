package practice.functions;

public class exercise29 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crea una función llamada contarMultiplos
     *
     * Debe:
     * - contar cuántos múltiplos de `base` hay desde 1 hasta `limit`
     * - incluir `limit` si es múltiplo
     * - retornar el conteo
     *
     * Reglas:
     * - usar for o while
     * - no imprimir dentro de la función
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 4 combinaciones distintas
     *
     * Ejemplos:
     * - contarMultiplos(3, 10) → 3   (3, 6, 9)
     * - contarMultiplos(5, 25) → 5   (5,10,15,20,25)
     * - contarMultiplos(4, 3) → 0
     * - contarMultiplos(2, 1) → 0
     */

    public static void main(String[] args) {
        System.out.println(countMultiple(3,10));
        System.out.println(countMultiple(5,25));
        System.out.println(countMultiple(4,3));
        System.out.println(countMultiple(2,1));
    }

    static int countMultiple(int base, int limit) {
        int count = 0;
        int acc = base;
        while (acc<=limit) {
            count++;
            acc += base;
        }
            return count;
    }
}
