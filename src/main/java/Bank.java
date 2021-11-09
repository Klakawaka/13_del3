public class Bank {
// Konto på 1000

    private int saldo;

    public void Konto() {
        saldo = 1000;
    }

    public boolean haev(int penge) {

        if ((saldo + penge) < 0)
            return false;

        saldo = saldo + penge;
        return true;
    }

    public int getSaldo() {
        return saldo;
    }


    // Ændrer spillerens balance til 10000
player.setBalance(10000);
    kkklkk
}