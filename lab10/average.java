// Jenna Pastorini
// October 24 2015
// CSE 002
// Lab 10
// This program will request the user to for values that will be stored in array
// of size (n), using a for loop to initialize the array with n random numbers to
// generate a random number between 0 and 100. Another for loop will print all of the values,
//one will find the sum of the values, print it and then print the average.
// A final for loop will print the values greater than or equal to the average.
import java.util.Scanner; //import scanner utility
public class average { //declare public class 
public static void main (String [] args) { //declare main method 
        Scanner myScanner= new Scanner (System.in); //declare scanner utility
        System.out.println("Please input the number of values to be stored: ");
        int n=myScanner.nextInt(); //declare n as number of clips
        int [] array; //declaration
        array = new int [n];
        int i=0;
        for (i=0; i<n; i++){ //allocate random number to each array value
            array[i]= (int)(Math.random()*100);
            System.out.println("Number: " +array[i]);
        }
        double result=0.0;
        int k=0;
        for (k=0; k<array.length; k++) { //calculate sum of random numbers
            result=result+array[k];
        }
        double average;
        average=(result)/array.length; //calculate average of array numbers
        System.out.println("The sum is " +result);
        System.out.println("The average is " +average);
        int j=0;
        for (j=0; j<n; j++) {
            if (array[j] >= average ){ //check which values are greater than average
                System.out.println("Value of array greater than or equal to the average is " +array[j]); //print values greater than or equal to average
            }
            else {
                j=1;
            }
        }
} //close main method    
}//close public class