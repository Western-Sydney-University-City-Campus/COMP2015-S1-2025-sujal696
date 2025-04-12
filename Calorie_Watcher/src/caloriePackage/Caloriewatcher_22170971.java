package caloriePackage;
import java.util.Scanner;


public class Caloriewatcher_22170971 {
	static Scanner keyboard= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float maxCookies = 40;
		int servingsInBag = 10;
		int caloriePerServe = 300;
		int numberOfCookiesEaten;
		float servesEaten;
		float calorieConsumed;

		System.out.print("Enter the number of cookies eaten: ");
		numberOfCookiesEaten = keyboard.nextInt();
		numberOfCookiesEaten = validate(numberOfCookiesEaten);
		System.out.println(numberOfCookiesEaten);

		servesEaten = (numberOfCookiesEaten / maxCookies) * servingsInBag;
		calorieConsumed = servesEaten * caloriePerServe;
		System.out.println(calorieConsumed);
	}
  //Method to validate no of cookies eaten.
	static int validate(int value) {
		while(value < 0 || value > 40) {
			System.out.print("Please reenter the number of cookies eaten: ");
			value = keyboard.nextInt();
		}
		return value;
	}
}
