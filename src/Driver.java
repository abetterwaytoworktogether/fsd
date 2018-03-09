import java.util.Scanner;

public class Driver{

	public static void main(String[] args) {
	
	
	
	System.out.println("What is an even number?");

		Scanner scanner = new Scanner(System.in);
		String inpu = scanner.nextLine();
		int input = Integer.parseInt(inpu);
		

			if(input % 2 == 0) {
				System.out.println("Correct");
			}
			if(input % 2 == 1) {
				System.out.println ("Incorrect");
			}
			
			}
		}
	
