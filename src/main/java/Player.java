import java.util.Scanner;
public class Player {

        String name;
        int balance;
        int position;

            //adbalance bruges til case 1,2 og 6//
        public void addBalance(int toAddBalance){
            balance = balance + toAddBalance;
        }
            //adposition bruges til case 3 og 4
        public void addpostion(int toAddPosition){
            position = position + toAddPosition;
        }
            //setposition bruges til case 5, i case 5 rykkes man til fængsel. Nummeret for dette felt skal ændres
            //under chancekort-klassen i player.setPosition(x)//

        public void setPosition(int moveto){
            position = moveto;
        }

    public void toMain(){
        Scanner pl = new Scanner(System.in);
        System.out.println("How many are playing?");
        // -------

        if (totalPlayers > 2){
            System.out.println("End game");
        }

        else {
            System.out.println("Enter name");
            String playername = pl.nextLine();
            Player player1 = new Player();
            System.out.println("Player = " + playername);

        }

    }

}

