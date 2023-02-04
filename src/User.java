import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please choose what you'd like to do");
		System.out.println("1. Add an entry");
		System.out.println("2. Remove an entry");
		System.out.println("3. Search for a specific entry");
		System.out.println("4. Print Address Book");
		System.out.println("5. Delete Book");
		System.out.println("6. Quit");
		
		int options = userInput.nextInt();
		userInput.nextInt();

		switch (options) {
		case 1:
			// add the entry
			System.out.println("Add an entry");
			break;

		case 2:
			// remove the entry
			System.out.println("Remove an entry");
			break;

		case 3:
			// Search
			System.out.println("Search for a entry");
			break;
		case 4:
			// Print
			System.out.println("Print Address Book");
			break;

		case 5:
			// delete
			System.out.println("Delete it all!");
			break;

		case 6:
			// quit
			System.out.println("Exit");
			break;

		}

	}

}
