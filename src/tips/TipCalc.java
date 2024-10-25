package tips;
import java.util.Scanner;

public class TipCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		do 
		{
			System.out.print("Enter the cost of your meal: ");
			double mealCost = scanner.nextDouble();
			double[] percentages = {0.15,0.20,0.25};
			for(double percent : percentages)
			{
				double tip = mealCost * percent;
				double total = mealCost + tip;
				
				System.out.printf("%.0f%%\n" , percent * 100);
				System.out.printf("Tip: $%.2f\n" , tip);
				System.out.printf("Total: $%.2f\n" , total);
				//blank line for clarity
				System.out.println();
			}
			
			System.out.print("Would you like to go again? (y/n): ");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
			scanner.close();
			System.out.println("Thank you, goodbye! :)");
	}

}
