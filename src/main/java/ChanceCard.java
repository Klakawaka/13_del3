import java.lang.Math;
public class ChanceCard {
        public static void main(String[] args) {
                Player player1 = new Player();
                Player player2 = new Player();
                Player[] playerlist = new Player[2];
                playerlist[0] = player1;
                playerlist[1] = player2;
                Player player = player1;

                getChancecard(player,playerlist); //statisk miderlertidigt, slet når det instantieres (new Chancecard)


        int tendollargift, tendollarloss, moveplayer3foward, moveplayer3back, movetojail;

                //tendollargift =
                //tendollarloss = 1
                //moveplayer3foward = 2
                //moveplayer3back = 3
                //movetojail = 4


        }
        public static void getChancecard(Player player, Player[] playerlist)
        {
                int card = (int) (Math.random() * 6) + 1;
                switch (card) {
                        case 1:
                                System.out.println("Du får en gave på 10 dollars");
                                player.addBalance(10);

                                break;
                        case 2:
                                System.out.println("Du mister 10 dollars");
                                player.addBalance(-10);
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
                                player.setPosition(17); //17 er bare eksempel, ændre til nummer for fængsel.
                                break;
                        case 6:
                                System.out.println("du får 6 dollars af hver spiller");
                                for (int i = 0; i < playerlist.length; i++) {
                                        playerlist[i].addBalance(-6);
                                }
                                player.addBalance(playerlist.length * 6);
                                break;
                }
        }
}

