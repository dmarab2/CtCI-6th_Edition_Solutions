import java.util.HashMap;
import java.util.Scanner;
public class Palin_Perm {
	boolean palinPermCheck(String pCheck) {
		boolean oneChar = false;
		HashMap<Character, Short> palinHash = new HashMap<Character,Short>();
		for(char ch: pCheck.toCharArray()) {
			if(ch == ' ') {
				continue;
			}
			if(!(Character.isLetter(ch))){
				return false;
			}
			char c = Character.toLowerCase(ch);
			if(palinHash.containsKey(c)) {
				palinHash.put(c, (short) (palinHash.get(c) + 1));
			}
			else {
				palinHash.put(c, (short) 1);
			}
		}
		for(short s: palinHash.values()) {
			if(s == 1) {
				if(oneChar == false) {
					oneChar = true;
				}
				else {
					return false;
				}
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Palin_Perm palindromeChecker = new Palin_Perm();
		String string = new String();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string you would like to check: ");
		string = scan.nextLine();
		if(palindromeChecker.palinPermCheck(string) == true) {
			System.out.println("This string is a palindrome.");
		}
		else {
			System.out.println("This string is not a palindrome.");
		}

	}

}
