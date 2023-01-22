import java.util.Scanner;
    
public class SimpleLauncher {
	public static void main(String [] args) {
		PirateTranslator translator = new PirateTranslator();
		Scanner userInput = new Scanner(System.in);
		String response;

		// userInput.hasNext() will return true until
		// you type 'Control-D' on a mac, or Control-Z on
		// a windows machine.  if that happens, we need
		// to break out of the loop and stop.
		while(userInput.hasNext()) {
			System.out.println(translator.translate(userInput.nextLine()));
		
		}
    	}
}
