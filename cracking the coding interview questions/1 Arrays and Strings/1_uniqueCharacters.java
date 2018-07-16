import java.util.HashMap;
import java.util.Scanner;
public class uniqueCharacters {

	public static void main(String[] args) {
		String string;
		boolean uniqueString = true;
		char character;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string you would like to check: ");
		string = scan.nextLine();
		HashMap<Character, Boolean> hashTable = new HashMap<Character, Boolean>();
		for(int i = 0; i < string.length(); i++) {
			character = string.charAt(i);
			if(hashTable.containsKey(character)) {
				uniqueString = false;
				break;
			}
			else {
				hashTable.put(character, true);
			}
		}
		if(uniqueString == false) {
			System.out.println("This string does not have all unique characters");			
		}
		else {
			System.out.println("This string does have all unique characters.");
		}

	}

}
