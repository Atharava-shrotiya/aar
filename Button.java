import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Frame1 extends JFrame{
	
    	Frame1(){
    		JTextField tf=new JTextField();
    		tf.setBounds(100,60,300,32);
// Button with icon and ActionListener
    		JButton b=new JButton(new ImageIcon("C:\\Users\\lenovo\\Pictures\\Saved Pictures\\buddha.jpg"));
    		b.setBounds(100,100,300,168);
// Button with name
    		JButton b1=new JButton("Click");
    		b1.setBounds(100,500,90,32);
    		setVisible(true);
    		setSize(600,600);
    		setLayout(null);
    		b.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				tf.setText(" The mind is everything. What you think you become.");
    			}
    		});
    		add(b);add(b1);add(tf);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}
		public static void main(String[] args) {
			Frame1 f1=new Frame1();
		}
   
}
