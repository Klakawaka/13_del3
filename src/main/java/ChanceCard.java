import gui_fields.GUI_Player;

import java.lang.Math;
import java.sql.SQLOutput;

public class ChanceCard {
   // Player[] playerlist;

    //Bank bank = new Bank();
//int card = 3;
private final int MAX = 7;
    public int getChancecard(Player player) {

        int card = (int) (Math.random() * MAX) + 1;

        switch (card) {
            case 1:
                System.out.println("Du får en gave på 10 dollars");
                player.account.addNewBalance(+10);
                break;
            case 2:
                System.out.println("Du får en bøde på 10 dollars");
                player.account.addNewBalance(-10);
                break;
                                /*   System.out.println("Du mister 10 dollars");
                                //TODO
                                // addBalance returnerer true/false afhængig af, om beløbet kunne trækkes
                                Boolean success = player.addBalance(-10);
                                if(!success){
                                        System.out.println("Der bliver ikke trukket 10 dollars, da du går i minus");
                                }*/

            case 3:
                System.out.println("Du skal rykke 3 felter frem");
                player.addpostion(3);
                break;
            case 4:
                System.out.println("Du skal Rykke 3 felter tilbage");
                player.addpostion(-3);
                if (player.position < 0) {
                    player.position = 0;
                }
                break;
            case 5:
                System.out.println("Du skal i fængsel i en runde");
                player.setPosition(7); //7 er position for fængsel
                break;
            case 6:
                System.out.println("Du skal rykke 5 felter frem");
                player.addpostion(5);

                break;
            case 7:
                System.out.println("Du skal rykke 5 felter tilbage");
                player.addpostion(-5);
                if (player.position < 0 ) {
                    player.position = 0;
                }
            case 8:
                System.out.println("Du får en gave på 5 dollars");
                player.account.addNewBalance(+5);
                break;
            case 9:
                System.out.println("Du får en bøde på 5 dollars");
                player.account.addNewBalance(-10);
                break;
            case 10:
                System.out.println("Du skal i fængsel i en runde");
                player.setPosition(7); //7 er position for fængsel
                break;

            /*case x: //metode: trækker 6 dollars fra alles balance.
                //efterfølgende får player som trækker kortet, 6$ gange med antal spiller (playerlist)
                //System.out.println("du får 6 dollars af hver spiller");
                for (int i = 0; i < playerlist.length; i++) {
                    playerlist[i].addBalance(-6);
                }
                player.addBalance(playerlist.length * 6);
                break;
                case 7://metode: trækker 8 dollars fra alle spilleres balance.
                                //efterfølgende får spilleren som trækker kortet, 8$ gange med antal spiller (playerlist.lenght)
                                System.out.println("du får 8 dollars af hver spiller");
                                for (int i = 0; i < playerlist.length; i++) {
                                        playerlist[i].addBalance(-8);
                                }
                                player.addBalance(playerlist.length * 8);
                                break;
                        case x: //metode: giver 2 dollar til alle spilleres balance
                                //efterfølgende trækkes der for spiller som trækker kortet, -2$ gange med antal spiller
                                System.out.println("Du skal give 2 dollars til hver spiller");
                                for (int i = 0; i < playerlist.length; i++) {
                                        playerlist[i].addBalance(2);
                                }
                                player.addBalance(playerlist.length * (-2));
                                break;



                                break; */
        }
        return card;
    }


}


