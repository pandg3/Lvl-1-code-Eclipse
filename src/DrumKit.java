// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumLabelWithImage;

    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame drumkit = new JFrame();
   	 // 2. Make the frame visible
   	 drumkit.setVisible(true);
   	 // 3. Set the size of the frame
   	 drumkit.setSize(450, 350);
   	 // 4. Set the title of the frame
   	 drumkit.setTitle("DRUMKIT");
   	 drumkit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 // 5. Make a JPanel and initialize it.
   	 JPanel jpanel = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
    drumkit.add(jpanel);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
   	 // 8. Put the name of your image in a String variable.
    String drum = "Unknown.jpeg";
   	 // 9. Use the "createLabelImage()" method to initialize the drumLabelWithImage variable.
   	 JLabel drumimg = createLabelImage(drum); 
   	 
   	 // 10. Add the image to the panel
    jpanel.add(drumimg);
   	 // 11. Set the layout of the panel to "new GridLayout()"
    jpanel.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   	 drumkit.pack();
   	 // 13. add a mouse listener to drumLabelWithImage.
drumkit.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"
System.out.println("*drum noise*");
   //	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". There are some sounds here: http://bit.ly/drum-sounds or you can also get them from freesound.org
   	 // 16. If they clicked on the drumImage...
System.out.println(e.getY());
int mouseY = (e.getY());
if (mouseY < 79) {
	playSound("secretsound.wav");
}
else {
	playSound("Drumsound.wav");
}
   		 // 17. ...use the playSound method to play a drum sound.

   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



