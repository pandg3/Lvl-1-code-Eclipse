import javax.swing.JOptionPane;


public class Interwebs {
public static void main(String[] args) {
	Memes Doge = new Memes (12042602, "Broken English colerd txt around his photo");
	Memes GrumpyCat = new Memes (20136423, " Youtube + being Grumpy! (wat)");
	String input =JOptionPane.showInputDialog("Do You want to start a dodge meme, or the Grumpy cat meme(dont add meme to word Example-doge. or grumpy cat ");
	if (input.equals("doge")){
	Doge.Start_meme();
	Doge.be_on_interwebs();		
	}
	else{
		GrumpyCat.Start_meme();
		GrumpyCat.be_on_interwebs();
	}
}
}
