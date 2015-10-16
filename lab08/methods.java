// Jenna Pastorini
// October 16 2015
// CSE 002
// This program will request ten integers from the user and then calculate the mean
// and the median as well as output the results using multiple methods.
import java.util.Scanner; //import scanner utility 
public class methods { //declare public class 
    public static double mean(int sum) { //declare method to calculate the mean
        double mean;
        mean=sum/10;
        return mean;
    } //end mean method
    public static double median(double e, double f) { //declare method to calculate the median
        double median;
        median=(e+f)/2;
        return median;
    }
    public static void print(double mean, double median){ //declare method to output calculated values
        System.out.println("The mean of the input is " +mean);
        System.out.println("The median of the input is " +median);
    }
    public static void main (String [] args) { //declare main method 
        Scanner myScanner= new Scanner (System.in);
        System.out.println("Please enter ten integers: "); //request integers
        int a=myScanner.nextInt(); //declare inputs
        int b=myScanner.nextInt();
        int c=myScanner.nextInt();
        int d=myScanner.nextInt();
        int e=myScanner.nextInt();
        int f=myScanner.nextInt();
        int g=myScanner.nextInt();
        int h=myScanner.nextInt();
        int i=myScanner.nextInt();
        int j=myScanner.nextInt();
        int sum;
        sum=a+b+c+d+e+f+g+h+i+j; 
        double mean=mean(sum); //call mean method
        double median=median(e,f); //call median method
        print(mean,median); //call print method
    } //end main method
} //end public class