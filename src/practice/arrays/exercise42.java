package practice.arrays;

import java.io.StringReader;

public class exercise42 {
    /*
     * Practicando Arrays
     *
     * REGLAS:
     * - solo for
     * - sin arrays auxiliares
     * - sin ordenar
     * - sin break innecesarios
     * - Prioriza booleano
     *
     * 42.1 : firstPositiveAfterNegative()
     * Ejemplos:
     * - firstPositiveAfterNegative(new int[] {-1, 2, 3}); -> 2
     * - firstPositiveAfterNegative(new int[] {1, -2, -3, 4}) -> 4
     * - firstPositiveAfterNegative(new int[] {1, 2, 3}); -> -1
     * - firstPositiveAfterNegative(new int[] {-1, -2}); -> -1
     *
     * 42.2 : firstNonZeroAfterPositive()
     * Ejemplos:
     * - firstNonZeroAfterPositive(new int[] {0, 2, 0, 0, 5}); -> 5
     * - firstNonZeroAfterPositive(new int[] {1, 0, 0}); -> -1
     * - firstNonZeroAfterPositive(new int[] {-1, 0, 3}); -> -1
     *
     * 42.3 : countNegativesAfterPositive()
     * Ejemplos:
     * - countNegativesAfterPositive(new int[] {-1, 2, -3, -4}); -> 2
     * - countNegativesAfterPositive(new int[] {1, -1, 1, -1}); -> 2
     * - countNegativesAfterPositive(new int[] {-1, -2, 3}); -> 0
     *
     * 42.4 : hasNegativeAfterPositive()
     * Ejemplos:
     * - hasNegativeAfterPositive(new int[] {1, 2, -3}) -> true
     * - hasNegativeAfterPositive(new int[] {-1, 2, 3}); -> false
     * - hasNegativeAfterPositive(new int[] {0, 1, 0}); -> false
     *
     * 42.5 : firstTrendBreak()
     * Ejemplos:
     * - firstTrendBreak(new int[] {1, 2, 3, 2}); -> 2
     * - firstTrendBreak(new int[] {5, 4, 3, 2}); -> -1
     * - firstTrendBreak(new int[] {1, 2, 3, 4}); -> -1
     * - firstTrendBreak(new int[] {5, 6, 7, 8, 1}); -> 1
     * - firstTrendBreak(new int[] {1, 2, 3, 8}); -> -1
     * - firstTrendBreak(new int[] {1, 1, 1, 4}); -> -1
     *
     */

    public static void main(String[] args) {
        // 42.1
        System.out.println(firstPositiveAfterNegative(new int[]{-1, 2, 3}));
        System.out.println(firstPositiveAfterNegative(new int[]{1, -2, -3, 4}));
        System.out.println(firstPositiveAfterNegative(new int[]{1, 2, 3}));
        System.out.println(firstPositiveAfterNegative(new int[]{-1, -2}));
        
        // 42.2
        System.out.println(firstNonZeroAfterPositive(new int[]{0, 2, 0, 0, 5}));
        System.out.println(firstNonZeroAfterPositive(new int[]{1, 0, 0}));
        System.out.println(firstNonZeroAfterPositive(new int[]{-1, 0, 3}));
        
        // 42.3
        System.out.println(countNegativesAfterPositive(new int[]{-1, 2, -3, -4}));
        System.out.println(countNegativesAfterPositive(new int[]{1, -1, 1, -1}));
        System.out.println(countNegativesAfterPositive(new int[]{-1, -2, 3}));
        
        // 42.4
        System.out.println(hasNegativeAfterPositive(new int[]{1, 2, -3}));
        System.out.println(hasNegativeAfterPositive(new int[]{-1, 2, 3}));
        System.out.println(hasNegativeAfterPositive(new int[]{0, 1, 0}));
        
        // 42.5
        System.out.println(firstTrendBreak(new int[]{1, 2, 3, 2}));
        System.out.println(firstTrendBreak(new int[]{5, 4, 3, 2}));
        System.out.println(firstTrendBreak(new int[]{1, 2, 3, 4}));
        System.out.println(firstTrendBreak(new int[]{5, 6, 7, 8, 1}));
        System.out.println(firstTrendBreak(new int[]{1, 2, 3, 8}));
        System.out.println(firstTrendBreak(new int[]{1, 1, 1, 4}));
    }

    // 42.1
    static int firstPositiveAfterNegative(int[] num){
        boolean foundNegative = false;
        for (int i=0;i<num.length;i++){
            if(num[i]<0) {
                foundNegative = true;
            } else if(num[i]>0 && foundNegative) {
                return num[i];
            }
        }
        return -1;
    }
    
    // 42.2
    static int firstNonZeroAfterPositive(int[] num){
        boolean foundPositive = false;
        for (int i=0;i<num.length;i++){
            if(num[i]>0 && !foundPositive){
                foundPositive = true;
            } else if(foundPositive && num[i]!=0) return num[i];
        }
        return -1;
    }
    
    // 42.3
    static int countNegativesAfterPositive(int[] num){
        int count=0;
        boolean foundPositive = false;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>0) {
                foundPositive = true;
            } else if(num[i]<0 && foundPositive)count++;
        }
        return count;
    }
    
    // 42.4
    static boolean hasNegativeAfterPositive(int[] num){
        boolean foundPositive = false;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>0){
                foundPositive = true;
            } else if (num[i]<0 && foundPositive) return true;
        }
        return false;
    }
    
    // 42.5
    static int firstTrendBreak(int[] num){
        if(num.length<2) return -1;

        int trend = 0; // 0 = indefinida, 1 = ascendente, -1 = descendente

        for (int i = 1; i < num.length; i++) {
            if(num[i] == num[i-1]) continue;

            if(trend == 0){
                trend = num[i] > num[i-1] ? 1 : -1;
            } else {
                if(trend == 1 && num[i] < num[i-1]) return num[i];
                if(trend == -1 && num[i] > num[i-1]) return num[i];
            }
        }
        return -1;
    }
}
