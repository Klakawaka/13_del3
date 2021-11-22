public class Bank {
// Konto på 1000

    private int balance;

    public void account() {
        balance = 1000;
    }

    public boolean addBalance(int money) {
        this.balance = money;
        if ((balance + money) < 0)
            return false;

        balance = balance + money;
        return true;
    }

    public int getBalance() {
        return balance;
    }


    // Ændrer spillerens balance til 10000
//player.setBalance(10000);
}