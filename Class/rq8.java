import java.util.Scanner; //import scanner utility 
public class rq8 { //declare public class 

public static int mult(int num1, int num2){
    int i;
    i=0;
    int sum=1;
    for (i=0;i<(num2-num1+1); i++) {
        sum=sum*(a+i);
        return sum;
    }
    System.out.println("The product of the integers between inputs is: " +sum);
}
 public static void main (String [] args) { //declare main method 
        Scanner myScanner= new Scanner (System.in);
        System.out.println("Please enter two positive integers: "); //request integers
        int num1=myScanner.nextInt(); //declare inputs
        int num2=myScanner.nextInt();
        mult(int num1, int num2);
 }//close main method    
 }//close public class    
