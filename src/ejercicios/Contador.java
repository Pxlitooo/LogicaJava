package ejercicios;

public class Contador {
    public static void main(String[] args) {
        int i = 0;
        while(i < 100){
            System.out.println("numero: "+ (i = i + 2) );

        }
    }
}
