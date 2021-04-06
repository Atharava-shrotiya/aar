package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
public class RadioButton extends Frame implements ItemListener{
	String msg="";
	CheckboxGroup cbg;
	Checkbox cb1,cb2;
	RadioButton(){
		addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e) {
			
			System.exit(0);
		}	
			
		});
		
		setLayout(new FlowLayout());
        cbg=new CheckboxGroup();
        cb1=new Checkbox("Male",cbg,true);
        cb2=new Checkbox("Female",cbg,true);
        add(cb1);
        add(cb2);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        
	}
	public void itemStateChanged(ItemEvent ie) {
		
		repaint();
	}
	public void paint(Graphics g) {
		msg="status:";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,15, 100);
		
	}
	


	public static void main(String[] args) {
		RadioButton rb=new RadioButton();
		rb.setTitle("radio button");
		rb.setVisible(true);
		rb.setSize(500,500);

	}

}
