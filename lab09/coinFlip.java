// Jenna Pastorini
// October 23 2015
// CSE 002
// This program will request an integer from the user for how many flips of the coin
// the program will generate, printing heads or tails and the total number of each.
import java.util.Scanner; //import scanner utility 
public class coinFlip { //declare public class 
    public static int flip(){
        //int rand=(int)Math.random()*2;
        double rand=Math.random()*1;
        int heads=0;
        int tails=1;
        if (Math.round(rand)==0){
            //System.out.println("Flip is heads");
            return heads;
        }
        else{
            //System.out.println("Flip is tails");
            return tails;
        }
    }    
    public static void flip(int n){
        int i=0;
        int heads = 0;
        int tails = 0;
        while(i<n){
            int run=flip();
                if (run==0){
                    heads+=1;
                    System.out.println("Flip is heads");
                    i++;
                }
                else {
                    tails+=1;
                    System.out.println("Flip is tails");
                    i++;
                }
         System.out.println("Total number of heads is "+heads+ " and the total number of tails is "+tails);       
        }
    }    
    public static void main (String [] args) {
         Scanner myScanner= new Scanner (System.in);
         System.out.println("Please enter a number of coin flips: ");
         int s=myScanner.nextInt(); //declare s as number of clips
        flip(s);
    } //close main method
} //close public class     