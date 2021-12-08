   /*
    * The Mr.Coxall Stack Program V2
    *
    * @author  Liam Fletcher
    * @version 1.0
    * @since   2021-12-08 
    */

   // Import the Scanner class
   import java.util.Scanner;

   public class Input {

       /**
        * This program recieves input and adds values 
        */

       public static void main(String[] args) {

           // create scanner object
           Scanner userInput = new Scanner(System.in);

           MrCoxallStack clasStack = new MrCoxallStack();

           try {
               for (int counter = 0; counter < 3; counter++) {
                   System.out.println("Enter an integer to push onto the stack ");
                   int numberChosen = userInput.nextInt();
                   System.out.println();

                   // Pushes user input
                   clasStack.push(numberChosen);
               }

               // pops top number in stack
               System.out.println("Popped Num: " + clasStack.pop());
               System.out.println("Values in Stack: " + clasStack.currentStack());

           } catch (Exception e) {
               System.out.println("Invalid Input");
           }
       }
