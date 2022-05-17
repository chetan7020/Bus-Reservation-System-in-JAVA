import java.util.*;

public class Luck_Game
 {
	public static void Guess_Number()
	{
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100* Math.random());
		int K,i, guess;
		K=5;
		
		System.out.println("=======================================================");
		System.out.println("||There are number chosen between 1 to 100.          ||");
		System.out.println("||Guess the number within 5 trials and try your luck.||");
		System.out.println("=======================================================");

		for (i = 0; i < K; i++) 
		{

			System.out.print("Guess the number:");
			guess = sc.nextInt();

			if (number == guess)
			{
				System.out.println("============================================");
				System.out.println("||Congratulations! You guessed the number.||");
				System.out.println("============================================\n");
				System.out.println("******************You have returned to main menu******************\n");
				break;
			}
			else if (number > guess && i != K - 1) 
			{
				System.out.println("The number is greater than " + guess);
			}
			else if (number < guess&& i != K - 1) 
			{
				System.out.println("The number is less than " + guess);
			}
		}

		if (i == K) 
		{
			System.out.println("========================================");
			System.out.println("||You have exhausted 5 trials.        ||");
			System.out.println("||The number was " + number+"                   ||");
			System.out.println("||Better Luck Next Time!!!            ||");
			System.out.println("========================================\n");
			System.out.println("******************You have returned to Main Menu******************\n");
		}
	}
}
