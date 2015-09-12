// Jenna Pastorini
// Sept. 11 2015
// CSE 002
// Program will use length,width and height values given by user 
// to calculate the volume and surface area of the corresponding block

import java.util.Scanner;
public class Block {
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in); 
        System.out.print("Enter the length of the block: "); //prompt user to input length of block
        double length=myScanner.nextDouble(); //utilize input length
        System.out.print("Enter the width of the block: "); //prompt user to input width of block
        double width=myScanner.nextDouble(); //utilize input width
        System.out.print("Enter the height of the block: "); //prompt user to input height of block
        double height=myScanner.nextDouble(); //utilize input height
        double volume=length*width*height; //calculate volume of block given input values
        System.out.println("The volume of the block with dimensions " +length+ " x " +width +" x " +height+ " is " +volume); //output calculated volume
        double areaHW=height*width; //calculate area of side using height and width
        double areaHL=height*length; //calculate area of side using height and length
        double areaLW=length*width; //calculate area of side using length and width
        double surfaceArea; //declare surface area 
        surfaceArea=(2*areaHW)+(2*areaHL)+(2*areaLW); //calculate surface area of block by 2 times the calculated value of each side
        System.out.println("The total surface area of the block is " +surfaceArea); //output calculated surface area
    } //end of main method
} //end of class 