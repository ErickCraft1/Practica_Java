    package practice.functions;

    public class exercise19 {
        /*
         * Practicando funciones hasta dominarlo
         *
         * Crean dos función:
         * - esPar
         * - esPositivoPar
         *
         * Desde main:
         * - prueba con al menos 4 valores distintos
         *   - positivo par
         *   - positivo impar
         *   - cero
         *   - negativo par
         *
         * Reglas
         * - esPar → retorna si el número es par
         * - esPositivoPar:
         *   - usa esPar
         *   - retorna true solo si el número es positivo y par
         * - Ningún método imprime
         * - Todo se imprime desde main
         * - Sin Scanner
         */
        public static void main(String[] args) {
            int num, num1, num2, num3;
            num = 2;
            num1 = 9;
            num2 = 0;
            num3 = -2;
            System.out.println(isPositivePar(num));
            System.out.println(isPositivePar(num1));
            System.out.println(isPositivePar(num2));
            System.out.println(isPositivePar(num3));
        }

        static boolean isPar(int n) {
            return n % 2 == 0;
        }
        static boolean isPositivePar(int n) {
            if (isPar(n)) {
                return n >= 0;
            }
            return false;
            // return n > 0 && isPar(n);
        }
    }
