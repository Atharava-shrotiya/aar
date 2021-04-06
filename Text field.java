package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
public class Textfield extends Frame{

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setTitle("TextFields");
		Panel p=new Panel();
		f.add(p);
		Label l=new Label("Enter your Name");
		p.add(l);
        TextField tf=new TextField(10);
        p.add(tf);
        f.addWindowListener(new Exit());
	}

}
class Exit extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		
		System.exit(0);
	}
	
}
