public class Board {
    int Start, Nairobi, Tripoli, Bukarest, Brasilia, Jail, Athen, Prague, Madrid, Paris, Copenhagen;
    int Stockholm, Rome, Dublin, Singapore, Montreal, Dubai, NewYork;

    ChanceCard chanceCard = new ChanceCard();
//Create field class and rename to board class.
    public void field(Player player,int x) {
        switch (x) {
            case  0:
                System.out.println("Start");
                 Start = 50; //(Skal den med)
                player.account.addNewBalance(+50);
            case  1:
                System.out.println("Nairobi");
                Nairobi = 60;
                player.account.addNewBalance(-60);
                break;
            case  2:
                System.out.println("Tripoli");
                Tripoli = 65;
                player.account.addNewBalance(-65);
                break;
            case 3:
                System.out.println("chance");
                chanceCard.getChancecard(player);
                break;
            case 4:
                System.out.println("Bukarest");
                Bukarest = 85;
                player.account.addNewBalance(-85);
                break;
            case 5:
                System.out.println("Brasilia");
                Brasilia = 95;
                player.account.addNewBalance(-95);
                break;
            case 6:
                System.out.println("jail");
                //Jail=?; (Skal den med?)
                break;
            case 7:
                System.out.println("Athen");
                Athen = 120;
                player.account.addNewBalance(-120);
                break;
            case 8:
                System.out.println("Prague");
                Prague = 145;
                player.account.addNewBalance(-145);
                break;
            case 9:
                System.out.println("chance");
                chanceCard.getChancecard(player);
                break;
            case 10:
                System.out.println(" Madrid");
                Madrid = 180;
                player.account.addNewBalance(-180);
                break;
            case 11:
                System.out.println("Paris");
                Paris = 190;
                player.account.addNewBalance(-190);
                break;

            case 12:
                System.out.println("refugue");
                //refugue
                break;
            case 13:
                System.out.println("Copenhagen");
                Copenhagen = 210;
                player.account.addNewBalance(-210);
                break;
            case 14:
                System.out.println("Stockholm");
                Stockholm = 220;
                player.account.addNewBalance(-220);
                break;
            case 15:
                System.out.println("chance");
                chanceCard.getChancecard(player);
                break;

            case 16:
                System.out.println("Rome");
                Rome = 270;
                player.account.addNewBalance(-270);
                break;
            case 17:
                System.out.println(" Dublin");
                Dublin = 285;
                player.account.addNewBalance(-285);
                break;
            case 18:
                System.out.println("jail");
                //jail
                break;
            case 19:
                System.out.println("Singapore");
                Singapore = 325;
                player.account.addNewBalance(-325);
                break;
            case 20:
                System.out.println("Montreal");
                Montreal = 340;
                player.account.addNewBalance(-340);
                break;
            case 21:
                System.out.println("chance");
                chanceCard.getChancecard(player);
                break;
            case 22:
                System.out.println("Dubai");
                Dubai = 420;
                player.account.addNewBalance(-420);
                break;
            case 23:
                System.out.println("NewYork");
                NewYork = 450;
                player.account.addNewBalance(-450);
                break;


        }
    }
}