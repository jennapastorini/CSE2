//Jenna Pastorini
// CSE 002
// Sept. 28 2015
// This program will collect input grades above 0 and below 100 
// adding them together until grade 999 is entered in which the program
// will output the average of all the valid grades entered. User will be
// informed of invalid inputs.

import java.util.Scanner; //import scanner utility
public class AverageGrade { //declare public class
    public static void main (String [] argss) { //declare main method
    Scanner myScanner = new Scanner (System.in);
    int i=0; //initialize statement for while loop
    int total=0;
    int inputs=0;
    int average=0;
    int value;
    while (i<1) { //declare variable condition for loop
        System.out.print("Please enter grade: "); //prompts user to input grade
        value =myScanner.nextInt();//declare value of user input
        if (value<=100 && value>=0) {
            total+=value;
            inputs=inputs+1;
            i=0; //continue loop
        }
        else if (value==999) {
            average= total/inputs;
            System.out.println("Average of input grades is " +average);
            i=1; //end loop
        }
        else {
            System.out.println("Invalid grade entered");
            i=0; //continue loop
        }
    } //end while loop
} //end of main method
} //end of public class
    