// Jenna Pastorini
// Sept. 11 2015
// CSE 002
// Program to calculate time remaining until dinner
// given input from user of current time and dinner time in military time

import java.util.Scanner;
public class Timer {
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        System.out.print("Enter the current time in the form (HHMM): "); //prompt user to input current time in military time
        int currentTime=myScanner.nextInt(); //utilize user input for current time
        System.out.print("Enter the time that you will be eating dinner in the form (HHMM): "); //prompt user to input dinner time in military time
        int dinnerTime=myScanner.nextInt(); //utilize user input for dinner time
        int waitTime= dinnerTime-currentTime; //calculate time between current time and dinner
        int hours; 
        int minutes; //for storing the minute integers
        hours=(waitTime)/100; //to distinguish the hours from the minutes in the input
        minutes=waitTime%100; //to distinguish and display the minutes from the hours in final output
        System.out.println ("You have " +hours+ " hours and " +minutes+ " minutes until dinner"); //output calculation of wait time
        
    } // end of main method
    
    
} //end of class 