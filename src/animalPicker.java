import java.util.Scanner;

public class animalPicker {

	public static void main(String[] args) {

		boolean valid = false;

		Scanner scanner = new Scanner(System.in);

		Scanner question = new Scanner(System.in);

		System.out.println("Would you like to see a dog or cat?");

		String answer = question.nextLine();

		if (answer.equalsIgnoreCase("cat")) {

			System.out.println("                __        .-.\n             .-\"` .`\'.    /\\\\|\n     _(\\-/)_\" ,  .   ,\\  /\\\\\\/\n    {(#b^d#)} .   ./,  |/\\\\\\/\n    `-.(Y).-`  ,  |  , |\\.-`\n         /~/,_/~~~\\,__.-`\n        ////~    // ~\\\\\njgs   ==`==`   ==`   ==`");

		} else if (answer.equalsIgnoreCase("dog")) {

			System.out.println("     |\\_/|                  \n     | @ @   Woof! \n     |   <>              _  \n     |  _/\\------____ ((| |))\n     |               `--\' |   \n ____|_       ___|   |___.\' \n/_/_____/____/_______|");
		} else {

			System.out.println("That is not an option");

			while (valid = true) {

				System.out.println("Would you like to see a dog or cat?");

				String answer2 = question.nextLine();

				if (answer2.equalsIgnoreCase("cat")) {

					System.out.println("                __        .-.\n             .-\"` .`\'.    /\\\\|\n     _(\\-/)_\" ,  .   ,\\  /\\\\\\/\n    {(#b^d#)} .   ./,  |/\\\\\\/\n    `-.(Y).-`  ,  |  , |\\.-`\n         /~/,_/~~~\\,__.-`\n        ////~    // ~\\\\\njgs   ==`==`   ==`   ==`");
					
					break;
					
				} else if (answer2.equalsIgnoreCase("dog")) {

					System.out.println("     |\\_/|                  \n     | @ @   Woof! \n     |   <>              _  \n     |  _/\\------____ ((| |))\n     |               `--\' |   \n ____|_       ___|   |___.\' \n/_/_____/____/_______|");
					
					break;

				} else {

					System.out.println("That is not an option");

					valid = true;
				}
				

			}
		}

	}
}
