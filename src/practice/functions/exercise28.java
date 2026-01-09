package practice.functions;

public class exercise28 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función primerMultiploQueSupera.
     * Debe :
     * - recibir dos enteros:
     *   - base
     *   - limite
     * - sumar múltiplos de base empezando desde base
     * - detenerse cuando la suma supere limite
     * - retornar la suma final
     * - usar while
     * - usar break
     * - no imprimir
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 4 combinaciones
     * - imprime el resultado
     *
     * Ejemplos
     * - primerMultiploQueSupera(3, 10)
     *   → 3 + 6 = 9
     *   → al intentar sumar 9 se pasa
     *   → retorna 9
     * - primerMultiploQueSupera(5, 20)
     *   → 5 + 10 = 15
     *   → al intentar sumar 15 se pasa
     *   → retorna 15
     * - primerMultiploQueSupera(4, 3)
     *   → 4 ya supera
     *   → retorna 0
     * - primerMultiploQueSupera(2, 1)
     *   → retorna 0
     */

    public static void main(String[] args){
        System.out.println(firstMultipleThatExceeds(3,10));
        System.out.println(firstMultipleThatExceeds(5,20));
        System.out.println(firstMultipleThatExceeds(4,3));
        System.out.println(firstMultipleThatExceeds(2,1));
    }

    static int firstMultipleThatExceeds(int base, int limit) {
        int acc = 0;
        while (acc< limit) {
            if(acc+base>=limit) break;
            acc +=base;
        }
        return acc;
    }
}
