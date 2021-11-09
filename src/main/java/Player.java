import java.util.Scanner;
public class Player {
    public static void main(String[] args){
        String player;
        int totalPlayers = 4;
        //Only 2-4 players

        Scanner pl = new Scanner(System.in);
        System.out.println("How many are playing?");
        // -------

        if (totalPlayers > 2){
            System.out.println("End game");
        }

        else {
            System.out.println("Enter name");
            player= pl.nextLine();
            System.out.println("Player = " + player);

        }


    }
}

