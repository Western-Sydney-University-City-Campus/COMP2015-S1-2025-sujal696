package stock_exchange;
import java.util.Scanner;
public class Stock_exchange {
	static Scanner keyboard= new Scanner(System.in);
	public static void main(String[] args)
	{
		float share_price;
		float no_of_shares;
		float stock_cost;
		double commission;
		double total_price;
		System.out.print("Enter the price of price:");
		share_price=keyboard.nextInt();
		while(share_price<=0 || share_price>500) {
			System.out.print("Invalid share price must be between 0 and 500");
			System.out.print("\nEnter the price of share:");
			share_price=keyboard.nextInt();
		}
		System.out.print("Enter the number of shares:");
		no_of_shares=keyboard.nextInt();
		while(no_of_shares<100 || no_of_shares>100000) {
		System.out.print(" Invalid no of shares must be between 100 and 100,000");
		System.out.print("\nEnter the number of shares:");
		no_of_shares=keyboard.nextInt();
		}
		stock_cost=no_of_shares*share_price;
		commission=(4.25/100)*stock_cost;
		total_price=stock_cost+commission;
		System.out.print("\nStock price:"+stock_cost);
		System.out.print("\nCommission to broker:"+commission);
		System.out.print("\nTotal cost:"+total_price);
	}

}
