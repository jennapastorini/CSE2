//Jenna Pastorini

// Sept. 13, 2015

// CSE 002

// Program to calculate values of three input values



import java.util.Scanner;

public class Testing {

    public static void main (String [] args) {

        Scanner myScanner= new Scanner (System.in); 

        System.out.print("Enter first value: "); //prompt user to input first value

        double valueFirst=myScanner.nextDouble(); //utilize input first value

        System.out.print("Enter second value: "); //prompt user to input second value

        double valueSecond=myScanner.nextDouble(); //utilize input second value

        System.out.print("Enter third value: "); //prompt user to input third value

        double valueThird=myScanner.nextDouble(); //utilize input third value

        double average; //declare average value 

        average=(valueFirst+valueSecond+valueThird)/3;

        System.out.println("The average of the three input values is " +average);
        
        int x = (int) (Math.pow(3,2) / 2);
        System.out.println(x);

    } //end of main method

} //end of class
