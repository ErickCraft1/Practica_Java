package practice.functions;

public class exercise20 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una función evaluarNumero
     * Debe retornar:
     * - "Positivo par"
     * - "Positivo impar"
     * - "Cero"
     * - "Negativo"
     *
     * Desde main:
     * - prueba con al menos 4 valores
     *
     * Reglas
     * - No imprimir dentro de la función
     * - Toda la impresión ocurre en main
     *   Puedes reutilizar isPar
     * - Sin Scanner
     */

    public static void main(String[] args) {
        int num, num1, num2, num3;
        num = 2;
        num1 = 9;
        num2 = 0;
        num3 = -2;
        System.out.println(evaluateNumber(num));
        System.out.println(evaluateNumber(num1));
        System.out.println(evaluateNumber(num2));
        System.out.println(evaluateNumber(num3));
    }

    static boolean isPar2(int n) {
        return n % 2 == 0;
    }
    static String evaluateNumber(int n) {
        if (isPar2(n)) {
            if(n > 0) {
                return "Positivo par";
            }else if (n == 0) {
                return "Cero";
            } else if (n < 0) {
                return "Negativo";
            }
        }else if (n <0) {
            return "Negativo";
        }
        return "Positivo impar";
    }
}
