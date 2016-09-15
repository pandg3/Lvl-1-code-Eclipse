import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	int bondAttempt = JamesBond.class.
	int Code = new Random().nextInt(1000000);
	Boolean unlock = false;
	public Boolean trycode(){
		if (Code == bondAttempt){
			unlock = true;
			return unlock;
		}
	}
}
