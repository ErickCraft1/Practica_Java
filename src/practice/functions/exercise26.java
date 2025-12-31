package practice.functions;

public class exercise26 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función sumarHastaLimite
     * Debe :
     * - sumar los números desde 1 en adelante
     * - detenerse cuando la suma supere el valor de límite
     * - retornar la suma final
     * - usar for o while
     * - usar break
     * - no imprimir
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 4 valores distintos
     * - imprime el resultado
     *
     * Ejemplos
     * - sumarHastaLimite(10)
     *    → 1 + 2 + 3 + 4 = 10
     *    → al intentar sumar 5 se pasaría
     *    → retorna 10
     * - sumarHastaLimite(20)
     *    → 1 + 2 + 3 + 4 + 5 + 6 = 21
     *    → retorna 21
     * - sumarHastaLimite(1)
     *    → 1
     * - sumarHastaLimite(0)
     *    → 0
     */

    public static void main(String[] args) {
        System.out.println(addUptoLimit(10));
        System.out.println(addUptoLimit(20));
        System.out.println(addUptoLimit(1));
        System.out.println(addUptoLimit(0));
    }

    static int addUptoLimit(int limit) {
        int count = 1;
        int acc = 0;
        while (count <= limit) {
            acc += count;
            if (acc >= limit){
                break;
            }
            count++;
        }
        return acc;
    }
}
