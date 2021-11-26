public class Bank {
// Konto på 1000

    private int balance;

    public static final int INITIAL_BALANCE = 1000;

    public Bank() {
        this.balance = INITIAL_BALANCE;
    }
    public int getInitialBalance() {
        return balance;
    }
    public void adjustBalance(int value) {
        balance += value;
        if (balance <= 0) {
    }}
    public void account() {
        balance = 1000;
    }

    public boolean addBalance(int money) {
        money = money + balance;
        if ((balance + money) < 0)
            return false;

        balance = balance + money;
        return true;
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance1(int amount){
        balance += amount;

    }
    public int addNewBalance(int newamount){
        balance += newamount;
        return balance;
    }

    // Ændrer spillerens balance til 10000
//player.setBalance(10000);
}