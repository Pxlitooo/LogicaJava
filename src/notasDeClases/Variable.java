package notasDeClases;

public class Variable {
    public static void main(String [] args ){

        int idCliente; //Declarar una variable

        idCliente = 12345678; // inicializar variable

        String nombreCliente = "pepito";

        int num1, num2;
        num1 = 5;
        num2 = 10;

        byte edad = 127;
        short mesada = 32767;
        short ahorroMesada = mesada ;
        // Vamos usar el casteo de variables

        int ahorro=(int) ahorroMesada;

        ahorro = ahorroMesada + mesada;

        System.out.println(ahorro);
        //Saque el promedio de las edades
        int edad1 = 19;
        String edad2 = "22";
        int edadConv2 = Integer.parseInt(edad2);
        float promedio = (edad1 + edadConv2)/2;
        System.out.println(promedio);


        String promrdioConv = promedio + "";
        System.out.println(promrdioConv);

        //tipos de datos
        float nota = 4.5f;
        long bignumber = 283462634623l;
        

    }





}
