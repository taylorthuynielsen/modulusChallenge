import java.util.Scanner;

public class modulusChallenge
	{

		public static void main(String[] args)
		{
				fizzBuzz();
				leapYear();
		}
		
		public static void fizzBuzz()
		{
			for (int i=1; i<=100; i++)
				if ((i%3==0)&&(i%5==0))
					{
						System.out.println("FizzBuzz");
					}
				else if (i%5==0)
					{
						System.out.println("Buzz");
					}
				else if ((i%3==0))
					{
						System.out.println("Fizz");
					}
				else
					{
						System.out.println(i);
					}
		}
		
		public static void leapYear()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Choose a year to find out if it is a leap year or not.");
			int chosenYear=userInput.nextInt();
			if((chosenYear%4==0)&&(chosenYear%100==0)&&(chosenYear%400!=0))
				System.out.println("The year "+ chosenYear + " is not a leap year.");
			else if((chosenYear%4==0)&&(chosenYear%100==0)&&(chosenYear%400==0))
				System.out.println("The year "+chosenYear+" is a leap year.");
			else if((chosenYear%4==0)&&(chosenYear%100!=0)&&(chosenYear%400!=0))
				System.out.println("The year "+chosenYear+" is a leap year.");
			else
				System.out.println("The year "+chosenYear+" is not a leap year.");
		}
	}