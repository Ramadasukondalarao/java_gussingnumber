package projects;

import java.util.*;

public class GussingNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());
		int i, guess;
		int x = 5;
		System.out.println("Guess the number in between 1 to 100 in five chances");
		for(i = 0; i < x; i++) {
			System.out.println("Guess the number ");
			guess=s.nextInt();
			if(number == guess ) {
				System.out.println("Congratulations! You guessed the number");	
				}
			else if(number > guess && i != x - 1) {
				System.out.println("the number is greater than "+guess);
			}
			else if(number < guess && i != x - 1) {
				System.out.println("the number is less than "+guess);
			}
		}
		if(i == x) {
			System.out.println("your chances are over!");
			System.out.println("Better luck next time");
			System.out.println("The number was "+number);
		}
	}
}
