package ejercicios;

public class Contendornumeropareimpar {
    public static void main(String[] args) {

        int i = 0;
        while(i <= 100){
            if (i % 2 == 0) {
                System.out.println(i + ":es par");
            }else {
                System.out.println(i + "es impar");
            }
            i++;
        }
    }
}
