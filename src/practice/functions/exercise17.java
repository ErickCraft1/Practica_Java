package practice.functions;

public class exercise17 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una funcion que:
     * - retorne el número mayor
     * - si son iguales, retorna cualquiera
     *
     * Desde main:
     * - prueba con al menos dos pares distintos
     * - imprime el resultado
     *
     * Reglas
     * - static
     * - El método solo retorna
     * - Sin Scanner
     */

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        num1 = 12;
        num2 = 31;
        num3 = 81;
        num4 = 45;
        System.out.println(bigger(num1, num2));
        System.out.println(bigger(num3, num4));
    }

    static int bigger(int a, int b) {
        int result = a>b ? a : b;
        return result;
    }
}
