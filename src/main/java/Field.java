import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_main.GUI;
import java.awt.*;

public class Field {

    public static void main(String[] args) {

        GUI gui = new GUI(); {


        ((GUI_Ownable) gui.getFields()[5]).setOwnerName("Player");


        ((GUI_Ownable) gui.getFields()[5]).setBorder(Color.GREEN);


        ((GUI_Ownable) gui.getFields()[5]).setRent("60");


        ((GUI_Ownable) gui.getFields()[1]).setSubText("Price: 60");
    }
}
    public boolean checkOwner(Player owningPlayer, Player landingPlayer) {
        GUI_Field myField;

        GUI gui =  new  GUI ();
        GUI_Field[] fields = gui . getFields ();
        myField = fields[0];

        GUI_Field field = gui.getFields()[1];
        GUI_Ownable ownable = (GUI_Ownable) field;

        if (ownable.getOwnerName().equals("Player") || ownable.getOwnerName().equals(null)) {
            landingPlayer.account.addNewBalance(-50);
            ownable.setOwnerName(landingPlayer.name);
            return false;
        }



        return ownable.getOwnerName().equals(landingPlayer);
        }

    public static void checkPlayer() {


        GUI_Field myField;
        GUI gui =  new  GUI ();
        GUI_Field [] fields = gui . getFields ();
        myField = fields[0];

        GUI_Field field = gui.getFields()[1];
        GUI_Ownable ownable = (GUI_Ownable) field;



        ((GUI_Ownable) gui.getFields()[5]).setOwnerName("Player");
        ((GUI_Ownable) gui.getFields()[5]).setBorder(Color.GREEN);
        ((GUI_Ownable) gui.getFields()[5]).setRent("60");
        ((GUI_Ownable) gui.getFields()[1]).setSubText("Price 60,-");

        ownable.getOwnerName().equals("Player");


    }
}