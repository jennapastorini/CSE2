import java.util.Scanner;
public class Exam1 {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner (System.in);
        int value1;
        int value2;
        int value3;
        System.out.println("Input value 1: ");
        value1 =myScanner.nextInt();
        System.out.println("Input value 2: ");
        value2 =myScanner.nextInt();
        System.out.println("Input value 3: ");
        value3 =myScanner.nextInt();
        if (value1<value2 && value1<value3) {
            System.out.println("Value 1, "+value1+ " is the smallest value");
        }
        else if (value2 <value1 && value2<value3) {
            System.out.println("Value 2, " +value2+ " is the smallest value");
    }
        else if (value3<value1 && value3<value2) {
            System.out.println("Value 3, " +value3+ " is the smallest value");
        }
        
        
    }
}