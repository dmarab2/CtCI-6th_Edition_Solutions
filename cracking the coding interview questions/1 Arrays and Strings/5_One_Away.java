import java.util.Scanner;
import java.util.LinkedList;

public class One_Away {
	boolean oneAway(char[] string1, char[] string2, boolean diffLength) {
		boolean oneDiff = false;
		if(diffLength == true) {
			char diffChar = '\u0000';
			for(int i =0; i < string1.length;i++) {
				if(string1[i] != string2[i]) {
					diffChar = string2[i];
					break;
				}
			}
			if(diffChar == '\u0000') diffChar = string2[string2.length - 1];
			LinkedList<Character> queue1 = new LinkedList<Character>();
			LinkedList<Character> queue2 = new LinkedList<Character>();
			for(char c: string1) {
				queue1.add(c);
			}
			for(char c: string2) {
				if(c == diffChar) continue;
				queue2.add(c);
			}
			while(queue1.size() > 0) {
				if(queue1.poll() != queue2.poll()) return false;
			}
			return true;
		}
		else {
			for(int i = 0; i < string1.length; i++) {
				if(string1[i] != string2[i]) {
					if(oneDiff) return false;
					else oneDiff = true;
				}
			}
			return true;
		}
	}
	boolean lengthMoreThanOne(String string1, String string2) {
		if((string2.length() - string1.length()) > 1) return true;
		else return false;
	}
	public static void main(String[] args) {
		boolean isOneAway;
		boolean moreThanOne = false;
		One_Away oneAwayChecker = new One_Away();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first string: ");
		String fString = scan.nextLine();
		System.out.println("Please enter the next string: ");
		String sString = scan.nextLine();
		if(fString.length() > sString.length()) moreThanOne = oneAwayChecker.lengthMoreThanOne(sString, fString);
		else oneAwayChecker.lengthMoreThanOne(fString, sString);
		if(moreThanOne) {
			System.out.println("These strings have more than one difference.");
			return;
		}
		if(fString.length() > sString.length()) isOneAway = oneAwayChecker.oneAway(sString.toCharArray(), fString.toCharArray(), true);
		else if(sString.length() > fString.length()) isOneAway = oneAwayChecker.oneAway(fString.toCharArray(), sString.toCharArray(), true);
		else isOneAway = oneAwayChecker.oneAway(fString.toCharArray(), sString.toCharArray(), false);
		if(isOneAway) System.out.println("These strings have just one difference.");
		else System.out.println("These strings have more than one difference.");
	}

}
