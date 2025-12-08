package functions;

public class Funciones {

    public static void main(String[] args) {

        // opción 1: función sin parámetros y sin tipo de retorno
//        showMenu();
//        showMenu();

        // opción 2: fución con parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);

//        opción 3:
//        funcion con parametros y sin tipo de retorno.
        imprimirSaludoBuenosDias("ErickCraft");

//        opcion 4 :
//        funciones con parámetros y tipo de retorno
        String nombre = "Alan";
        String apellido = "Walker";
        String saludo = obtenerSaludo(nombre,apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);

        System.out.println(getPriceIGV(180));
    }

    static int suma(int number1, int number2) {
        return number1 + number2;
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas noches " + nombre + " " + apellido;
    }

    static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenas noches " + name);
    }

    static double getPrice(){
        return 100.99;
    }

    static void showMenu() {
        System.out.println("Bienveidos al E-Commerce de zapatillas:");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
      }

      static String getMenu() {
        return "Bienveidos al E-Commerce de zapatillas: \n 1 - Ver zapatillas....";
    }

    static double getPriceIGV(double price) {
        return price + (price * 0.18);
    }
}
