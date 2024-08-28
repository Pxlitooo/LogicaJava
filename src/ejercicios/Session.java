package ejercicios;

import java.util.Scanner;

public class Session {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String userName = "pp@gmail.com";
        int key = 1234;
        String nameUser = "pepito";


        System.out.println("ingrese su usuario: ");
        String userInput = sc.nextLine();


        System.out.println("ingrese su password: ");
        int keyInput = sc.nextInt();

        if (userName.equals(userInput) && key == keyInput) {
            System.out.println("bienvenido");
        } else {
            System.out.println("no ingresa");
        }
    }
}