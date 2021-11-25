public class Field {
    int Start, Nairobi, Tripoli, Bukarest, Brasilia, Jail, Athen, Prague, Madrid, Paris, Copenhagen;
    int Stockholm, Rome, Dublin, Singapore, Montreal, Dubai, NewYork;

    ChanceCard chanceCard = new ChanceCard();
//Create field class and rename to board class.
    public void field(Player player,int x) {
        switch (x) {
            case  0:
                System.out.println("test");
                 Start = 0; //(Skal den med)
            case  1:
                System.out.println("test1");
                Nairobi = 60;
                break;
            case  2:
                System.out.println("test1");
                Tripoli = 65;
                break;
            case 3:
                System.out.println("test1");
                chanceCard.getChancecard(player);
                break;
            case 4:
                System.out.println("test1");
                Bukarest = 85;
                break;
            case 5:
                System.out.println("test1");
                Brasilia = 95;
                break;
            case 6:
                System.out.println("test1");
                //Jail=?; (Skal den med?)
                break;
            case 7:
                System.out.println("test1");
                Athen = 120;
                break;
            case 8:
                System.out.println("test1");
                Prague = 145;
                break;
            case 9:
                System.out.println("test1");
                chanceCard.getChancecard(player);
                break;
            case 10:
                System.out.println("test1");
                Madrid = 180;
                break;
            case 11:
                System.out.println("test1");
                Paris = 190;
                break;

            case 13:
                System.out.println("test1");
                //refugue
                break;
            case 14:
                System.out.println("test1");
                Copenhagen = 210;
                break;
            case 15:
                System.out.println("test1");
                Stockholm = 220;
                break;
            case 16:
                System.out.println("test1");
                //jail
                break;
            case 17:
                System.out.println("test1");
                Rome = 270;
                break;
            case 18:
                System.out.println("test1");
                Dublin = 285;
                break;
            case 19:
                System.out.println("test1");
                chanceCard.getChancecard(player);
                break;
            case 20:
                System.out.println("test1");
                Singapore = 325;
                break;
            case 21:
                System.out.println("test1");
                Montreal = 340;
                break;
            case 23:
                System.out.println("test1");
                Dubai = 420;
                break;
            case 24:
                System.out.println("test1");
                NewYork = 450;
                break;


        }
    }
}