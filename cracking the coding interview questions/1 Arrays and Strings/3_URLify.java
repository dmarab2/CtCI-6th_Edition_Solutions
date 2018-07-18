import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuilder;

public class URLify {
	private StringBuilder urlify(String string){
		StringBuilder urlArray = new StringBuilder();
		boolean spaceAdded = false;
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == ' ') {
				if (spaceAdded == false) {
					spaceAdded = true;
					urlArray.append('%');
					urlArray.append('2');
					urlArray.append('0');
				}
				else {
					continue;
				}
			}
			else {
				spaceAdded = false;
				urlArray.append(string.charAt(i));
			}
		}
		return urlArray;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String urlString = new String();
		System.out.println("Please enter the string you wish to URLify: ");
		urlString = scan.nextLine();
		URLify urlObj = new URLify();
		System.out.println("Input: " + urlString);
		System.out.println("Output: " + urlObj.urlify(urlString).toString());

	}

}
