import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cookie implements ActionListener {
	
public static void main(String[] args) {
	
	
	Cookie fortune = new Cookie();
	fortune.showButton();
}
public void showButton(){
	JFrame jF = new JFrame();
	JButton BT = new JButton();
	jF.add(BT);
	BT.addActionListener(this);
	jF.setVisible(true);
	
	System.out.println("CLICK");
	jF.pack();
	BT.setText("CLICK FOR FORTUNE");
}
@Override
public void actionPerformed(ActionEvent e) {
	int random = new Random().nextInt(5);
	System.out.println("CLICK");
	if (random == 0) {
		JOptionPane.showMessageDialog(null, "You will code a smurf related project today...");
		
		
		}
		else if (random == 1){
			JOptionPane.showMessageDialog(null, "Code is your favorite thing to do and  you will do it for a while longer");
	}
		else if (random == 2){
			JOptionPane.showMessageDialog(null, "You will fly to the moon, but it is your choise to decide if figuritvly, or reality");
		}
		else if (random ==3){
			JOptionPane.showMessageDialog(null, "You will do something in the future");
		}
		else if (random == 4){
		String fortune =	JOptionPane.showInputDialog("I ran out of fortunes, you make one up!");
		JOptionPane.showMessageDialog(null, "Oh, I got a Fortune for you! It's" + fortune);
		}
}
}
