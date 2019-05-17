package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for (int i = 9; i > 0; i--) {
				System.out.print(s.substring(i - 1, i));
			}
			System.out.println();
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			Random random = new Random();
			for (int i = 0; i < 7; i++) {
				if (random.nextInt(2) == 0) {
					s = s.toLowerCase();
					System.out.print(s.substring(i, i + 1));
				} else {
					s = s.toUpperCase();
					System.out.print(s.substring(i, i + 1));
				}
			}
			System.out.println();
		}, "mixture");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for (int i = 0; i < 11; i++) {
				if (i % 2 == 0) {
					System.out.print(s.substring(i/2, i/2 + 1));
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}, "glitch");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for (int i = 0; i < 9; i++) {
				if (s.substring(i, i + 1 ).equals("a") || s.substring(i, i + 1 ).equals("e") || s.substring(i, i + 1 ).equals("i") || s.substring(i, i + 1 ).equals("o") || s.substring(i, i + 1 ).equals("u")) {
					
				} else {
					System.out.print(s.substring(i, i + 1));
				}
			}
		}, "novowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
