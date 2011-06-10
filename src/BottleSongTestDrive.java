import java.util.Scanner;
import java.util.Random;

public class BottleSongTestDrive {
	static int randomInt;
	static String ready;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		

		// asks and stores the name and number of whatever
		// the user is drinking
		System.out.print("What type of liquid will you be drinking (plural form)? ");
		String liquidName = in.nextLine();
		System.out.print("What type of container will you be drinking " + liquidName + " from (plural form)? ");
		String bottleFormPlural = in.nextLine();
		System.out.print("What is the singular form of " + bottleFormPlural + "? ");
		String bottleFormSing = in.nextLine();
		System.out.print("How many " + bottleFormPlural + " of " + liquidName + " " + "will you be drinking? ");
		int liquidNum = in.nextInt();
		
		
		BottleSong tom = new BottleSong(liquidName, bottleFormPlural, bottleFormSing, liquidNum);
		System.out.println("I'm going to sing you a song about your life now.");
		System.out.print("Are you ready (yes or no)? ");
		in.nextLine();
		ready = in.nextLine();
		
		// while loop if user is not ready
		// insults user with 5 random phrases
		Random generator = new Random();
		// learned here that strings are compared with methods,
		// not operators
		while (!ready.equals("yes")) {
			randomInt = generator.nextInt(5);
			if (randomInt == 0){
				System.out.print("Are you ready now (yes or no)? ");
			}
			if (randomInt == 1){
				System.out.print("Are you ready to do science (yes or no)? ");
			}
			if (randomInt == 2){
				System.out.print("All you have to do is type yes (yes or no). ");
			}
			if (randomInt == 3){
				System.out.println("Maybe you shouldn't type yes. ");
				System.out.print("Do you think I'm trying to trick you with reverse psychology (yes or no)? ");
			}
			if (randomInt == 4){
				System.out.print("This is a safe testing environment--I promise (yes or no)! ");
			}
			ready = in.nextLine();
		}
		in.close();
		
		// counts bottles with this method in the
		// BottleSong class
		tom.countBottlesPlural();
		tom.countBottlesSingular();
	}
}