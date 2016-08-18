
public class OlympicTeam {
	public static void main(String[] args) {
		go();
	}
	public static void go(){
		Olympian joe = new Olympian("joe", 25, "Swimmer");
		Olympian bob = new Olympian("bob", 24, "Sprinter");
		bob.perform();
		joe.perform();
	}


}
