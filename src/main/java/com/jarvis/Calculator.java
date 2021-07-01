package com.jarvis;

public class Calculator {

	public static void main(String[] args) {

		 MathUtils operations = new MathUtils();
		GetInput getInput = new GetInput();

		boolean running = false;

		boolean firstloop = true;
		boolean cal = true;
		double finalval = 0;
		running = true;
		String sign;
		double num;

		while (running == true) {
			if (firstloop == true) {
				String askfor_newcal = getInput.askfor_newcal();
				if (askfor_newcal.equals("n")) {

					break;
				}
				cal = true;
				finalval = 0;
			}

			while (cal == true) {

				if (firstloop == false) {
					System.out.println("Value: " + finalval);
				}

				String user_input = getInput.getinput(firstloop);
				if (user_input.equals("q")) {
					cal = false;
					firstloop = true;
					break;
				} else {

					if (firstloop == true) {
						sign = "";
						num = Double.parseDouble((user_input.substring(0)));

					} else {
						sign = user_input.substring(0, 1);
						num = Double.parseDouble((user_input.substring(1)));

					}

					switch (sign) {

					case "+":

						finalval += num;

						break;
					case "*":

						finalval *= num;

						break;

					case "-":
						finalval -= num;

						break;

					case "/":
						finalval /= num;

						break;

					default:
						finalval = num;
						break;

					}
					firstloop = false;

				}
			}
		}

	}
}


