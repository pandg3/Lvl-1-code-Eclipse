import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
public class Houses {
	


public static void main(String[] args) {
	
	int small = 60;
	int medium = 120;
	int large = 250;
	Tortoise.setSpeed(8);
	Tortoise.setX(0);
	Tortoise.setY(440);
	house(small, Color.red ,"flat" );
	house(medium, Color.green,"spike");
	house(small, Color.blue,"spike");
	house(large, Color.orange,"spike");
	house(medium, Color.yellow,"flat");
	house(large, Color.orange, "flat");
	house(small, Color.blue, "spike");
	house(medium, Color.green, "flat");
	house(small, Color.red, "flat");




	

	//8. give the houses peaked roofs

	//9. extract that into a method “drawPointyRoof” and “drawFlatRoof”

	//10. make large houses have flat rooves

	//11. make the roof type selection random
	
}

private static void spikeroof() {
	Tortoise.setAngle(70);
	Tortoise.move(20);
	Tortoise.setAngle(110);
	Tortoise.move(20);
}

private static void flatroof() {
	Tortoise.setAngle(90);
	Tortoise.move(40);
}

	private static void house(int move, Color color, String rooftype) 
	{
		Tortoise.setPenColor(Color.green);
		Tortoise.show();
		Tortoise.setAngle(90);
		Tortoise.move(20);
		Tortoise.setPenColor(color);
		Tortoise.setAngle(0);
		Tortoise.move(move);
		if (rooftype.equals("flat"))
		{
			flatroof();
		}
		if (rooftype.equals("spike"))
		{
			spikeroof();
		}
		
		Tortoise.setAngle(180);
		Tortoise.move(move);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(5);
	}
	
}
