package practice.functions;

import java.util.Scanner;

public class exercise12 {
    /*
     * Practicando funciones hasta dominarlo
     *
     *
     * Crea un programa que tenga estos métodos:
     * - mostrarMenu()
     *   👉 Solo imprime el menú
     *  - sumar(Scanner teclado)
     *    👉 Pide dos números y muestra la suma
     *  - restar(Scanner teclado)
     *    👉 Pide dos números y muestra la resta
     *  - main()
     *    👉 Controla el flujo con do–while
     * 🔒 REGLAS
     *  Todos los métodos deben ser static
     *  No arrays
     *  No clases extra
     *  El Scanner no se crea dentro de los métodos, se pasa como parámetro
     *  Usar do–while
     */


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bienvenido, que desea realizar el día de hoy?");
        mostrarMenu();
        int num, a, b;


        String firstNumber = "Primer número: ";
        String secondNumber = "Segundo número: ";

        String selectOption = "Usted eligio ";
        String inputNumber = "Coloque los 2 números a ";

        do {
            num = keyboard.nextInt();
            if (num == 1) {
                System.out.println(selectOption + "sumar");
                System.out.println(inputNumber + "sumar");
                a = keyboard.nextInt();
                b = keyboard.nextInt();
                System.out.println(firstNumber + a);
                System.out.println(secondNumber + b);
                System.out.println(sumar(a,b));
                mostrarMenu();
            }else if (num == 2) {
                System.out.println(selectOption + "restar");
                System.out.println(inputNumber + "restar");
                a = keyboard.nextInt();
                b = keyboard.nextInt();
                System.out.println(firstNumber + a);
                System.out.println(secondNumber + b);
                System.out.println(restar(a,b));
                mostrarMenu();
            }else if (num == 3){
                System.out.println("Usted eligio salir, vuelva pronto.");
            }
        } while (num != 3);

        keyboard.close();

    }

    static void mostrarMenu() {
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Salir");
    }

    static int sumar(int a, int b) {
        int result = a + b;
        System.out.print("El resultado de la suma es: ");
        return result;
    }

    static int restar(int a, int b) {
        int result = a - b;
        System.out.print("El resultado de la resta es: ");
        return result;
    }

}
