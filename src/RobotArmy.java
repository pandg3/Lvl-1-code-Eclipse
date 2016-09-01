import javax.swing.JOptionPane;

public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		Human Max = new Human("Max", 74 );
		//2. create a new Robot army of good and evil robots.
		Robot Moe = new Robot("Moe", true, 50 );
		Robot Billy = new Robot("Billy", false, 75);
		//3. command your robot army to destroy a human
	moe.battle()
		
	
	
	}

	
	
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	int powah;
	public Human(String name, int powah){
		this.name = name;
		this.isAlive = true;
		this.powah = powah;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
public int getPower(){
		
		return powah;
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	int Power;
	public void battle(Robot moe) {
		if (Power>moe.getPower()){
			System.out.println("The Human is Victorious!");
		}
		else{
			System.out.println("The robot Kills the Human!");
		}
	}
	public Robot(String name, boolean isEvil, int Power){
		this.name = name;
		this.isEvil = isEvil;
		this.Power= Power;
	}
	public int getPower(){
		
		return Power;
	}
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}
}

