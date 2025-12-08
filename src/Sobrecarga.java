public class Sobrecarga {

    /**
     * Sobrecarga permite duplicar un método siempre y cuando tengan diferente numer/tipo parametros.
     */
    public  static void main(String[] args) {

    }

    static int suma (int number1, int number2) {
        return number1 + number2;
    }

    static double suma (double number1, double number2) {
        return number1 + number2;
    }

    static int suma(int number1, int number2, int number3) {
        return  number1 + number2;
    }
}
