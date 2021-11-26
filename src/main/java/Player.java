import java.util.Scanner;
public class Player {

    String name;
    int position;
    Bank account = new Bank();


    public Player(String name) {
        this.name = name;
        account.account();
    }

    //adbalance bruges til case 1,2 og 6//
    //adposition bruges til case 3 og 4
    public void addpostion(int toAddPosition){
        position = (position + toAddPosition)%23;
       // if (player.position >=23) ;
       // addBalance()

    }
    //setposition bruges til case 5, i case 5 rykkes man til fængsel. Nummeret for dette felt skal ændres
    //under chancekort-klassen i player.setPosition(x)//

    public void setPosition(int moveto){
        position = moveto;
    }



}

