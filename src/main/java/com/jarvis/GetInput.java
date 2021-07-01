package com.jarvis;
import java.util.Scanner;
import java.util.regex.*;  

public class GetInput {

	public String getinput(boolean firstloop) {
		@SuppressWarnings("resource")
		Scanner Operation = new Scanner (System.in);
		while(true) {
			if(firstloop) {
				System.out.println("Enter any number or math operator sign followed by the number or 'q' for quit: ");
				String r=Operation.next();
				if(Pattern.matches("(^[0-9]+|^[+*-/]([0-9]+[.][0-9]+)|^[+*-/]([0-9]+))|[q]", r)) {
					return r;


				}else {
					System.out.println("Please enter valid values! or 'q' for quit!");
					continue;
				}
			}else {
				System.out.println("Enter any math operation sign followed by the number or 'q' for quit: ");
				String r=Operation.next();
				if(Pattern.matches("(^[+*-/]([0-9]+[.][0-9]+)|^[+*-/]([0-9]+))|[q]", r)) {
					return r;

				}else {
					System.out.println("Incorrect input!Please enter math operation sign followed by the number or 'q' for quit!");
					continue;
				}
			}

		}

	}

	public String askfor_newcal() {
		@SuppressWarnings("resource")
		Scanner Operation = new Scanner (System.in);
		while(true) {
			System.out.println("Start Calculator ? (y/n) : ");
			String r = Operation.next();
			if(Pattern.matches("[y]|[n]", r)) {
				return r;

			}else {
				System.out.println("Incorrect input!Please enter 'y' for yes or 'n' for no!");
				continue;
			}
		}

	}



}
