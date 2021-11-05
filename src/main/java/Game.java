import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

public class Game {
    public static void main(String[] args) {
        GUI gui = new GUI();
        GUI_Field field;
        GUI_Field[] fields = gui.getFields();


        field = fields[0];
        field.setTitle("Start");
        field.setForeGroundColor(Color.RED);
        field.setBackGroundColor(Color.BLACK);

        field = fields[1];
        field.setTitle("Nairobi");
        field.setSubText(" Price:   60");
        field.setBackGroundColor(Color.GRAY);

        field = fields[3];
        field.setTitle("Tripoli");
        field.setSubText(" Price:   65");
        field.setBackGroundColor(Color.GRAY);

        field = fields[4];
        field.setForeGroundColor(Color.RED);
        field.setBackGroundColor(Color.BLACK);

        field = fields[6];
        field.setTitle("Bukarest");
        field.setSubText(" Price:   85");
        field.setBackGroundColor(Color.CYAN);

        field = fields[8];
        field.setTitle("Brasilia");
        field.setSubText(" Price:   95");
        field.setBackGroundColor(Color.CYAN);

        field = fields[11];
        field.setTitle("xx");
        field.setSubText(" Price:   xx");
        field.setBackGroundColor(Color.PINK);

        field = fields[13];
        field.setTitle("xx");
        field.setSubText(" Price:   xx");
        field.setBackGroundColor(Color.PINK);

        field = fields[16];
        field.setTitle("Paris");
        field.setSubText(" Price:   180");
        field.setBackGroundColor(Color.ORANGE);

        field = fields[18];
        field.setTitle("Madrid");
        field.setSubText(" Price:   190");
        field.setBackGroundColor(Color.ORANGE);

        field = fields[21];
        field.setTitle("Copenhagen");
        field.setSubText(" Price:   210");
        field.setBackGroundColor(Color.RED);

        field = fields[22];
        field.setTitle("Stockholm");
        field.setSubText(" Price:   220");
        field.setBackGroundColor(Color.RED);

        field = fields[26];
        field.setTitle("Rom");
        field.setSubText(" Price:   270");
        field.setBackGroundColor(Color.YELLOW);

        field = fields[29];
        field.setTitle("Dublin");
        field.setSubText(" Price:   285");
        field.setBackGroundColor(Color.YELLOW);

        field = fields[31];
        field.setTitle("Singapore");
        field.setSubText(" Price:   325");
        field.setBackGroundColor(Color.GREEN);

        field = fields[32];
        field.setTitle("Montreal");
        field.setSubText(" Price:   340");
        field.setBackGroundColor(Color.GREEN);

        field = fields[37];
        field.setTitle("New York");
        field.setSubText(" Price:   420");
        field.setBackGroundColor(Color.BLUE);

        field = fields[39];
        field.setTitle("Dubai");
        field.setSubText(" Price:   445");
        field.setBackGroundColor(Color.BLUE);






































    }


}



