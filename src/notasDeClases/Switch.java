package notasDeClases;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("seleccione 1. para crear un usuario" +
                "seleccione 2. para iniciar sesión " +
                "sleccione 3. para calcular salario " +
                "seleccione 4. para validar su categoria de salario" +
                "seleccione 5. para ver datos del usuario");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Crear usuario");
                break;
            case 2:
                System.out.println("Login");
                break;
            case 3:
                System.out.println("calcular salario");
                break;
            case 4:
                System.out.println("validar categoria del salario");
                break;
            case 5:
                System.out.println("ver datos del usuario");
                break;
            default:
                System.out.println("seleccione una opcion valida");
        }
    }
}
