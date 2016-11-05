/**
* A program that reads an integer that is typed in by the
* user and computes and prints the square of that integer.
*/
public class PrintSquare2 {
public static void main(String[] args) {
int userInput;
int square;
// The number input by the user.
// The userInput, multiplied by itself.
System.out.print("Please type a number: ");
userInput = TextIO.getlnInt();
square = userInput * userInput;
System.out.print("The square of that number is ");
System.out.println(square);
} // end of main()
} //end of class PrintSquare
