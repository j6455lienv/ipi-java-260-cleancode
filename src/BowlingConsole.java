import java.util.Scanner;

public class BowlingConsole {

    public static void main(String... args) {
        BowlingGame game = new BowlingGame();
        Scanner scanner = new Scanner(System.in);
        int frame = 1;
        int score = 0;
        int quilleTombee = 0;
        int frameDeFrame = 0;
        while (frame <= 10) {
            System.out.println("Frame " + frame);
            System.out.println("Entrez le nombre de quille tombée : ");
            quilleTombee = scanner.nextInt();

            if (quilleTombee < 0 || quilleTombee > 10 ) {
                System.out.println("ATTENTION : Le nombre de quilles doit etre compris entre 0 et 10");
            }else{
                System.out.println("Vous avez tombé " + quilleTombee + " quilles");
                game.roll(quilleTombee);
                score += game.score();
                System.out.println("Votre score est de " + game.score() + " points");
                if (quilleTombee == 10 || frameDeFrame == 1) {
                    //ici c'est un strike, on peut passer au frame suivant
                    System.out.println("STRIKE !!");
                    frame++;
                } else {
                    //ce premier coup n'a pas fait tomber toute les quilles, on incremente pas le frame
                    //et on joue un second tour.
                    System.out.println("");
                    frameDeFrame++;
                }
            }
        }
        scanner.close();
        System.out.println("Jeu terminé !!");
    }

}
