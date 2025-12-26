package practice.functions;

public class exercise14 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una funcion que imprima "El número es: X"
     *
     * Desde main:
     * - declara una variable con cualquier valor
     * - pásala a la función
     *
     * Reglas
     * - static
     * - Java puro
     * - Sin Scanner
     * - Sin variables globales
     */

    public static void main(String[] args) {
        int num = 24;
        showNumber(num);
    }

    static void showNumber(int num) {
        System.out.println("El número es: "+num);
    }
}
