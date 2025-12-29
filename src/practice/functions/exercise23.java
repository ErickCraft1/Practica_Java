package practice.functions;

public class exercise23 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función bigPar
     * Debe :
     * - retornar el número par más grande
     * - si no hay ningún par, retornar -1
     * - no imprimir
     * - no arrays
     * - no Scanner
     *
     * Desde main:
     * - prueba con al menos 4 combinaciones
     *
     * Ejemplos
     * - (2, 8, 4) → 8
     * - (1, 3, 6) → 6
     * - (2, -4, 0) → 2
     * - (1, 3, 5) → -1
     */

    public static void main(String[] args) {
        System.out.println(bigPar(2, 8, 4));
        System.out.println(bigPar(1, 3, 6));
        System.out.println(bigPar(2, -4, 0));
        System.out.println(bigPar(1, 3, 5));
    }

    static int bigPar(int a, int b, int c) {
        int acc = -1;
        if(a%2==0 && acc < a){
            acc = a;
        }
        if(b%2==0 && acc < b){
            acc = b;
        }
        if(c%2==0 && acc < c){
            acc = c;
        }
        return acc;
    }
}
