//Ryan Jukes
//11-13-24
//HW12 Part A

/* 

public class Conversation
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int input = in.nextInt();
      input++;
      System.out.println("Next year, you will be " + input);
   }
}

*/

// The error in this program is that "input" is declared twice, once as an int and once as a string. This is an 
// issue because the different variables cannot have the same name in the same scope. The fix is to simply rename one
// or both variables so they have different names and can exist together in the same scope.
