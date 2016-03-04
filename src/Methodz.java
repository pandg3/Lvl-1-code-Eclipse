import javax.swing.JOptionPane;

public class Methodz {
	public static void main(String[] args) {
	String Name	= JOptionPane.showInputDialog("What is your name?");
	uRock(Name);
	rocker("Bob");
	truth("Justin Bieber");
	echo("BOO");
	repeat("LOL");
	theBest("Notch");
	addition(5,5);
	oddeven(3);
	}
static void uRock(String Name) {
	JOptionPane.showMessageDialog(null, Name +" Rocks!");
}
static void rocker(String name2){
	JOptionPane.showMessageDialog(null, name2 + " Rocks!");
}
static void truth(String name3){
	if (name3.equals("Alen")){
		JOptionPane.showMessageDialog(null, name3 + " Is awesome!");
	}
	else if (name3.equals("Justin Bieber")){
		JOptionPane.showMessageDialog(null, name3 + " Sucks!!!");
	}
}
static void echo(String echo){
	for (int i = 0; i < 2; i++) {
		JOptionPane.showMessageDialog(null, echo);
	}
}
static void repeat(String re){
	for (int i = 0; i < 3; i++) {
		JOptionPane.showMessageDialog(null, re);
	}
}
static void theBest(String getBest){
	String theBest = getBest;
	JOptionPane.showMessageDialog(null, "The best is " + theBest + "!!!!!");
}
static void addition (int one, int two){
	one+=two;
	JOptionPane.showMessageDialog(null, one);
}
static void oddeven (int num){
	if((num%2)==0){
		JOptionPane.showMessageDialog(null, "This number is Even");
	}
		
		else{
			JOptionPane.showMessageDialog(null, "This number is Odd");
		}
		   
}
}
