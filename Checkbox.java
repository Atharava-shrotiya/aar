import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class checkbox implements ItemListener {
    CheckboxGroup c=new CheckboxGroup();
    Checkbox c1,c2,c3,c4;
    Frame f=new Frame();

    checkbox(){
f.setSize(400,400);
f.setVisible(true);
f.setLayout(new FlowLayout());
        c1=new Checkbox("red",c,false);
        c2=new Checkbox("green",c,false);
        c3=new Checkbox("yellow",c,false);
        c4=new Checkbox("blue",c,false);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);

    }

    public static void main(String[] args) {
      checkbox ch=new checkbox();

    }


    public void itemStateChanged(ItemEvent e) {
       Object o = e.getSource();
       Checkbox h =(Checkbox)o;
       if (h==c1){
            f.setBackground(Color.red);

       } else if(h==c2){
           f.setBackground(Color.green);
       } else if(h==c3){
           f.setBackground(Color.yellow);
       } else if(h==c4){
           f.setBackground(Color.BLUE);
       }
    }
}
