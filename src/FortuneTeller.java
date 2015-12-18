// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    BufferedImage fortuneTellerImage;
    int random = new Random().nextInt(2);
    int frameWidth = 300;
    int frameHeight = 502;

    FortuneTeller() throws Exception {
   	 // 1. Choose an image for your fortune teller and put it in your default package
   	 fortuneTellerImage = ImageIO.read(getClass().getResource("fortune_teller.png"));
   	 // 2. Adjust the framexeWidth and frameHeight variables to fit your image nicely (doesn’t need a new line of code)
   	 
   	 // 4. add a mouse listener
this.addMouseListener(this);
    }

    static void begin() {
   	 // 3. Welcome the user. Give them a hint for the secret location.
JOptionPane.showMessageDialog(null, "Hello and welcome to the fortune teller! A crystal ball will present your future");
    }

    @Override
    public void mousePressed(MouseEvent e) {
   	 int mouseX = e.getX();
   	 int mouseY = e.getY();
   	 // 5. Print the mouseX variable
System.out.println(mouseX + "X"); System.out.println(mouseY + "Y");
   	 // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
   	 // 7. Adjust your secret location co-ordinates here:
   	 int secretLocationX = 238;
   	 int secretLocationY = 285;
   	 /** If the mouse co-ordinates and secret location are close, we'll let them ask a question. */
   	 if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
   		 // 8. Get the user to enter a question for the fortune teller
JOptionPane.showInputDialog("Ask Me a Question");
   		 // 9. Find a spooky sound and put it in your default package (freesound.org)
   		  AudioClip sound = JApplet.newAudioClip(getClass().getResource("spooky.wav"));
   		 // 10. Play the sound
sound.play();
   		 // 11. Use the pause() method below to wait until your music has finished

   		 // 12. Insert your completed Magic 8 ball recipe (http://bit.ly/Zdrf6d) here
//2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable
System.out.println(random);

	// 5. If the random number is 0
if (random == 0){
	JOptionPane.showMessageDialog(null, "Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (random == 1){
	JOptionPane.showMessageDialog(null, "No");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (random == 2){
	JOptionPane.showMessageDialog(null, "Ask google or something! also you are still paying for this");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (random == 3){
	JOptionPane.showMessageDialog(null, "I think you allready know");
}
	// -- write your own answer

}

   	 }

    

    private boolean areClose(int mouseX, int secretLocationX) {
   	 return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
   	 try {
   		 Thread.sleep(1000 * seconds);
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
    
    /**************** don't worry about the stuff under here *******************/

    public static void main(String[] args) throws Exception {
   	 SwingUtilities.invokeLater(new FortuneTeller());
   	 begin();
    }

    @Override
    public void run() {
   	 JFrame frame = new JFrame();
   	 frame.add(this);
   	 setPreferredSize(new Dimension(frameWidth, frameHeight));
   	 frame.pack();
   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frame.setResizable(false);
   	 frame.setVisible(true);
    }

private void showAnotherImage(String imageName) {
   	 try {
   		 fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
   	 } catch (Exception e) {
   		 System.err.println("Couldn't find this image: " + imageName);
   	 }
   	 repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
   	 g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}

