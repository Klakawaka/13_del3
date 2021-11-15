import gui_fields.*;
import gui_main.GUI;
import java.awt.*;
public class Gui {
    public static void main(String[] args) {
Dice dice1,dice2;

dice1 = new Dice();
dice2 = new Dice();


        GUI_Field[] fields = {
                new GUI_Start("START", "Receive 50 $","This is the starting point of the game - You receive 50 $ when your character passes through it.", Color.red, Color.black),
                new GUI_Street("Nairobi", "Price: 60 $","This is the capital of Kenya.","60", Color.gray, Color.black),
                new GUI_Street("Tripoli", "Price: 65 $", "This is the capital of Lybia.", "65", Color.gray, Color.black),
                new GUI_Chance("?" , "Try ur Luck!" , "You landed on ''?'' This field yield many random possibilities!" , Color.orange, Color.black),
                new GUI_Street("Bucharest" , "Price: 85 $" , "This is the capital of Romania.", "85" , Color.green , Color.black) ,
                new GUI_Street("Brasilia", "Price: 95 $" , "This is the capital of.. you guessed it! Brazil!" , "95" , Color.GREEN , Color.black) ,
                new GUI_Jail( "default" , "Jail" , "Visiting Jail" , "Youre visiting" , Color.gray , Color.black) ,
                new GUI_Street("Athene" , "Price: 120 $" , "This is the capital of Greece.", "120" , Color.YELLOW , Color.black) ,
                new GUI_Street("Prague", "Price: 145 $" , "This is the capital of the Czech Republic." , "145" , Color.yellow , Color.black) ,
                new GUI_Chance("?" , "Try ur Luck!" , "You landed on ''?'' This field yield many random possibilities!" , Color.orange, Color.black),
                new GUI_Street("Madrid" , "Price: 180 $" , "This is the capital of Spain." , "180" , Color.pink , Color.black),
                new GUI_Street("Paris" , "Price: 190 $" , "This is the capital of France." , "190" , Color.pink , Color.black),
                new GUI_Refuge("default" , "Parkingspot" , "FREE PARK" ,"This is a parkingspot which allows you to park here for free! Plus add all uncollected fines to your own bank deposit!" , Color.gray , Color.black) ,
                new GUI_Street("Copenhagen" , "Price 210 $" , "This is the capital of Denmark." , "210" , Color.white , Color.black) ,
                new GUI_Street("Stockholm" , "Price: 220 $" , "This is the capital of Sweden." , "220" , Color.white , Color.black),
                new GUI_Chance("?" , "Try ur Luck!" , "You landed on ''?'' This field yield many random possibilities!" , Color.orange, Color.black),
                new GUI_Street("Rome" , "Price: 270 $ " , "This is the capital of Italy." , "270" , Color.darkGray , Color.white),
                new GUI_Street("Dublin" , "Price: 285 $" , "This is the capital of Ireland." , "285" , Color.darkGray , Color.white),
                new GUI_Jail("default","Jail","Go to JAIL","You have been arrested, you need to go to jail...",Color.gray,Color.black) ,
                new GUI_Street("Singapore" , "Price: 325 $" , "This is the capital of Singapore! Singapore is both a city and a country as it is a citystate governed on its own." , "325" , Color.magenta , Color.black),
                new GUI_Street("Montreal" , "Price: 340 $" , "This is the capital of Canada." , "340" , Color.magenta , Color.black),
                new GUI_Chance("?" , "Try ur Luck!" , "You landed on ''?'' This field yield many random possibilities!" , Color.orange, Color.black),
                new GUI_Street("Dubai" , "Price: 420 $" , "This is the capital of the United Arab Emirates" , "420" , Color.BLUE , Color.black),
                new GUI_Street("New york" , "Price: 450 $" , "This is the biggest city of the United States. Population: 8.23 Million." , "450" , Color.BLUE , Color.black),
        };
        GUI gui = new GUI(fields,Color.cyan);




        // Opretter spiller
        GUI_Player player = new GUI_Player("Stephen", 2000);
        gui.addPlayer(player);

// Henter feltet
        GUI_Field field = gui.getFields()[0];

// Sæt bilen til at blive vist
        field.setCar(player, true);
        while(true) {
        String chosenButton = gui.getUserButtonPressed(
                "Click a button",
                "Button 1", "Button 2"
        );


        if (chosenButton == "Button 1") {
            int dice1Facevalue = dice1.roll();
            int dice2Facevalue = dice2.roll();
            int dicesum ;
            //int oldsum = dicesum;
            //gui.getFields()[oldsum].setCar(player, false);
            dice1.roll();
            dice2.roll();
            dicesum = dice1Facevalue + dice2Facevalue;
            gui.setDice(dice1Facevalue, dice2Facevalue);
            gui.getFields()[dicesum].setCar(player, true);



        }}








}}
