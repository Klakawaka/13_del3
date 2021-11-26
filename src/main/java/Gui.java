import gui_fields.*;
import gui_main.GUI;
import java.awt.*;

public class Gui {
        String player_name;
        GUI_Player[] playerList; //create and initilize player //create and initilize player
        int playerCarPosition; //create car position tracking variable
        GUI gui; //create gui variable
        GUI_Field field; //create field variable
    int[] playerlistPosition;
    ChanceCard chance = new ChanceCard();



    public Gui() {

        GUI_Field[] fields = {
                new GUI_Start("START", "Receive 50 $", "This is the starting point of the game - You receive 50 $ when your character passes through it.", Color.red, Color.black),
                new GUI_Street("Nairobi", "Price: 60 $", "This is the capital of Kenya. Population: 4.4 Million", "60", Color.gray, Color.black),
                new GUI_Street("Tripoli", "Price: 65 $", "This is the capital of Libya. Population: 3.1 Million.", "65", Color.gray, Color.black),
                new GUI_Chance("?", "Try ur Luck!", "You landed on ''?'' This field yield many random possibilities!", Color.orange, Color.black),
                new GUI_Street("Bucharest", "Price: 85 $", "This is the capital of Romania. Population: 3.8 Million", "85", Color.green, Color.black),
                new GUI_Street("Brasilia", "Price: 95 $", "This is the capital of.. you guessed it! Brazil! Population: 4.7 Million", "95", Color.GREEN, Color.black),
                new GUI_Jail("default", "Jail", "Visiting Jail", "You're visiting", Color.gray, Color.black),
                new GUI_Street("Athene", "Price: 120 $", "This is the capital of Greece. Population: 664 Thousand", "120", Color.YELLOW, Color.black),
                new GUI_Street("Prague", "Price: 145 $", "This is the capital of the Czech Republic. Population: 1.3 Million", "145", Color.yellow, Color.black),
                new GUI_Chance("?", "Try ur Luck!", "You landed on ''?'' This field yield many random possibilities!", Color.orange, Color.black),
                new GUI_Street("Madrid", "Price: 180 $", "This is the capital of Spain. Population: 3.07 Million", "180", Color.pink, Color.black),
                new GUI_Street("Paris", "Price: 190 $", "This is the capital of France. Population: 2.1 Million.", "190", Color.pink, Color.black),
                new GUI_Refuge("default", "Parkingspot", "FREE PARK", "This is a parkingspot which allows you to park here for free! Plus add all uncollected fines to your own bank deposit!", Color.gray, Color.black),
                new GUI_Street("Copenhagen", "Price 210 $", "This is the capital of Denmark. Population: 602 Thousand.", "210", Color.white, Color.black),
                new GUI_Street("Stockholm", "Price: 220 $", "This is the capital of Sweden. Population: 975 Thousand. ", "220", Color.white, Color.black),
                new GUI_Chance("?", "Try ur Luck!", "You landed on ''?'' This field yield many random possibilities!", Color.orange, Color.black),
                new GUI_Street("Rome", "Price: 270 $ ", "This is the capital of Italy. Population: 2.8 Million.", "270", Color.darkGray, Color.white),
                new GUI_Street("Dublin", "Price: 285 $", "This is the capital of Ireland. Population: 554 Thousand.", "285", Color.darkGray, Color.white),
                new GUI_Jail("default", "Jail", "Go to JAIL", "You have been arrested, you need to go to jail...", Color.gray, Color.black),
                new GUI_Street("Singapore", "Price: 325 $", "This is the capital of Singapore! Singapore is both a city and a country as it is a citystate governed on its own. Population: 5.6 Million.", "325", Color.magenta, Color.black),
                new GUI_Street("Montreal", "Price: 340 $", "This is the second biggest city of Canada. Population: 1.7 Million.", "340", Color.magenta, Color.black),
                new GUI_Chance("?", "Try ur Luck!", "You landed on ''?'' This field yield many random possibilities!", Color.orange, Color.black),
                new GUI_Street("Dubai", "Price: 420 $", "This is the largest city of the United Arab Emirates. Population: 3.3 Million.", "420", Color.BLUE, Color.white),
                new GUI_Street("New york", "Price: 450 $", "This is the biggest city of the United States. Population: 8.2 Million.", "450", Color.BLUE, Color.white),
        };
        gui = new GUI(fields, Color.CYAN); //initilize gui variable
    }


        public int hentAntalSpillere() {
            String chosenButton2 = gui.getUserButtonPressed("How many players are playing?", "2", "3", "4"); //create and initilize chosenButton
            return Integer.parseInt(chosenButton2);
        }

        public void opsætSpillere(Player[] list, int x) {
            playerList = new GUI_Player[list.length];
            playerlistPosition = new int[list.length];
            for (int i = 0; i < x; i++) {
                player_name = gui.getUserString("Enter player name");
                playerList[i] = new GUI_Player(player_name, list[i].account.getBalance());
                gui.addPlayer(playerList[i]);
                gui.getFields()[0].setCar(playerList[i], true);
            }
        }

        public void moveplayer(int playerTurn, int newPosition){
                gui.getFields()[playerlistPosition[playerTurn]].setCar(playerList[playerTurn], false); //hide the players car
                gui.getFields()[newPosition].setCar(playerList[playerTurn], true); //show the car in the new position
                playerlistPosition[playerTurn] = newPosition;
               }
    public void waitButton(){
             String chosenButton = gui.getUserButtonPressed("Click to play", "Play"); //create and initilize chosenButton
    }
    public void changeBalance(int playerNum, int newBalance){
            playerList[playerNum].setBalance(newBalance);

    }

public void Dice(int dice1,int dice2){
            gui.setDice(dice1,dice2);
    }

}







