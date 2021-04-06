import javax.swing.*;
import java.awt.*;

public class box_layout extends Frame{

  Button b1=new Button("1");
    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    Button b6=new Button("6");
    Button b7=new Button("7");
    Button b8=new Button("8");

    box_layout(){
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);

    }

    public static void main(String[] args) {

      box_layout b=new box_layout();
      b.setSize(400,400);
      b.setVisible(true);
      b.setLayout(new BoxLayout(b,BoxLayout.Y_AXIS));

    }
}
