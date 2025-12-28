package practice.functions;

public class exercise21 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función contarPositivos
     * Debe :
     * - retornar cuántos de los tres números son positivos
     * - no imprimir
     * - no usar arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 3 combinaciones distintas
     * - imprime el resultado
     *
     * Ejemplos
     * - (1, 2, 3) → 3
     * - (1, -2, 0) → 1
     *   (-1, -2, -3) → 0
     */

    public static void main(String[] args){
        System.out.println(countPositive(1, 2, 3));
        System.out.println(countPositive(2, -2, 0));
        System.out.println(countPositive(-1, -2, -3));
    }

    static int countPositive(int num, int num1, int num2) {
        int count = 0;
        if (num>0) count++;
        if(num1>0) count++;
        if(num2>0) count++;
        return count;
    }
}
