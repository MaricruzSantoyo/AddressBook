import java.util.ArrayList;

public class AddressBook {
	// Instance variables:
	static ArrayList<Entry> addressBook = new ArrayList<Entry>();

	// Methods:

	// New entries should contain all of the properties required by an entry.
	// The email address needs to be unique. Other properties do not need to be
	// unique.
	public static void addEntries(Entry entry) {
		
		//note: this currently needs to be fixed as it always
		//adds entry regardless of email existing!
		
		if(addressBook.contains(entry)) {
			System.out.println("This email already exists!");
		}else{
			addressBook.add(entry);
			System.out.println("Successfully added!");
		}
	}

	// An entry can be removed by searching the database for an email address
	// and then removing the entry with that unique email address.
	public static void removeEntry(String email) {
		for (int i = 0; i < addressBook.size(); i++) {
			if (addressBook.get(i).getEmail().equals(email)) {
				Entry entry = addressBook.get(i);
				addressBook.remove(entry);
				System.out.println("You have successfully removed the contact!");
			} else {
				System.out.println("That email does not exist!");
			}
		}
	}

	// Users can pick which methods they will search by (first name, last name,
	// phone number, or email address). The program will then take in a search
	// query and search the address book for an entry that contains the search
	// as a substring (e.g. if a first name search is conducted with 'a,' all
	// entries that have a first name starting with 'a' will be returned).
	public static void searchEntry() {

	}

	// All of the entries will be printed out
	public static void printAddressBook() {
		addressBook.forEach(entry -> {
			System.out.println(entry);
		});
	}

	// The address book will be cleared
	public static void deleteAddressBook() {
		addressBook.clear();
	}

}
