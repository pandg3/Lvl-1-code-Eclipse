import java.awt.event.KeyEvent;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Tortoise;

public class RobotWarz {
Robot rob= new Robot();
	public static void main(String[] args) {
	new RobotWarz = 
		}
	private void goUp() {
		rob.move(10);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}
public boolean dispatchKeyEvent(KeyEvent e) {
	if (e.getID() == KeyEvent.KEY_PRESSED) {

		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			goRight();
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			goLeft();
		if (e.getKeyCode() == KeyEvent.VK_UP)
			goUp();
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			goDown();
		}
}	
}
