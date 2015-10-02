import java.util.Scanner; //import scanner utility
public class AddInterest { //declare public class
    public static void main (String [] argss) { //declare main method
    Scanner myScanner = new Scanner (System.in);
    int years;
    double startingBalance;
    double rate;
    double endingBalance;
    double interest;
    System.out.println("Please enter your starting balance: ");
    startingBalance =myScanner.nextDouble();
    System.out.println("Please enter your interest rate in the form (XX%)");
    rate=myScanner.nextDouble();
    rate=rate/100+1;
    System.out.println("Please enter the number of years: ");
    years=myScanner.nextInt();
  
    endingBalance=startingBalance*Math.pow(rate,years);
    System.out.println("Your final balance is: " +endingBalance+"");
    }
}
    
    