import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JFrame frame;
		JPanel panel;
		JButton button1;
		JButton button2;
	public static void main(String[] args) {
		new chuckleClicker().button();
		
	}
	void button (){
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		 button1 = new JButton();
		 button2 = new JButton();
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		button1.setText("Joke");
		button2.setText("Punchline");
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1){
			JOptionPane.showMessageDialog(null, "A friend of mine tried to annoy me with bird puns, but I soon realized that toucan play at that game.");
		}
		if (e.getSource() == button2){
			JOptionPane.showMessageDialog(null, "By the pun saying Tocan play at that game, a tocan is a type of bird, and also sounds like I two can play at that game.");
		}
		
	}

	
}
	