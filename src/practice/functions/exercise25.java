package practice.functions;

public class exercise25 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función sumarParesHasta
     * Debe :
     * - retornar la suma de los números pares desde 1 hasta n
     * - si n <= 0, retornar 0
     * - usar for o while
     * - no imprimir
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 4 valores distintos
     * - imprime el resultado
     *
     * Ejemplos
     * - sumarParesHasta(10) -> 30 (2+4+6+8+10)
     * - sumarParesHasta(7) → 12
     * - sumarParesHasta(0) → 0
     * - sumarParesHasta(-5) → 0
     */

    public static void main(String[] args){
        System.out.println(addPairsUntil(10));
        System.out.println(addPairsUntil(7));
        System.out.println(addPairsUntil(0));
        System.out.println(addPairsUntil(-5));
    }

    static int addPairsUntil(int n) {
        int count = 0;
        for (int i=1;i<=n;i++){
            if(i%2==0) {
                count=count+i; //count+=i
            }
        }
        return count;
    }
}
