import javax.swing.*;
public class myslide
{
    public static void main(String[] args)
	{
		JFrame o=new JFrame("slider exaple");
		o.setVisible(true);
	    o.setSize(400,400);
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSlider s =new JSlider(JSlider.HORIZONTAL, 0, 60, 35);  
		JPanel p=new JPanel();
		p.add(s);
		o.add(p);
   }   
