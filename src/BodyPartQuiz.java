import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String firstImage = "/Users/Guest/Documents/Lvl-1-code-Eclipse/src/GABE.png";
	String secondImage = "/Users/Guest/Documents/Lvl-1-code-Eclipse/src/grumpy-cat.png";
	String thirdImage = "/Users/Guest/Documents/Lvl-1-code-Eclipse/src/smiling-poop-emoji.jpg";

	Frame window = new Frame();

	private void startQuiz() {

		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
		String name = JOptionPane.showInputDialog("What is your name?");
		// If they got the answer right:
		String q1 = JOptionPane.showInputDialog("Who is this? (No caps plz)");
		if (q1.equals("gabriel")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Corect!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}

		showNextImage();
		String q2 = JOptionPane
				.showInputDialog("Who is this? (No caps plz), but a space is needed.");
		if (q2.equals("grumpy cat")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Corect!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			}
		showNextImage();
		String q3 = JOptionPane
				.showInputDialog("Who is this? (No caps plz), but a space is needed.");
		if (q3.equals("smile poop")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Corect!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			}
	}

	// -- Tell them they are correct.
	// -- Increase the score by 1

	// Otherwise:
	// -- Tell them they are wrong

	// Use the method below to show the next image
	// Show the score
	// .... repeat for all your images.....

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
