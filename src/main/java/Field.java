public class Field {
    int Nairobi, Tripoli, Bukarest, Brasilia, Jail, Athen, Prague, Madrid, Paris, Copenhagen;
    int Stockholm, Rome, Dublin, Singapore, Montreal, NewYork, Dubai;
    Field field;

    public void field(int x) {
        switch (x) {
            case 1:
                Nairobi = 60;
                break;
            case 2:
                Tripoli = 65;
                break;
            case 4:
                Bukarest = 85;
                break;
            case 5:
                Brasilia = 95;
                break;
            case 6:
                //Jail; (Skal den med?)
                break;
            case 7:
                Athen = 120;
                break;
            case 8:
                Prague = 145;
                break;
            case 10:
                Madrid = 180;
                break;
            case 11:
                Paris = 190;
                break;
            case 13:
                Copenhagen = 210;
                break;
            case 14:
                Stockholm = 220;
                break;
            case 16:
                Rome = 270;
                break;
            case 17:
                Dublin = 285;
                break;
            case 19:
                Singapore = 325;
                break;
            case 20:
                Montreal = 340;
                break;
            case 22:
                NewYork = 420;
                break;
            case 23:
                Dubai = 450;
                break;
        }
    }
}