package practice.arrays;

public class exercise36 {
    /*
     * Practicando Arrays
     *
     * Crear una función averagePositive
     *
     * Debe:
     * - retornar el promedio de las ventas positivas.
     *
     * Reglas:
     * - si no hay ventas positivas → retorna 0
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     * - necesitas contar y sumar (idea clave)
     *
     * Desde main:
     * - prueba con al menos 3 arrays
     *
     * Ejemplos:
     * - averagePositive(new int[]{10, -5, 20, 0}) → 15
     * - averagePositive(new int[]{-1, -2}) → 0
     * - averagePositive(new int[]{5, 5, 5}) → 5
     */

    public static void main(String[] args){
        System.out.println(averagePositive(new int[]{10,-5,20,0}));
        System.out.println(averagePositive(new int[]{-1,-2}));
        System.out.println(averagePositive(new int[]{5,5,5}));
    }

    static int averagePositive(int[] num) {
        int acc = 0;
        int count = 0;

        for (int i = 0; i<num.length;i++){
            if(num[i]>0){
                count++;
                acc+=num[i];
            }
        }
        if (count==0) return 0;
        return acc/count;
    }

}
