package Logger;

public class App 
{


	public static void main(String[] args) 
	{
		
//System.out.println("1st to run.");
		
			String word = "HELLO"; 
			
//System.out.println("AsteriskLogger");
			
			AsteriskLogger object = new AsteriskLogger();
			object.Log(word);
			object.Error(word);
			
//System.out.println("SpacedLogger");
			
			SpacedLogger object2 = new SpacedLogger ();
			object2.Log(word);
			object2.Error(word);
			
			

	}// Main
}// Class