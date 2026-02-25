package practice.arrays;

public class exercise58 {
    /*
     * Practicando Arrays
     *
     * Crear una función sumMaxSequence
     *
     * Debe:
     * - retornar la suma máxima dentro de cualquier secuencia de positivos consecutivos.
     *
     * Reglas:
     * - si no hay positivos → retorna 0
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - sumMaxSequence(new int[]{1,2,-1,3,4,5,-2,6}) → 12 (3,4,5)
     * - sumMaxSequence(new int[]{5,6,7,-1,2})        → 18
     * - sumMaxSequence(new int[]{-3,-2,4,4,4})       → 12
     * - sumMaxSequence(new int[]{2,-1,3,-2,4,-3,5})  → -5
     * - sumMaxSequence(new int[]{-1,-2,-3,-4})       → 0
     */

    public static void main(String[] args) {
        System.out.println(sumMaxSequence(new int[]{1, 2, -1, 3, 4, 5, -2, 6}));
        System.out.println(sumMaxSequence(new int[]{5, 6, 7, -1, 2}));
        System.out.println(sumMaxSequence(new int[]{-3, -2, 4, 4, 4}));
        System.out.println(sumMaxSequence(new int[]{2, -1, 3, -2, 4, -3, 5}));
        System.out.println(sumMaxSequence(new int[]{-1, -2, -3, -4}));
//        System.out.println(sumMaxSequenceLen(new int[]{3, 4, 5, 6}));
    }

    static int sumMaxSequence(int[] num) {
        int sum=0,maxSum=0;
        if(num.length<1)return maxSum;

        for (int i = 0; i < num.length; i++) {
            if(num[i]>0){
                sum+=num[i];
            } else {
                sum = 0;
                continue;
            }
            if(sum>maxSum)maxSum=sum;
        }
        return maxSum;
    }

//    static int sumMaxSequenceLen(int[] num) {
//        int sum=0,maxSum=0, len=0;
//        if(num.length<1)return maxSum;
//
//        for (int i = 0; i < num.length; i++) {
//            if(num[i]>0){
//                len++;
//                sum+=num[i];
//            } else {
//                sum = 0;
//                len = 0;
//                continue;
//            }
//            if(len>=3 && sum>maxSum)maxSum=sum;
//        }
//        return maxSum;
//    }
}
