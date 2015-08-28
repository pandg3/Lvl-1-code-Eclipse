
public class Memes {
int Num_friends;
String Source_of_popularity;
Memes(int Num_friends, String Source_of_popularity){
	this.Num_friends = Num_friends;
	this.Source_of_popularity = Source_of_popularity;
}
void Start_meme(){
	System.out.println("The Meme has been Started!");
	System.out.println("Its soruce of popularity will be "+ Source_of_popularity);
}
void be_on_interwebs(){
	System.out.println("The meme is popular on the interwebs!");
	System.out.println("The meme has aquired " + Num_friends + " Friends through the interwebs!");
}

}
