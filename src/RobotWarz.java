import java.awt.event.KeyEvent;

import org.jointheleague.graphical.robot.Robot;

public class RobotWarz {
Robot rob= new Robot();
	public static void main(String[] args) {
	
		}
private void up(){
			int y = rob.getY();
			rob.setY(y+=10);

}
private void down(){
	int y = rob.getY();
	rob.setY(y-=10);
}
public void dispatchKeyEvent(KeyEvent e)
{
	if (e.getID() == KeyEvent.KEY_PRESSED)
	{
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
			up();
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			down();

}
	}
}
