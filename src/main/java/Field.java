public class Field {
    int Start, Nairobi, Tripoli, Bukarest, Brasilia, Jail, Athen, Prague, Madrid, Paris, Copenhagen;
    int Stockholm, Rome, Dublin, Singapore, Montreal, Dubai, NewYork;
    Field field;

    public void field(int x) {
        switch (x) {
            case 1:
                 //Start = 0; (Skal den med)
            case 2:
                Nairobi = 60;
                break;
            case 3:
                Tripoli = 65;
                break;
            case 5:
                Bukarest = 85;
                break;
            case 6:
                Brasilia = 95;
                break;
            case 7:
                //Jail=?; (Skal den med?)
                break;
            case 8:
                Athen = 120;
                break;
            case 9:
                Prague = 145;
                break;
            case 11:
                Madrid = 180;
                break;
            case 12:
                Paris = 190;
                break;
            case 14:
                Copenhagen = 210;
                break;
            case 15:
                Stockholm = 220;
                break;
            case 17:
                Rome = 270;
                break;
            case 18:
                Dublin = 285;
                break;
            case 20:
                Singapore = 325;
                break;
            case 21:
                Montreal = 340;
                break;
            case 23:
                Dubai = 420;
                break;
            case 24:
                NewYork = 450;
                break;
        }
    }
}