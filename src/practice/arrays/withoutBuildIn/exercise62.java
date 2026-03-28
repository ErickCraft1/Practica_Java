package practice.arrays.withoutBuildIn;

public class exercise62 {
    /*
     * Practicando Arrays
     *
     * Crear una función subarraySumInRange(int[] num, int a, int b).
     *
     * Debe:
     * - retornar la longitud del subarray más largo cuya suma esté en el rango [a, b].
     * - es decir: a <= suma <= b.
     *
     * Reglas:
     * - Puede haber negativos.
     * - No se reinicia al encontrar negativo.
     * - Ya no sirve el patrón "bloques".
     * - Aquí necesitas ventanas deslizantes real (two poniters).
     * - No uses métodos built-in.
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - subarraySumInRange(new int[]{1, 2, 1, 0, 1, 1, 0}, a=2, b=4)    → 5
     * - subarraySumInRange(new int[]{1, 1, 1, 1, 1}, a=2, b=3)          → 3
     * - subarraySumInRange(new int[]{3, 1, 1, 1, 3}, a=3, b=5)          → 3
     * - subarraySumInRange(new int[]{6, 1, -2, 1, 4}, a=2, b=6)         → 4
     * - subarraySumInRange(new int[]{6, 1, -2, 1, 4}, a=1, b=3)         → 3
     */

    public static void main(String[] args) {
        System.out.println(subarraySumInRange(new int[]{1, 2, 1, 0, 1, 1, 0}, 2, 4));
        System.out.println(subarraySumInRange(new int[]{1, 1, 1, 1, 1}, 2, 3));
        System.out.println(subarraySumInRange(new int[]{3, 1, 1, 1, 3}, 3, 5));
        System.out.println(subarraySumInRange(new int[]{6, 1, -2, 1, 4}, 2, 6));
        System.out.println(subarraySumInRange(new int[]{6, 1, -2, 1, 4}, 1, 3));
    }

    static int subarraySumInRange(int[] num, int a, int b){
        if(num.length<1) return 0;
        int sum=0, len=0, wind=0, right=0, left=0;

        while (right<num.length){
            sum+=num[right];
            right++;
            wind=right-left;
            while (sum>b){
                sum-=num[left];
                left++;
                wind=right-left;
            }
            if(a<=sum && sum<=b){
                len = wind;
            }
        }
        return len;
    }
}



/*
 * El ejercicio anterior tenía un único límite --- contraer cuando *sum>k*. Este añade uno nuevo,
 * creando tres estados posible: suma insuficiente, suma válida y suma excesiva. Cada estado tiene
 * una acción diferente. Lo nuevo fue aprender a clasificar el estado de la ventana en cada paso y actuar
 * de forma diferente según el estado en cuestión.
 *
 *
 *
 *
 * The previous exercise had a single limit—collapse when *sum>k*. This one adds a new one,
 * creating three possible states: insufficient sum, valid sum, and excessive sum. Each state has
 * a different action. The new thing was learning to classify the window's state at each step and act
 * differently depending on which one it is.
 *
 *
 * */