
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Dee dee = new Dee();
        menu.demarrage();
        String nameHero = menu.nameChoice();
        menu.persoChoice(nameHero);
        menu.readyToPlay();
        System.out.println("on commence la partie");
        //démarage de la partie
        int playerPosition = 1;
        while (playerPosition <= 64) {
            int jetDeDee = dee.jetterDe();
            System.out.println("dé: "+jetDeDee);
            playerPosition += jetDeDee;
            System.out.println("position: "+playerPosition);
        }
            System.out.println("Vous ètes le Boss du royaume de DONJONS & DRAGONS");
        }
}







