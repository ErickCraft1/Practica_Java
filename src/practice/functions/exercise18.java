package practice.functions;

public class exercise18 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una funcion que:
     * - retorne true si el número es par
     * - false si es impar
     *
     * Desde main:
     * - prueba con 3 números distintos
     * - imprime los resultados
     *
     * Reglas
     * - static
     * - El método solo retorna
     * - Usa operador módulo %
     */

    public static void main(String[] args) {
        int num, num1, num2;
        num = 2;
        num1 = 21;
        num2 = 30;
        String txt = "El número es par?: ";
        System.out.println(txt+isPar(num));
        System.out.println(txt+isPar(num1));
        System.out.println(txt+isPar(num2));
    }

    static boolean isPar(int num) {
        return num % 2 == 0;
    }
}
