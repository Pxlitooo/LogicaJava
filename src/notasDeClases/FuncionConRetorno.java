package notasDeClases;


import java.util.Scanner;

public class FuncionConRetorno {
    static double salario;
    static float auxTransporte = 162000;
    static double salarioNeto;
    static double descuentosalud;
    static double descuentoPension;
    static double smlv =1300000;
    static final float PORCDESCUENTOSALUD = 0.04f;
    static final float PORCDESCUENTOPENSION = 0.04f;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ingrese salario");
        salario = sc.nextDouble();
        salarioNeto = calcularSalarioNeto(salario, PORCDESCUENTOPENSION, PORCDESCUENTOSALUD, auxTransporte);
        System.out.println("Salario neto es: " + salarioNeto);
        // Tuya va a pagar el salario de los nuevos developers, si el nivel del contrato
        // junior du salario es de 2500000 y si es junior advance es de 310000
        // se requiere calcular de los descuentos de salud y pension. si el salario es menor
        // a 2 slmv se le debe pagar aux de transporte, de lo contrario no se pagara
        // cree una funcionalidad que permita clacular el pago a cada uno de los nuevos developers
    }
    public static double calcularSalud(double salario, float porcSalud){
        return salario*porcSalud;
    }
    public static double calcularPension(double salario, float porcPension){
        return salario*porcPension;
    }
    public static double calcularSalarioNeto(double salario,float porcPension, float porcSalud, float auxTranp){
        if (salario <= 2*smlv){
            return salario - calcularPension(salario, porcPension) - calcularSalud(salario, porcSalud) + auxTranp;
        }else {
            return salario - calcularPension(salario, porcPension) - calcularSalud(salario, porcSalud);
        }

    }
}
