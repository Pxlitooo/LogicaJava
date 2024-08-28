package ejercicios;

import java.util.Scanner;

public class Condicional {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 170000;

        System.out.println("numeros de cuotas: ");
        int quotas = sc.nextInt();



        System.out.println("ingrese el valor de la compra");
        double purchase = sc.nextDouble();

        if (purchase > 0 && purchase <= balance){
            System.out.println("compra exitosa");
            purchase *= quotas;
            balance -= purchase;
            System.out.println("su nuevo saldo es:  " + balance);
        } else if (purchase <= 0 ) {
            System.out.println("su compra debe ser mayor a 0");
        } else {
            System.out.println("saldo insuficiente");
        }


    }
}
