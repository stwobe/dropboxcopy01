import java.util.Scanner;
public class GettingStringInput
{
   public static void main(String[]args)
   {
       String yourinput = new String();
       Scanner scan1 = new Scanner(System.in);
       System.out.print("Please enter a string: ");
       yourinput = scan1.nextLine();
   }
