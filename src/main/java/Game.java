
public class Game {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Player[] playerList;
    Gui gui = new Gui();
    Field field = new Field();
    private void runTurn(int turnNum ){
        Player player = playerList[turnNum];
        int die1Facevalue = dice1.roll();
        int die2Facevalue = dice2.roll();
        int dicesum;
        dice1.roll();
        dice2.roll();
        dicesum = die1Facevalue + die2Facevalue;
        player.addpostion(dicesum);

        //hard coded scenario
        gui.moveplayer(turnNum,player.position);
        field.field(player,player.position);
        //if (player.position == 3 || player.position == 9 || player.position == 15 || player.position == 21){
            //int newamount = player.account.addNewBalance(+ 10);
            //gui.changeBalance(turnNum,newamount);
            //gui.changeBalance(turnNum,player.account.getBalance());
      // }

        gui.Dice(die1Facevalue,die2Facevalue);
        gui.changeBalance(turnNum,player.account.getBalance());

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

