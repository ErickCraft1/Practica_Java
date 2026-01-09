package practice.functions;

public class exercise30 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crea una función maxHastaLimite
     *
     * Debe:
     * - recorrer números desde 1 hasta limit
     * - retornar el número MÁS GRANDE que sea múltiplo de base
     * - si no existe ningún múltiplo válido, retornar -1
     *
     * Reglas:
     * - usar while o for
     * - no imprimir dentro del método
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 4 combinaciones distintas
     *
     * Ejemplos:
     * - maxHastaLimite(3, 10) → 9
     * - maxHastaLimite(5, 23) → 20
     * - maxHastaLimite(4, 3) → -1
     * - maxHastaLimite(2, 1) → -1
     */

    public static void main(String[] args){
        System.out.println(maxToUpLimit(3,10));
        System.out.println(maxToUpLimit(5,23));
        System.out.println(maxToUpLimit(4,3));
        System.out.println(maxToUpLimit(2,1));
    }

    static int maxToUpLimit(int base, int limit){
        int max = -1;
        int current = base;
        while (current<=limit){
            max = current;
            current+=base;
        }
        return max;
    }
}
