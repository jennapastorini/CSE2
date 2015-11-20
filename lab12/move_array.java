//Jenna Pastorini
// Lab 12
// This program will move a value at a specific index to the 
// end of the array.
import java.util.Scanner; //import scanner utility 
public class move_array { //declare public class 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        System.out.println("Please input the size of the array: ");
        int size=myScanner.nextInt();
         try {
            int c = 2;
            int check =c/size;
        } //close try
        catch (ArithmeticException zero) {
            System.out.println("Not a valid input");
        } // close catch
        int [] array; //declaration
        array = new int [size];
        int i=0;
        for (i=0; i<size; i++){ //allocate random number to each array value
            array[i]= (int)(Math.random()*100);
            System.out.println("Number: " +array[i]);
        }
        System.out.println("Please input value of index to be moved: ");
        int x=myScanner.nextInt(); //value to be moved to end 
        try {
            int v=3;
            int check2=v/x;
        }
        catch (ArithmeticException zero) {
            System.out.println("Zero is not a valid input");
        }  
        try { //idk how to catch that it is not greater than size-1
            for (int j=0; j< x; j++){
                array[j]=array[j];
            }
        }
        catch (Exception outofbounds) {
            System.out.println("Value is greater than size of array");
        }
        
        int temp =array[x];
        for (int k=x; k<(array.length-1); k++){
            array[k]=array[k+1];
        }
        array[size-1]=temp;
        
        
        for (int j=0; j<size; j++){
                System.out.println(array[j]);
            }
        
        
    }//close main method
}//close public class
    