import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	// Instance variables:
	static ArrayList<Entry> addressBook = new ArrayList<Entry>();
	static Scanner userInput = new Scanner(System.in);
	// Methods:

	// New entries should contain all of the properties required by an entry.
	// The email address needs to be unique. Other properties do not need to be
	// unique.
	public void addEntries() {

		System.out.println("First Name: ");
		String firstName = userInput.nextLine();

		System.out.println("Last Name: ");
		String lastName = userInput.nextLine();

		System.out.println("Phone Number: ");
		String phoneNumber = userInput.nextLine();

		System.out.println("E-mail: ");
		String email = userInput.nextLine();

		if (searchEmail(email)) {
			System.out.println("Email exists");
		} else {
			addressBook.add(new Entry(firstName, lastName, phoneNumber, email));
			System.out.println("Added new entry!");
		}
	}

	public static boolean searchEmail(String email) {
		for (Entry emails : addressBook) {
			if (emails.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	// An entry can be removed by searching the database for an email address
	// and then removing the entry with that unique email address.
	public static void removeEntry(String email) {
		boolean emailExists = false;
		for (int i = 0; i < addressBook.size(); i++) {
			if (email.equals(addressBook.get(i).getEmail())) {
				Entry entry = addressBook.get(i);
				addressBook.remove(entry);
				
				System.out.println("Deleted the following entry: ");
				System.out.println("\n************");
				System.out.println(entry.toString());
				System.out.println("************");
						
				emailExists = true;
			} 
		} 
		if(!emailExists){
			System.out.println("That email does not exist!");
		}
	}

	// Users can pick which methods they will search by (first name, last name,
	// phone number, or email address). The program will then take in a search
	// query and search the address book for an entry that contains the search
	// as a substring (e.g. if a first name search is conducted with 'a,' all
	// entries that have a first name starting with 'a' will be returned).


	public static void searchEntry() {
		System.out.println("Choose a search type:");
		System.out.println("1. First Name\n" + "2. Last Name\n" + "3. Phone Number\n" + "4. Email\n");
		int options = userInput.nextInt();
		System.out.println("Enter your search");
		userInput.nextLine();
		String choice = userInput.nextLine();
		boolean search = false;
		while (!search) {
			for (Entry entry : addressBook) {
				switch (options) {
				case 1:
						if (entry.getFirstName().contains(choice)) {
							System.out.println("\n************");
							System.out.println(entry.toString());
							System.out.println("************");
							search = true;
							break;
						} 
						else {
							System.out.println("Contact does not exist!");
							break;
						}
				case 2:
					if (entry.getLastName().contains(choice)) {
						System.out.println("\n************");
						System.out.println(entry.toString());
						System.out.println("************");
						search = true;
						break;
					}
					else {
						System.out.println("Contact does not exist!");
						break;
					}
				case 3:
					if (entry.getPhoneNumber().contains(choice)) {
						System.out.println("\n************");
						System.out.println(entry.toString());
						System.out.println("************");
						search = true;
						break;
					}
					else {
						System.out.println("Contact does not exist!");
						break;
					}
				case 4:
					if (entry.getEmail().contains(choice)) {
						System.out.println("\n************");
						System.out.println(entry.toString());
						System.out.println("************");
						search = true;
						break;
					}
					else {
						System.out.println("Contact does not exist!");
						break;
					}
				case 5:
					search = true;
					break;
				}

			}
		}
	}

	//example 2 of how we could search for a specific entry:
	
//	public static void searchEntry() {
//		System.out.println("Please choose what you'd like to search by:");
//		System.out.println("1. First Name\n" + "2. Last Name\n" + "3. Phone Number\n" + "4. Email\n");
//		String choice = userInput.nextLine();
//		
//			for (Entry entry : addressBook) {	
//			if (entry.getFirstName().contains(choice)) {
//				System.out.println(entry.toString());
//			} else if (entry.getLastName().contains(choice)) {
//				System.out.println(entry.toString());
//			} else if (entry.getPhoneNumber().contains(choice)) {
//				System.out.println(entry.toString());
//			} else if (entry.getEmail().contains(choice)) {
//				System.out.println(entry.toString());
//			}
//				}
//			}
	// All of the entries will be printed out
	public static void printAddressBook() {
		if(addressBook.isEmpty()==true) {
			System.out.println("Address book is empty!");
		} else {
		addressBook.forEach(entry -> {
			System.out.println("\n************");
			System.out.println(entry);
			System.out.println("************");
		});
		}
	}

	// The address book will be cleared
	public static void deleteAddressBook() {
		addressBook.clear();
		System.out.println("Address book cleared!");
	}

}
