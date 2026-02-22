package practice.arrays;

public class exercise56 {
    /*
     * Practicando Arrays
     *
     * Crear una función secuenciPositive
     *
     * Debe:
     * - Encuentra la primera secuencia de 3 números positivos consecutivos.
     * - Si aparece un número ≤ 0, debes reiniciar el conteo.
     * - La suma debe ser > 10
     * - Retornar la primera suma que cumpla.
     * - Si no existe → retornar -1
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - secuenciPositive(new int[]{5, 3, -1, 4, 4, 4}) → 12   (4+4+4)
     * - secuenciPositive(new int[]{2, 2, 2, 1})       → -1
     * - secuenciPositive(new int[]{6, 6, 1, 1})       → 13
     * - secuenciPositive(new int[]{1, 2, 3, 4, 5})    → 12
     */

    public static void main(String[] args) {
        System.out.println(secuenciPositive(new int[]{5, 3, -1, 4, 4, 4}));
        System.out.println(secuenciPositive(new int[]{2, 2, 2, 1}));
        System.out.println(secuenciPositive(new int[]{6, 6, 1, 1}));
        System.out.println(secuenciPositive(new int[]{1, 2, 3, 4, 5}));
        System.out.println(secuenciPositive(new int[]{1,2,3,-1,4,5,6}));
    }

    static int secuenciPositive(int[] num){
        int count = 0, sum = 0;
        if(num.length<3)return -1;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>0){
                count++;
            }else {
                count = 0;
                sum = 0;
            }
            if(count>=3){
                count = 3;
                sum=num[i-2]+num[i-1]+num[i];
            }
            if(count==3&&sum>10) return sum;
        }
        return -1;
    }
}
