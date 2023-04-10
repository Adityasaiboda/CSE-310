// java program to print number of palindrome word in given string
import java.util.Scanner;

public class PalindromeWordsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        System.out.println("Number of palindrome words: " + count);
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
}
