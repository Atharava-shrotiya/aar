import javax.swing.*;  
import java.awt.event.*;  
  
public class jtoggleexp extends JFrame implements ItemListener {  
     
    JToggleButton b;  
    jtoggleexp() {  
        setTitle(" Jtoggle Button Example"); 
        setSize(600,600);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  		
        setLayout(null);  
        b= new JToggleButton("ON");
        b.setBounds(100,100,100,100);	
        add(b); 
		b.addItemListener(this); 
        
    }  
     
    public void itemStateChanged(ItemEvent eve) {  
        if (b.isSelected())  
            b.setText("OFF");  
        else  
            b.setText("ON");  
    }  
	public static void main(String[] args) {  
        new jtoggleexp();  
    } 
} 
