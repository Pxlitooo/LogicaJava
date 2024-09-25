package ejercicios;

import java.util.Scanner;

public class revision {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int numero;
        System.out.println("introduce los numeros y 0 para finalizar");
        while(true){
            numero = sc.nextInt();
            if (numero == 0){
                break;
            }
            if (numero % 2 == 0){
                System.out.println("numero par");
            }else {
                System.out.println("numero impar");
            }
        }
    }
}
