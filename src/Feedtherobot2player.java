


	// Copyright Wintriss Technical Schools 2013 
	import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

	

	public class Feedtherobot2player implements KeyEventDispatcher
	{
Robot rob= new Robot();
Robot canibalvictim= new Robot();

		// 1. Decide where to put the food by setting these variables
		int foodLocationX;
		int foodLocationY;
		// If the food does not show up, you need to switch to Java 1.6

		// 2. Choose a character for your food or leave it as *
		Component food = new Label("*");

		private void goUp()
		{
			int robY =rob.getY();
			rob.setY(robY-20);

		}

		private void goDown()
		{
			int robY =rob.getY();
			rob.setY(robY+20);
		}

		private void goLeft()
		{
			int robX =rob.getX();
					rob.setX(robX-20);
		}

		private void goRight()
		{
			int robX =rob.getX();
			rob.setX(robX+20);
		}

		private void checkIfFoodFound() throws Exception
		{
			//int tortoiseLocationX = Tortoise.getX();
			//int tortoiseLocationY = Tortoise.getY();

			// 7. if tortoise is near the food
				// say something. Hint: Runtime.getRuntime().exec("say yum")
		}

		public boolean dispatchKeyEvent(KeyEvent e)
		{
			if (e.getID() == KeyEvent.KEY_PRESSED)
			{
				if (e.getKeyCode() == KeyEvent.VK_RIGHT)
					goRight();
				if (e.getKeyCode() == KeyEvent.VK_LEFT)
					goLeft();
				if (e.getKeyCode() == KeyEvent.VK_UP)
					goUp();
				if (e.getKeyCode() == KeyEvent.VK_DOWN)
					goDown();

				//Hint: "e.getKeyCode() == KeyEvent.VK_T" is TRUE when T is pressed
				// 8. if the W key is pressed,
					// call the method moveFoodUp();
				if (e.getKeyCode() == KeyEvent.VK_W)
					moveFoodUp();
				if (e.getKeyCode() == KeyEvent.VK_S)
					moveFoodDown();
				if (e.getKeyCode() == KeyEvent.VK_A)
					moveFoodLeft();
				if (e.getKeyCode() == KeyEvent.VK_D)
					moveFoodRight();
				//11. Do the same for left, right, and down. You can choose your own keys if you like. You will need to make new methods for moving the food.
				
				//12. If the secret key is pressed
					// Call the method moveFoodToARandomLocation

				// Awesome points(finish everything else first): The person controlling the food has a big disadvantage they have to keep pressing buttons. While the turtle player and hold the arrow keys. Can you think you think of a way to make this game more fair for the food? Hint: e.getID() == KeyEvent.KEY_PRESSED is true when a key is first pressed and e.getID() == KeyEvent.KEY_RELEASED is true when a key is released. 

				
			}
			return processEvent();
		}

		private void moveFoodUp()
		{
			System.out.println("Move food up!");
			int foodY = canibalvictim.getY();
			canibalvictim.setY(foodY-20);
			//9. decrement foodLocationY 

			//10. call the moveFood() method

		}
		private void moveFoodDown(){
			int foodY = canibalvictim.getY();
			canibalvictim.setY(foodY+20);
		}
		private void moveFoodLeft(){
			int foodx = canibalvictim.getX();
			canibalvictim.setX(foodx-20);
			}
			private void moveFoodRight(){
				int foodx = canibalvictim.getX();
				canibalvictim.setX(foodx+20);
			}
		
		private void moveFoodToARandomLocation()
		
		{
			//foodLocationX = new Random().nextInt(window.getSize().width);
			//foodLocationY = new Random().nextInt(window.getSize().height);
			moveFood();
		}

		private void moveFood()
		{
			food.setLocation(foodLocationX, foodLocationY);
			//window.add(food);
		}

		//TurtlePanel window = Tortoise.getBackgroundWindow();

		public static void main(String[] args)
		{
			Feedtherobot2player feeder = new Feedtherobot2player();
			feeder.controlTheTortoise();
			feeder.feedTheTortoise();
		}

		private void controlTheTortoise()
		{
			KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
			//Tortoise.show();
			//Tortoise.setSpeed(10);
	//Tortoise.getBackgroundWindow().setBackground(Colors.getRandomColor());

		}

		private void feedTheTortoise()
		{
			moveFood();
		}
		
		private boolean processEvent()
		{
			try
			{
				checkIfFoodFound();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			return false;
		}

	}



