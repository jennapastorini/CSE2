import java.util.Scanner; //import scanner utility 
public class encrypted_x { //declare public class 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        System.out.println("Please input a value between 0 and 100: ");
        int size =myScanner.nextInt();
            if (size>0&&size<100) {
                
            }
            else {
                System.exit(-1);
            }    
            int i;
            int j;
            int n=0; //variable to incrament spaces
            for (i=0; i<size; i++) { //rows
                for (j=0; j<size; j++) {
                    if (n==j||(size-1-n)==j) { //placement of spaces
                    System.out.print(" ");
                    } //close if
                else{ //stars
                    System.out.print("*");
                    } //close else
                } //close j for
            n++;
            System.out.println(); //switch line
            } //close i for
          
    } //end main method 
} //end public class 
            