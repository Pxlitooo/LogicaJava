package notasDeClases;

import java.util.Scanner;

public class While {
    static String keyInput;
    static String nombre;
    static String number1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("precione 1. para inicializar");

        int init = sc.nextInt();

        while (init != 0 ){
            System.out.println("seleccione 1. para crear un usuario " +
                "seleccione 2. para iniciar sesión " +
                "sleccione 3. para calcular salario " +
                "seleccione 4. para validar su categoria de salario" +
                "seleccione 5. para ver datos del usuario" + "seleccione 6. salir");

            int opcion = sc.nextInt();
            String userInput = sc.nextLine();
            int key = 0;
            int number = 0;


            switch (opcion){
                case 1:
                    System.out.println("Crear usuario");

                    System.out.println("ingrese el usario: ");
                    userInput = sc.nextLine();
                    sc.nextLine();
                    System.out.println("ingrese la contraseña: ");
                    key = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese el numero: ");
                    number = sc.nextInt();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Login");
                    System.out.println("inicie sesion");
                    //nombre == sc.nextLine
                    if (userInput.equals(nombre) && number == key){
                    System.out.println("bienvenido");
                }else{
                    System.out.println("valide sus datos");
                }

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
                case 6:
                    init = 0;
                    break;
                default:
                    System.out.println("seleccione una opcion valida");
            }

        }










    }
}
