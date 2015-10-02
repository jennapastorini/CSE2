import java.util.Scanner;
public class FiveMult {
   public static void main (String [] argss) {
        Scanner myScanner = new Scanner (System.in);
        int value;
        int i=0;
        while (i<1) {
             System.out.println("Enter number: ");
        value =myScanner.nextInt();
         if (value%5==0) {
            i=1;
        }   
        else {
            i=0;
        }
        }
    }
}