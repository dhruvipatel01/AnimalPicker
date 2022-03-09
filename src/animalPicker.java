import java.util.Scanner;

public class animalPicker {

	public static void main(String[] args) {

		boolean valid = false;

		Scanner scanner = new Scanner(System.in);

		Scanner question = new Scanner(System.in);

		System.out.println("Would you like to see a dog or cat?");

		String answer = question.nextLine();

		if (answer.equalsIgnoreCase("cat")) {

			System.out.println("CAT ASCII ART HERE");

		} else if (answer.equalsIgnoreCase("dog")) {

			System.out.println("DOG ASCII ART HERE");

		} else {

			System.out.println("That is not an option");

			while (valid = true) {

				System.out.println("Would you like to see a dog or cat?");

				String answer2 = question.nextLine();

				if (answer2.equalsIgnoreCase("cat")) {

					System.out.println("CAT ASCII ART HERE");
					
					break;
					
				} else if (answer2.equalsIgnoreCase("dog")) {

					System.out.println("DOG ASCII ART HERE");
					
					break;

				} else {

					System.out.println("That is not an option");

					valid = true;
				}
				

			}
		}

	}
}
