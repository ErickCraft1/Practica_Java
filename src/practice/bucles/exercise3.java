package practice.bucles;

public class exercise3 {
    /*
    * Practica bucle for hasta dominarlo
    * Tablas de multiplicar
    */
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        for (int i = 0; i<=num1;i++) {
            for (int j = 0; j<=num2;j++) {
                int result = i*j;
                System.out.println("El resultado de multiplicar "+i+" * "+j+" es: "+result);
            }
        }
    }
}
