import java.util.Scanner;
public class Player {

    String name;
    int position;
    int balance;
    Bank account = new Bank();

    public Player() {
        account = new Bank();
    }

    public Player(String name,  int balance) {
        this.name = name;
        this.balance = balance;
        account.addBalance(balance);
    }

    public int getBalance() {
        return account.getBalance();
    }

    public boolean addBalance(int amount) {
        return account.addBalance(amount);
    }


    //adbalance bruges til case 1,2 og 6//
    //adposition bruges til case 3 og 4
    public void addpostion(int toAddPosition){
        position = position + toAddPosition;
    }
    //setposition bruges til case 5, i case 5 rykkes man til fængsel. Nummeret for dette felt skal ændres
    //under chancekort-klassen i player.setPosition(x)//

    public void setPosition(int moveto){
        position = moveto;
    }

    public void toMain(){
        Scanner pl = new Scanner(System.in);
        System.out.println("How many are playing?");




    }

}

