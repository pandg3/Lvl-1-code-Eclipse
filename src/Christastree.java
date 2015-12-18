import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Christastree {
	
public static void main(String[] args) {
	int move = 40;
	//star
	Tortoise.setSpeed(10);
	Tortoise.setY(50);
	Tortoise.setAngle(240);
	for (int a = 0; a <5; a++) {
		Tortoise.setPenColor(Color.yellow);
		Tortoise.turn(144);
		Tortoise.move(50);
	}
	
	//Tree
	Tortoise
	Tortoise.setPenColor(Color.green);
	Tortoise.setSpeed(10);
Tortoise.setAngle(-90);
	for (int i = 0; i < 12; i++) {
		
		Tortoise.turn(-170);
		Tortoise.move(move);
		move *= 1.1;
		Tortoise.turn(170);
		Tortoise.move(move);
		move *= 1.1;
		

	}
//trunk
	Tortoise.turn(-170);
	move/=2;
	move -= 5;
	Tortoise.move(move);
	Tortoise.setPenWidth(30);
	Tortoise.setPenColor(Colors.Browns.Sienna);
	Tortoise.setAngle(180);
	Tortoise.move(50);
	Tortoise.setAngle(90);
	Tortoise.move(20);
	Tortoise.setAngle(0);
	Tortoise.move(50);
}
}
