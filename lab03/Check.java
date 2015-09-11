//Jenna Pastorini
// Sept. 11, 2015
// CSE 002
// This program will allow the user to input the original cost of the check, the percentage tip
// they wish to pay, the number of ways the check is being split and will then output
// how much each person in the group must pay for the check

import java.util.Scanner;
public class Check{
    //main method 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        System.out.print("Enter the original cost of the check in the form xx.xx:");
        double checkCost= myScanner.nextDouble(); //utilize user input for check cost
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):"); //prompt user to input check cost
        double tipPercent= myScanner.nextDouble(); //utilize user input for tip percent
        tipPercent /=100; //to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner:"); //prompt user to input wanted tip percent
        int numPeople = myScanner.nextInt(); //utilize user input for number of people
        double totalCost; //declare total cost of the check
        double costPerPerson; //declare cost per person
        int dollars; //wohle dollar amount of cost
        int dimes; //for storing digits to the right of the decimal point for the cost
        int pennies;
        totalCost = checkCost * (1+ tipPercent); //calculate total cost with added tip  
        costPerPerson = totalCost / numPeople; //obtaining the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g.,
        // (int) (6.73*10) % 10 -> 67 % 10 -> 7
        // where the % (mod) operator returns the remainder
        // after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(costPerPerson*10)%10;
        pennies=(int)(costPerPerson*100)%10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); //output amount owed per person
        
        
    } // end of main method
} // end of class 