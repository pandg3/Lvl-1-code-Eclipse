import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TootMachene implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
public static void main(String[] args) {
	new TootMachene().button();
	
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
	button1.setText("Fart one");
	button2.setText("Fart two");
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == button1){
		playSound("Fart-Squeeze-Yer-Knees_Mike-Koenig.wav");
	}
	if (e.getSource() == button2){
		playSound("Oopsy Daisy Fart-SoundBible.com-8405343.wav");
	}
	
}
}
