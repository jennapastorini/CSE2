// Jenna Pastorini
// October 24 2015
// CSE 002
// Homework 08
// This program will request the user to input a shape, the depending on whether the user
// inputs circle, rectangle or trapezoid, the program will request the corresponding integers
// needed to compute and output the area of the shape. 
import java.util.Scanner; //import scanner utility 
public class areas { //declare public class 

public static void circle(int r) { //declare method to calculate area of cirlce using input radius
    double areac;
    areac=Math.PI*(r*r);
    System.out.println("Area of the cirlce is: " +areac); //print calculated output
}

public static void rectangle(int l, int w) { //declare method to calculate area of rectangle using inputs
    int areaR;
    areaR=l*w;
    System.out.println("Area of the rectangle is: " +areaR); //print calculated output
}

public static void trapezoid(int h, int b1, int b2) { //declare method to calculate area of trapezoid using inputs
    double areaT;
    areaT=((b1+b2)/2)*h;
    System.out.println("Area of the trapezoid is: " +areaT); //print calculated output
}

 public static void main (String [] args) { //declare main method 
        Scanner myScanner= new Scanner (System.in); //declare scanner utility
        int i=0;
        while (i<1) { //open while loop
        System.out.println("Please enter either circle, rectangle, trapezoid or exit to quit: "); //prompt user for shape type
        String shape=myScanner.nextLine(); //declare input shape
        if (shape.equals("circle")) { //identify shape input
            System.out.println("Please enter radius of circle: "); //request radius
            int r=myScanner.nextInt(); //identify radius
            circle(r); //call circle method
            i=1; //end loop
        }
        else if (shape.equals("rectangle")) { //identify shape input
            System.out.println("Please enter length and width of rectangle: "); //request dimensions
            int l=myScanner.nextInt(); //identify length
            int w=myScanner.nextInt(); //identify width
            rectangle(l,w);//call rectangle method
            i=1; //end loop
        }
        else if (shape.equals("trapezoid")){ //identify shape input
            System.out.println("Please enter the height, base 1 and base 2 of trapezoid: "); //request dimensions
            int h=myScanner.nextInt(); //identify height
            int b1=myScanner.nextInt(); //identify base 1
            int b2=myScanner.nextInt(); //identify base 2
            trapezoid(h,b1,b2);//call trapezoid method
            i=1; //end loop
        }
        else if (shape.equals("exit")){ //identify exit command
            i=1; //exit loop and program
        }
        else { //for invalid inputs
            i=0; //return to beginning of while loop
        }
        }//close while loop     
 }//close main method
} //close public class
