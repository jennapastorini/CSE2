//Jenna Pastorini
// Sept. 25 2015
// CSE 002
// This program will compute multiplication, divison, addition or subtraction
// between two values input from the user and input operation.
// Program will also inform user if operator input is invalid 
// The program will ask the user to input n or N to the question "Type n or N to stop"

import java.util.Scanner; //import scanner utility 
public class CalculatorSpecial { //declare public class 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        int i=0; //declare integer to allow while loop to continue
        while (i<1) {//open while loop
        System.out.print("Enter desired operator: "); // prompt user for operator 
        String operator=myScanner.nextLine(); //declare operator to be used
        System.out.print("Enter first integer: "); //prompt user for first value
        int value1=myScanner.nextInt(); //declare first input value
        System.out.print("Enter second integer: "); //prompt user for second value
        int value2=myScanner.nextInt(); //declare second input value
        
        switch (operator) {
            case "*": // output following statement if * requested
                System.out.println("The product of " +value1+ " and " +value2+ " is " +(value1*value2) ); //output multiplication calculation using input values
                break; //prevent fallthrough 
            case "-": //output following statement if - requested 
                System.out.println("The product of " +value1+ " minus " +value2+ " is " +(value1-value2) ); //output subtraction calculation using input values
                break; //prevent fallthrough
            case "+": //output following statement if + requested
                System.out.println("The sum of " +value1+ " and " +value2+ " is " +(value1+value2)); //ouput addition calculation using input values
                break; //prevent fallthrough
            case "/": //output following statement if / requested
                System.out.println("The quotient of " +value1+ " divided " +value2+ " is " +(value1/value2)); //output division calcuation using put values
                break; //prevent fallthrough
            default: //output if +,-, *,/ are not input
                System.out.println("The operator you entered is invalid");
                break; //prevent fallthrough

        
        }// end switch statement
        System.out.println("Please enter N or n to end the program: ");
        String yay=myScanner.next();
        if (yay.equals("N") || yay.equals("n")){
            i=1;
        } //end of if statement 
        else {
            i=0; //end condition for while loop
        } // end of else statement 
    
        
        } //end of while loop
    } //end main method
 }//end of class