 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String mcpig = "http://2.bp.blogspot.com/-Yhpr3WXFnuM/UWfkCNuFH4I/AAAAAAAAGEI/olUEbqD3Y0s/s1600/minecraft-pig.png";
String cake = "https://districtlines.s3.amazonaws.com/designs/36451/CakeART.jpg";
int score = 0;
		// 2. create a variable of type "Component" that will hold your image
Component mcpig1;
Component cake1;
		// 3. use the "createImage()" method below to initialize your Component
mcpig1 = createImage(mcpig);
cake1 = createImage(cake);
		// 4. add the image to the quiz window
quizWindow.add(cake1);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question1 = JOptionPane.showInputDialog("What physics based series is this meme from");
		// 7. print "CORRECT" if the user gave the right answer
if (question1.equals("portal")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 5;
}
else{
	JOptionPane.showMessageDialog(null, "Wrong!");
}
// 8. print "INCORRECT" if the answer is wrong
quizWindow.remove(cake1);
quizWindow.add(mcpig1);
quizWindow.pack();
String question2 = JOptionPane.showInputDialog("What popular PC game is this pig from?");
if (question2.equals("minecraft")){
	JOptionPane.showMessageDialog(null, "Corect!");
	score += 5;
}
else{
	JOptionPane.showMessageDialog(null, "Wrong!");
}
JOptionPane.showMessageDialog(null, "You got a total of " + score +"/10");

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}


