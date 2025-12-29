package practice.functions;

public class exercise24 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función contarParesHasta
     * Debe :
     * - retornar cuántos números pares hay desde 1 hasta n
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
     * - contarParesHAsta(10) -> 5
     * - contarParesHasta(7) → 3
     * - contarParesHasta(0) → 0
     * - contarParesHasta(-5) → 0
     */

    public static void main(String[] args){
        System.out.println(countPairsUntil(10));
        System.out.println(countPairsUntil(7));
        System.out.println(countPairsUntil(0));
        System.out.println(countPairsUntil(-5));
    }

    static int countPairsUntil(int n) {
        int count = 0;
        for (int i=1;i<=n;i++){
            if(i%2==0) count++;
        }
        return count;
    }
}
