import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
public class Game {

    public static void main(String[] args) {
        Player[] playerList;
        Gui gui = new Gui();
        Bank bank = new Bank();

        int amount = gui.hentAntalSpillere();
        playerList = new Player[amount];
        for(int i = 0; i < amount; i++ ) {
            playerList[i] = new Player(gui.player_name, 2000);
        }
            gui.opsætSpillere(playerList, amount);

       while(true){
           for(int i = 0; i < amount;i++){
        gui.moveplayer(playerList,i);




    }}}
}