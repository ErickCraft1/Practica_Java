package practice.functions;

public class exercise31 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crea una función sumarMultiplosHasta
     *
     * Debe:
     * - recibir dos números: base y limit
     * - sumar todos los múltiplos de base
     * - sin pasarse de limit
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
     * - sumarMultiplosHasta(3, 10) → 3 + 6 + 9 = 18
     * - sumarMultiplosHasta(5, 20) → 5 + 10 + 15 + 20 = 50
     * - sumarMultiplosHasta(4, 3) → 0
     * - sumarMultiplosHasta(2, 1) → 0
     */

    public static void main (String[] args) {
        System.out.println(addMultipleToUp(3,10));
        System.out.println(addMultipleToUp(5,20));
        System.out.println(addMultipleToUp(4,3));
        System.out.println(addMultipleToUp(2,1));
    }

    static int addMultipleToUp(int base, int limit){
        int acc = 0;
        int multip=base;
        while (multip<=limit){
            acc+=multip;
            multip+=base;
        }
        return acc;
    }
}
