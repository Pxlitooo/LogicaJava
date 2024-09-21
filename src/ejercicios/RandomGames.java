package ejercicios;

public class RandomGames {
    public static void main(String[] args) {
        int points = 0;

        int life = 10;

        while (life > 0 && points < 20){
            int num = (int) (Math.random()*10+1);
            if (num%2 == 0){
                points++;
                System.out.println("tienes " + points + "puntos");
            }else{
                life--;
                System.out.println("te quedan " + life + "vidas");
            }
        }

    }
}
