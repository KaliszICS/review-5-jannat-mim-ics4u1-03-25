import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
			double number = scanner.nextDouble();
		System.out.println(Math.abs(number));
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Input another number: ");
		double num2 = scanner.nextDouble();

		double result = num1/num2;
		System.out.println((int)Math.floor(result));
		System.out.println((int)Math.ceil(result));

	}

	public static void q3() {
		//Write question 3 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
			double number = scanner.nextDouble();
		int sqroot = (int)Math.round(Math.sqrt(number));
		System.out.println(sqroot);


	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double base = scanner.nextDouble(); 

        System.out.print("Input another number: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent); 

        System.out.println(result);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Input another number: ");
		double num2 = scanner.nextDouble();

		System.out.println("Input one more number: ");
		double num3 = scanner.nextDouble();

		double max = Math.max(num1,Math.max(num2, num3));
		double min = Math.max(num1,Math.max(num2, num3));

		System.out.println(max);
		System.out.println(min);


	}
	public static void q6() {
		//Write question 6 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = scanner.nextLine();
		boolean containsOn = sentence.contains("on"); 
		System.out.println(containsOn); 

	}
	public static void q7() {
		//Write question 7 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input the word mango: ");
        String input = scanner.nextLine();

		boolean isMango = input.equalsIgnoreCase("mango");
		System.out.println(isMango); 

	}
	public static void q8() {
		//Write question 8 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        System.out.print("Input a letter: ");
        char letter = scanner.nextLine().charAt(0); 
        int firstIndex = word.indexOf(letter);
        int lastIndex = word.lastIndexOf(letter);

        System.out.println(firstIndex); 
        System.out.println(lastIndex);

	}

	public static void q9() {
		//Write question 9 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Your sentence is " + sentence.length() + " characters long");


	}
	public static void q10() {
		//Write question 10 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Input a word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("What word would you like to replace it with: ");
        String replacementWord = scanner.nextLine();

        String updatedSentence = sentence.replace(wordToReplace, replacementWord);
        System.out.println(updatedSentence);

	}

	public static void q11() {
		//Write question 11 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        sentence = sentence.trim(); 
        System.out.println(sentence.toUpperCase()); 
        System.out.println(sentence.toLowerCase());
	}

	public static void q12() {
		//Write question 12 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        if (word.length() >= 4) {
            System.out.println(word.substring(0, 4)); 
            System.out.println(word.substring(word.length() - 4)); 
            System.out.println("Word is too short!");

			scanner.close();
        }
	}
	

}
