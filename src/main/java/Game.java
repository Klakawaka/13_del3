import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
public class Game {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Player[] playerList;
    Gui gui = new Gui();
    private void runTurn(int turnNum ){
        Player player = playerList[turnNum];

        int dicesum;
        dice1.roll();
        dice2.roll();
        dicesum = dice1.getFaceValue() + dice2.getFaceValue();
        player.addpostion(dicesum);
        //hard coded scenario
        player.account.addBalance1(50);
        gui.moveplayer(turnNum,player.position);
    }
    public  void game() {


        int amount = gui.hentAntalSpillere();
        playerList = new Player[amount];
        for(int i = 0; i < amount; i++ ) {
            playerList[i] = new Player(gui.player_name);
        }
            gui.opsætSpillere(playerList,amount);

       while(true){
           for(int i = 0; i < amount;i++){
        gui.waitButton();
               runTurn(i);




    }}}}

