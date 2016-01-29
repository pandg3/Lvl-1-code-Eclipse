import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Cowtimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 */
private int minutes;
	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
String number = JOptionPane.showInputDialog("How many seconds do you want the timer to run?");
	int number2 = Integer.parseInt(number);
	
	Cowtimer timer = new Cowtimer();
	timer.setTime(number2);
	timer.start();
	}

	

	public void setTime(int minutes) {
		this.minutes = minutes;
		
		System.out.println("Cow set to " + minutes + " seconds.");
		
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */
		for (int i = 0; i < minutes; i++) {
		Thread.sleep(1000);	
		System.out.println(i);
		}
		playSound("Cow.wav");
		JOptionPane.showMessageDialog(null, "DONE");
		
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to walk.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

