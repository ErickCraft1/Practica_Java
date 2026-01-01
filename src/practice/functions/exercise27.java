package practice.functions;

public class exercise27 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función sumarHastaLimiteExacto
     * Debe :
     * - sumar desde 1 en adelante
     * - detenerse antes de pasarse el límite
     * - retornar la suma
     * - usar while
     * - NO usar break
     * - no imprimir
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 4 valores distintos
     * - imprime el resultado
     *
     * Ejemplos
     * - sumarHastaLimiteExacto(10) → 10
     * - sumarHastaLimiteExacto(20) → 15 (1+2+3+4+5)
     * - sumarHastaLimiteExacto(1) → 1
     * - sumarHastaLimiteExacto(0) → 0
     */

    public static void main(String[] args) {
        System.out.println(addUptoExactLimit(10));
        System.out.println(addUptoExactLimit(20));
        System.out.println(addUptoExactLimit(1));
        System.out.println(addUptoExactLimit(0));
    }

    static int addUptoExactLimit(int limit) {
        int count = 1;
        int acc = 0;
        while (acc+count<=limit) {
            acc +=count;
            count++;
        }
        return acc;
    }
}
