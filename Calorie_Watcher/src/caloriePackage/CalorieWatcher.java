package caloriePackage;
import java.util.Scanner;


public class CalorieWatcher {
	static Scanner keyboard= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float max_cookies=40;
		int Servings_in_bag=10;
		int calorie_per_serve=300;
		int number_of_cookies_eaten;
		float serves_eaten;
		float calorie_consumed;
		System.out.print("Enter the number of cookies eaten:");
		number_of_cookies_eaten=keyboard.nextInt();
		number_of_cookies_eaten=validate(number_of_cookies_eaten);
		System.out.println(number_of_cookies_eaten);
		serves_eaten=(number_of_cookies_eaten/max_cookies)*Servings_in_bag;
		calorie_consumed=serves_eaten*calorie_per_serve;
		System.out.println(calorie_consumed);
	}
	static int validate(int value) {
		while(value<0&&value>40) {
			System.out.print("Please reenter the number of cookies eaten:");
			value=keyboard.nextInt();
		}
		return value;
	}

}
