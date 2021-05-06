import java.awt.*;
import java.awt.event.*;
public class prg
{
    public static void main(String[] args)
	{
		Frame o=new Frame("My Frame");
		o.setVisible(true);
	    o.setSize(800,600);
		o.addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent b){
		
		System.exit(0);
		}
		
		});
   }   
}
©
