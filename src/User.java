import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		
		boolean quit = false;
		
		while (!quit) {
			System.out.println("1. Add an entry");
			System.out.println("2. Remove an entry");
			System.out.println("3. Search for a specific entry");
			System.out.println("4. Print Address Book");
			System.out.println("5. Delete Book");
			System.out.println("6. Quit");
			System.out.println("Please choose what you'd like to do with the database:");

			int options = userInput.nextInt();
			userInput.nextLine();

			switch (options) {
			case 1:
				// add the entry
				
				addressBook.addEntries();
				break;

			case 2:
				// remove the entry

				System.out.println("Enter an entry's email to remove:  ");
				String emailRemoval = userInput.nextLine();
				AddressBook.removeEntry(emailRemoval);
				break;

			case 3:
				// Search	
				AddressBook.searchEntry();
				break;
			case 4:
				// Print
				AddressBook.printAddressBook();
				break;

			case 5:
				// delete
				AddressBook.deleteAddressBook();
				break;

			case 6:
				// quit
				quit = true;
				System.out.println("Bye!");
				userInput.close();
				break;

			}

		}
	}
}
