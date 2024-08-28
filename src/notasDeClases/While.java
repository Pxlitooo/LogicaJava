package notasDeClases;

import java.util.Scanner;

public class While {
    static String Nombre;
    static int clave;
    static int numero;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("precione 1. para inicializar");

        int init = sc.nextInt();
        sc.nextLine();

        while (init != 0 ){
            System.out.println("seleccione 1. para crear un usuario " +
                "seleccione 2. para iniciar sesión " +
                "sleccione 3. para calcular salario " +
                "seleccione 4. para validar su categoria de salario" +
                "seleccione 5. para ver datos del usuario" + "seleccione 6. salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Crear usuario");

                    System.out.println("ingrese el usario: ");
                    Nombre = sc.nextLine();
                    System.out.println("ingrese la contraseña: ");
                    clave = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese el numero: ");
                    numero = sc.nextInt();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Login");
                    System.out.println("Ingrese el usuario: ");
                    String inputNombre = sc.nextLine();

                    System.out.println("Ingrese la contraseña: ");
                    int inputClave = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el número: ");
                    int inputNumero = sc.nextInt();
                    sc.nextLine();

                    if (inputNombre.equals(Nombre) && inputClave == clave && inputNumero == numero) {
                        System.out.println("Bienvenido");
                    } else {
                        System.out.println("Valide sus datos");
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
                    System.out.println("Usuario: " + Nombre);
                    System.out.println("clave: " + clave);
                    System.out.println("Número: " + numero);
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
