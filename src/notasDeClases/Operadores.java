package notasDeClases;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);


        //operadores arit (+*/-%)

        int data = (100/4)* 25 + (4*2);

        //operadores de comparacion
        int clave = 1234;
        int claveUser = 1234;

        if (clave == claveUser){
            System.out.println("se permite el ingreso: ");
        }

        float estatura = 1.76f;
        float estIngresada = 1.77F;

        if ( estatura > estIngresada){
            System.out.println("cobrar 5000 pesos" );
        }else {
            System.out.println("No paga");

        }
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = leer.nextInt();
        int suma = (num1 + num2);
        System.out.println("num1: " + num1 + "\n"+"num2: " + num2 + "\n" + "el resultado de suma es " + suma + "\n");



        // operadooreslogicos





    }


}
