//Jenna Pastorini
// CSE 002
// Lab 11
// This program will take an array of 20 integers, initialize them to random numbers
// and do the same for an array of 10 integers. Then using a sorting method
// the program will print their sorted values to then make a third array
// of a summation of the values from arrays 1 and 2, in sorted order.
import java.util.Arrays; 
public class sorting { //declare public class 
public static void sort(int [] array) { //declare method to sort arrays
       //int [] sorted= int [] array;
       Arrays.sort(array);
        System.out.println("The sorted array is:");
        for (int number : array) {
        System.out.println("Number = " + number);
        }
    }//close sort method
    
public static void main (String [] args) { //declare main method 
        int [] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; //declaration
        int i=0;
        for (i=0; i<array1.length; i++){ //allocate random number to each array value
            array1[i]= (int)(Math.random()*100);
        }
        sort(array1); //sort array1
        int [] array2 = {1,2,3,4,5,6,7,8,9,10}; //declare array 2
        int j=0;
        for (j=0; j<array2.length; j++) { //allocate random number to each array value
            array2[j]=(int)(Math.random()*100);
        }
        sort(array2); //sort array2
        int [] array3 = new int [30];
            System.arraycopy(array1,0,array3,0,array1.length);
            System.arraycopy(array2,0,array3,array1.length, array2.length);
        sort(array3);
        
}// close main method
} //close public class
        