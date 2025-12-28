package practice.functions;

public class exercise22 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función sumarPares
     * Debe :
     * - retornar la suma solo de los números pares
     * - ignorar impares
     * - no imprimir
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 3 combinaciones distintas
     * - imprime el resultado
     *
     * Ejemplos
     * - (2, 4, 6) → 12
     * - (1, 2, 3) → 2
     * - (1, 3, 5) → 0
     * - (2, -4, 3) → -2
     */

    public static void main(String[] args){
        System.out.println(addPares(2,4,6));
        System.out.println(addPares(1,2,3));
        System.out.println(addPares(1,3,5));
        System.out.println(addPares(2,-4,3));
    }

    static int addPares(int a, int b, int c) {
        int acc = 0;
        if(a%2==0) acc = acc + a;
        if(b%2==0) acc = acc + b;
        if(c%2==0) acc = acc + c;
        return acc;
    }
}
