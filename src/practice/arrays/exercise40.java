package practice.arrays;

public class exercise40 {
    /*
     * Practicando Arrays
     *
     * Crear una función sumSecondMaxPositive
     *
     * Debe:
     * - retornar la suma del mayor positivo y el segundo mayor positivo
     *
     * Reglas:
     * - solo números > 0
     * - si no existen al menos 2 positivos distintos, retornar -1
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - sumSecondMaxPositive(new int[]{1, 5, 3, 10, 8}) → 18
     * - sumSecondMaxPositive(new int[]{10, 10,5}) → 15
     * - sumSecondMaxPositive(new int[]{5}) → -1
     * - sumSecondMaxPositive(new int[]{-1, -2}) → -1
     * - sumSecondMaxPositive(new int[]{0, 10}) → -1
     */
    public static void main(String[] args){
        System.out.println(sumSecondMaxPositive(new int[] {1, 5, 3, 10, 8}));
        System.out.println(sumSecondMaxPositive(new int[] {10, 10, 5}));
        System.out.println(sumSecondMaxPositive(new int[] {5}));
        System.out.println(sumSecondMaxPositive(new int[] {-1, -2}));
        System.out.println(sumSecondMaxPositive(new int[] {0, 10}));
    }

    static int sumSecondMaxPositive(int[] num){
        int max=0;
        int second = 0;
        if (num.length == 1) return -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                second = max;
                max = num[i];
            }
            if (num[i] < max && num[i] > second) second = num[i];
        }
        if (max < 1 || second < 1) return -1;
        return max + second;
    }
}
