package practice.functions;

public class exercise16 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una funcion que:
     * - devuelva true si el número es mayor que 0
     * - false en caso contrario
     *
     * Desde main:
     * - prueba la función con dos valores distintos
     * - imprime el resultado
     *
     * Reglas
     * - static
     * - El método solo retorna
     * - Sin Scanner
     */

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 0;
        System.out.println(isPositive(num1));
        System.out.println(isPositive(num2));
    }

    static boolean isPositive(int num) {
        boolean result = num > 0;
        return result;
    }
}
