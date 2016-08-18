public class Olympian {
String name;
String Sport;
int AvgSpeed;
int bibNumber;
static int number=0;

public Olympian(String name, int AvgSpeed, String Sport){
	this.name = name;
	this.Sport = Sport;
	this.AvgSpeed = AvgSpeed;
	number ++;
	bibNumber=number;
	
}


void perform(){
	System.out.println("The athletes name is " + name +", He has a averege speed of " +AvgSpeed+ " With a bib number of " + bibNumber +". He is a "+ Sport );
}
}
