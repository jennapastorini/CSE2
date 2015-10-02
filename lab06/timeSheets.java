//Jenna Pastorini
// October 2 2015
// CSE 002
// This program will ask the user to input how many timesheets, then input
// pay per hour in cents and five inputs corresponding to hours worked each day
// of the work week. 
// The program will then add the numbers worked by each employee and multiply that by
// the employee's rate to get the employee's pay for the week. 
// The program will also take the sum of the calculated values to output the total payroll.

import java.util.Scanner; //import scanner utility 
public class timeSheets { //declare public class 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        int i=0; //declare integer to allow while loop to continue
        double sum=0;
        int employees=0;
        while (i<1) {
            System.out.println("Please enter the number of employees: ");
            employees=myScanner.nextInt(); 
            if (employees<1){
                i=0;
            }
            else {
                i=1;
            }
            
        }
        i=0;
        while (i<employees) {//open while loop
        System.out.println("Please enter employees pay in cents: ");
            int pay=myScanner.nextInt();
        System.out.println("Please enter the hours worked each day for each employee: ");
            double monday=myScanner.nextInt();
            double tuesday=myScanner.nextInt();
            double wednesday=myScanner.nextInt();
            double thursday=myScanner.nextInt();
            double friday=myScanner.nextInt();
       double weekPay;
            weekPay=((pay*monday)+(pay*tuesday)+(pay*wednesday)+(pay*thursday)+(pay*friday))/100;
            sum+=weekPay;
        System.out.println("This employees weekly pay is " +weekPay+ " dollars");
        i++;
        }
        
    System.out.println("The total payroll of all employees is " +sum+ " dollars");
    }
}
        