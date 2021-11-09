import gui_fields.*;
import gui_main.GUI;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {

        GUI_Field[] fields = {
                new GUI_Start("START", "Receive 50G","This", Color.red, Color.black),
                new GUI_Street("Nairobi", "Price: 60,-","This is the capital of Kenya","60", Color.gray, Color.black),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Jail(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Refuge(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Jail(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
        };
        GUI gui = new GUI(fields);
    }






}
