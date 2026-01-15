package practice.functions;

public class exercise32 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crea una función sumaHastaQueSiguienteExceda
     *
     * Debe:
     * - recibir dos números: base y limit
     * - sumar múltiplos de base empezando desde base
     * - detenerse justo antes de que el siguiente múltiplo haga que la suma supere limit
     * - retornar la suma total
     *
     * Reglas:
     * - usar while
     * - no imprimir dentro del método
     * - no arrays
     * - no Scanner
     * - no break
     * - No se permite:
     *   - no continue
     *   - La lógica debe detenerse naturalmente
     * - El valor retornado debe ser coherente incluso en casos límite
     *
     * Desde main:
     * - prueba con al menos 4 combinaciones distintas
     *
     * Ejemplos:
     * - sumaHastaQueSiguienteExceda(3, 20)
     *   - multiplos → 3, 6, 9
     *   - suma → 3 + 6 + 9 = 18
     *   - siguiente serîa 12 → 18 + 12 = 30 ❌
     *   - retorna 18
     * - sumaHastaQueSiguienteExceda(5, 20)
     *     → 5 + 10 = 15
     *   - siguiente 15 → 30 ❌
     *   - retorna 15
     * - sumaHastaQueSiguienteExceda(4, 3)
     *   - 4 ya supera
     *   - retorna 0
     * - sumaHastaQueSiguienteExceda(2, 1)
     *   - no entra al bucle
     *   - retorna 0
     */

    public static void main(String[] args){
        System.out.println(sumUntilNextExceeds(3,20));
        System.out.println(sumUntilNextExceeds(5,20));
        System.out.println(sumUntilNextExceeds(4,3));
        System.out.println(sumUntilNextExceeds(2,1));
    }

    static int sumUntilNextExceeds(int base, int limit){
        int acc=0;
        int multip = base;
        while (acc+multip<=limit){
            acc+=multip;
            multip+=base;
        }
        return acc;
    }
}
