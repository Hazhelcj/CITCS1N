package hazhel_tr;
import java.util.Scanner;
public class Stringss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		
		System.out.print("Type any word: ");
		word = scan.next();
		//length of the word
		int length = word.length();
		//will show the first letter
		char ch = word.charAt(0);
		//turn the word to lower case
		String lower =  word.toLowerCase();
		//to upper case
		String upper = word.toUpperCase();
		// repeats the word
		String repeat = word.repeat(5);
		//replace the letter chosen
		String replace = word.replace('e', 'o');
		//replace the word
		String word2 = "Hiiiii";
		String all = word.replaceAll(word, word2 );
		//connects to the other string
		String connect = word.concat(" Hii");
		//if the word matches to the word inside the parenthesis
		boolean matches = word.matches("Cat");
		//
		String number = word.substring(1,4);
		
		System.out.println("The length of the word is:" + length);
		System.out.println("The first letter of your word" + ch);
		System.out.println("Lower case:" + lower);
		System.out.println("Upper case:" + upper);
		System.out.println("Repitition:" + repeat );
		System.out.println("The length of the word is:" + replace);
		System.out.println("Replaced word:" + all);
		System.out.println(connect);
		System.out.println("" + matches);
		System.out.println("Split " + number);







		



		
		
		

	}

}
