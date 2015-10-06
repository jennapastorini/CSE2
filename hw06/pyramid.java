//Jenna Pastorini
// October 6, 2015
// CSE 002
// Homework 6
// This program will ask user to input what size pyramid they want
// and then print the corresponding pyramid.

import java.util.Scanner; //import scanner utility 
public class pyramid { //declare public class 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        System.out.print("Enter the number of lines = ");
        int lines=myScanner.nextInt();
        int stars;
        stars=(2*lines)-1;
            for (int i = 1; i <=stars; i=i+2) {
                for (int j = stars-i; j >1; j=j-2) {
                    System.out.print(" ");
                } //end of j for loop 
                for (int k = 1; k <=i; k++) {
                    System.out.print("*"); 
                } //end of k for loop
                System.out.println(""); 
            } //end of initial for loop
        }//end of main method
} //end of public class