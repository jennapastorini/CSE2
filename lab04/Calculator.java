//Jenna Pastorini
// Sept. 18 @015
// CSE 002
// This program will compute multiplication, divison, addition or subtraction
// between two values input from the user and input operation.
// Program will also inform user if operator input is invalid 

import java.util.Scanner; //import scanner utility 
public class Calculator { //declare public class 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
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
        
    } //end main method
} //end of class