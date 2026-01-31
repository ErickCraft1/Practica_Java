package practice.arrays;

public class exercise41 {
    /*
     * Practicando Arrays
     *
     * Crear una función firstNegativeAfterPositive
     *
     * Debe:
     * - recorrer el array de izquierda a derecha
     * - retornar el primer número negativo que aparezca DESPUÉS de haber encontrado al menos un positivo
     * - si no existe ese caso, retorna -1
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     * - usar break si es necesario
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - firstNegativeAfterPositive(new int[]{-1, -2, 3, -4, 5}) → -4
     * - firstNegativeAfterPositive(new int[]{1, 2, 3, -1}) → -1
     * - firstNegativeAfterPositive(new int[]{0, 2, -5}) → -5
     * - firstNegativeAfterPositive(new int[]{-1, -2, -3}) → -1
     * - firstNegativeAfterPositive(new int[]{}) → -1
     */

    public static void main(String[] args) {
        System.out.println(firstNegativeAfterPositive(new int[]{-1, -2, 3, -4, 5})); // -4
        System.out.println(firstNegativeAfterPositive(new int[]{1, 2, 3, -1})); // -1
        System.out.println(firstNegativeAfterPositive(new int[]{0, 2, -5})); // -5
        System.out.println(firstNegativeAfterPositive(new int[]{-1, -2, -3})); // -1
        System.out.println(firstNegativeAfterPositive(new int[]{})); // -1
        System.out.println(firstNegativeAfterPositive(new int[]{0, 2, 5})); // -1
        System.out.println(firstNegativeAfterPositive(new int[]{-1, 2, 1, -8, -6})); // -8 ️️
        System.out.println(firstNegativeAfterPositive(new int[]{-1, 3, -4, 10, -7})); // -4

    }

    static int firstNegativeAfterPositive(int[] num){
        boolean foundPositive = false;
        for (int i=0;i<num.length;i++){
            if (num[i]>0) {
                foundPositive = true;
            } else if(num[i]<0 && foundPositive) {
                return num[i];
            }
        }
        return -1;
    }
}
