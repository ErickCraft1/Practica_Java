package practice;

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        int matriz [][] = new int[4][4];
        Scanner teclado = new Scanner(System.in);
        int add = 0;

        String alumnos [] = new String [4];
        alumnos[0] = "Pepe";
        alumnos[1] = "Juan";
        alumnos[2] = "Jose";
        alumnos[3] = "Jorge";

        System.out.println("Ingrese el nombre del alumno");
        String alumno = teclado.next();
        for (int f=0;f<4;f++){
            if (alumno.equals(alumnos[0])){
                System.out.println("Ingrese las notas del alumno "+alumnos[0]);
                for (int c = 0; c <3; c++){
                    matriz[f][c] = teclado.nextInt();
                    add = add + matriz[f][c];
                }
                matriz[f][3] = add / 3;
                add = 0;
                alumno = teclado.next();
            } else if(alumno.equals(alumnos[1])){
                System.out.println("Ingrese las notas del alumno "+alumnos[1]);
                for (int c = 0; c <3; c++){
                    matriz[f][c] = teclado.nextInt();
                    add = add + matriz[f][c];
                }
                matriz[f][3] = add / 3;
                add = 0;
                alumno = teclado.next();
            }else if(alumno.equals(alumnos[2])){
                System.out.println("Ingrese las notas del alumno "+alumnos[2]);
                for (int c = 0; c <3; c++){
                    matriz[f][c] = teclado.nextInt();
                    add = add + matriz[f][c];
                }
                matriz[f][3] = add / 3;
                add = 0;
                alumno = teclado.next();
            }else if(alumno.equals(alumnos[3])){
                System.out.println("Ingrese las notas del alumno "+alumnos[3]);
                for (int c = 0; c <3; c++){
                    matriz[f][c] = teclado.nextInt();
                    add = add + matriz[f][c];
                }
                matriz[f][3] = add / 3;
                add = 0;
                alumno = teclado.next();
            } else {
                System.out.println("Error aluno no encontrado");
            }
        }

        for (int f=0;f<4;f++) {
            for (int c=0;c<4;c++) {
                if(c==3) {
                    System.out.println("El promedio del alumno "+alumnos[0]+ " es: "+matriz[f][c]);
                } else {
                    System.out.println("La Nota "+(c+1)+" del alumno " + alumnos[0] + " es: "+matriz[f][c]);
                }
            }
        }
    }
}
