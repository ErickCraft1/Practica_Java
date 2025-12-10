package practice.bucles;

public class exercise2 {


    /*
     * Practicar bucle for hasta dominarlo
     * Contar multipos que tiene un número
     */

    public static void main (String[] args) {
        int num = 10;
        int count = 0;
        int multiplos= 3;

        for (int i=0; i<num;i++) {
            if(i % multiplos == 0) {
                count++;
            }
        }
        System.out.println("Los multiplos de "+multiplos+" dentro del rango de "+num+" son: "+count);
    }

}
