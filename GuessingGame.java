package main;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
	
	public static void Test ( int trueNumber , int guessNumber )
	{
		if (trueNumber > guessNumber)
			System.out.println("guess too low ");
		
		if (trueNumber < guessNumber)
			System.out.println("guess too high ");
	}
	
	

	public static void main(String[] args) 
	{
		
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int TrueNumber = random.nextInt(100);
        System.out.println(TrueNumber);
        
      while(true) 
      {
        System.out.println("guess a number");
        int number = scanner.nextInt();    
        	Test(TrueNumber , number);
        	if(number == TrueNumber)
        	{ System.out.println("guess true congrat !!!!!");  break;}
      }
	}
}
