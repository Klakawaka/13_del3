import gui_fields.GUI_Player;

import java.lang.Math;
import java.sql.SQLOutput;

public class ChanceCard {
Player player = new Player ();
Player [] playerlist;

        private final int MAX = 10;
        int card;
        public void test() {


                //Player player1 = new Player();
               // Player player2 = new Player();
                //Player player3 = new Player();
                //Player player4 = new Player();

                //Player[] playerlist = new Player[];
                //playerlist[0] = player1;
                //playerlist[1] = player2;
                //playerlist[2] = player3;
                //playerlist[3] = player4;
                //Player player = player1;

               // getChancecard(player, playerlist); //statisk miderlertidigt, slet når det instantieres (new Chancecard)

                //case 1/kort 1 = tendollargift
                //case 2/kort 2 = tendollarloss
                //case 3/kort 3 = moveplayer3foward
                //case 4/kort 4 = moveplayer3back
                //case 5/kort 5 = movetojail
                //case 6/kort 6 = get6dollarsfromeachplayer

        }

        public int  getChancecard(GUI_Player[] list)
        {

                 //int card = (int) (Math.random() * MAX) + 1;
int card = 1;
                switch (card) {
                        case 1:
                                System.out.println("Du får en gave på 10 dollars");
                                player.addBalance( 10);

                                break;
                        case 2:
                             /*   System.out.println("Du mister 10 dollars");
                                //TODO
                                // addBalance returnerer true/false afhængig af, om beløbet kunne trækkes
                                Boolean success = player.addBalance(-10);
                                if(!success){
                                        System.out.println("Der bliver ikke trukket 10 dollars, da du går i minus");
                                }*/
                                break;
                        case 3:
                                System.out.println("Du skal rykke 3 felter frem");
                                player.addpostion(3);
                                break;
                        case 4:
                                System.out.println("Du skal Rykke 3 felter tilbage");
                                player.addpostion(-3);
                                break;
                        case 5:
                                System.out.println("Du skal i fængsel i en runde");
                                player.setPosition(7); //7 er position for fængsel
                                break;
                        case 6: //metode: trækker 6 dollars fra alles balance.
                                //efterfølgende får player som trækker kortet, 6$ gange med antal spiller (playerlist)
                                System.out.println("du får 6 dollars af hver spiller");
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
                        case 8: //metode: giver 2 dollar til alle spilleres balance
                                //efterfølgende trækkes der for spiller som trækker kortet, -2$ gange med antal spiller
                                System.out.println("Du skal give 2 dollars til hver spiller");
                                for (int i = 0; i < playerlist.length; i++) {
                                        playerlist[i].addBalance(2);
                                }
                                player.addBalance(playerlist.length * (-2));
                                break;
                        case 9:
                                System.out.println("Du skal rykke 5 felter frem");
                                player.addpostion(5);
                                break;
                        case 10:
                                System.out.println("Du skal rykke 5 felter tilbage");
                                player.addpostion(-5);
                                break;
                }       return card;
        }

}


