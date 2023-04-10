public class RemoveWhiteSpace {

public static void main(String[] args) {

String inputString = "This is an example string with white space.";
char specialChar = '_';

// Remove white space from input string
String outputString = inputString.replaceAll("\\s", String.valueOf(specialChar));

// Print output string
System.out.println(outputString);
}
}