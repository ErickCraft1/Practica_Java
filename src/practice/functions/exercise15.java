package practice.functions;

public class exercise15 {
    /*
     * Practicando funciones hasta dominarlo
     *
     * Crean una funcion que devuelva el doble del número recibido
     *
     * Desde main:
     * - llama a la función
     * - imprime el resultado
     *
     * Reglas
     * - static
     * - El método debe retornar, no imprimir
     * - La impresión ocurre en main
     * - Sin Scanner
     */

    public static void main(String[] args) {
        int num = 32;
        System.out.println("El doble del "+ num+ " es: "+duplicateNumber(num));
    }

    static int duplicateNumber(int num) {
        return num*2;
    }
}
