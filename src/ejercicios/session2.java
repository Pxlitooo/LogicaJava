package ejercicios;

import java.util.Scanner;

public class session2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String correo = "douglas@gmail.com";
        System.out.println("ingrese el correo: ");
        String emailInpunt = sc.nextLine();

        int key = 1234;
        System.out.println("ingrese la password: ");
        int keyInput = sc.nextInt();

        String number = "3012297558";
        System.out.println("ingrese el numero: ");
        String numberInput = sc.nextLine();


        if (emailInpunt.equals(correo) || number.equals(number) && key == keyInput) {
            System.out.println("bienvenido");
        }else{
            System.out.println("valide sus datos. ");
        }


    }
}
