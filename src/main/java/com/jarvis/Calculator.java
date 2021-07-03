package com.jarvis;

public class Calculator {

	public static void main(String[] args) {

		MathUtils op = new MathUtils();
		GetInput getInput = new GetInput();

		boolean running = false;
		boolean firstloop = true;
		boolean cal = true;
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
			}

			while (cal == true) {

				if (firstloop == false) {
					System.out.println("Value: " + op.finalval);
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
							op.add(num);
							break;
							
						case "*":
							op.mul(num);
							break;
				
						case "-":
							op.sub(num);
							break;
	
						case "/":
							try {
								op.div(num);
							} catch (Exception e) {
								System.out.println("Do not perform 0/0!!");
							}
							break;
	
						default:
							op.def_val(num);
							break;

					}
					firstloop = false;

				}
			}
		}

	}
}
