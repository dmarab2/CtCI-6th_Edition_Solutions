import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Check_Permutation {

	
	public boolean isPermutation(String stringA, String stringB) {
		if(stringA.length() != stringB.length()) {
			return false;
		}
		char[] arrayA = stringA.toCharArray();
		char[] arrayB = stringB.toCharArray();
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		for(int i = 0; i < arrayA.length; i++) {
			if(arrayA[i] != arrayB[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Check_Permutation checkP = new Check_Permutation();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first string: ");
		String fString = scan.nextLine();
		System.out.println("Please enter the next string: ");
		String sString = scan.nextLine();
		boolean perTrue = checkP.isPermutation(fString,sString);
		if(perTrue) {
			System.out.println("These strings are permutations.");
		}
		else {
			System.out.println("These strings are not permutations.");
		}
		

	}

}
