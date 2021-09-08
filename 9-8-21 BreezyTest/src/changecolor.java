import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class changecolor extends GBFrame{

	static String a = "aaaaa";
	static double frequency = .0000001;
	static int i = 0;
	static JFrame frm;
	JButton convertButtonR = addButton ("Red",1,1,1,1);
	JButton convertButtonO = addButton ("Orange",1,2,1,1);
	JButton convertButtonY = addButton ("Yellow",1,3,1,1);
	JButton convertButtonG = addButton ("Green",1,4,1,1);
	JButton convertButtonB = addButton ("Blue",1,5,1,1);
	JButton convertButtonP = addButton ("Purple",1,6,1,1);
	
	public void buttonClicked(JButton buttonObj){
		if (buttonObj == convertButtonR){
			frm.getContentPane().setBackground (Color.red);
		} else if (buttonObj == convertButtonO) {
			frm.getContentPane().setBackground (Color.orange);
		} else if (buttonObj == convertButtonY) {
			frm.getContentPane().setBackground (Color.yellow);
		} else if (buttonObj == convertButtonG) {
			frm.getContentPane().setBackground (Color.green);
		} else if (buttonObj == convertButtonB) {
			frm.getContentPane().setBackground (Color.blue);
		} else {
			frm.getContentPane().setBackground (Color.magenta);
		}
    }
	
	public static void main(String[] args) {
		frm = new changecolor();
		frm.setTitle("Change Color");
		frm.setSize (500, 200);
		frm.setVisible (true);
		rainbow();
	}
	
	public static void rainbow() {
		while(true)
		{
		   int red   = (int)(Math.sin(frequency*i + 0) * 127 + 128);
		   int green = (int)(Math.sin(frequency*i + 2) * 127 + 128);
		   int blue  = (int)(Math.sin(frequency*i + 4) * 127 + 128);
		   i++;
		   frm.getContentPane().setBackground (new Color(red, green, blue));
		}
	}

}
