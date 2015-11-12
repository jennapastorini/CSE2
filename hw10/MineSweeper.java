//Jenna Pastorini
// HW 10
// This program will create a board of user input size 
// containing user input quantity of mines, displaying on the board
// randomly placed mines and incremented values of neighboring cells 
// based on the number of mines adjacent to that cell.
import java.util.Scanner; //import scanner utility 
public class MineSweeper { //declare public class 
    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
         int i=0;
         System.out.println("Please enter the size of the board as an integer between 2 and 30: ");
          int N =myScanner.nextInt(); //declare size of board
        while (i<1) { //open while loop
           //System.out.println("Please enter the size of the board as an integer between 2 and 30: ");
            //int N =myScanner.nextInt(); //declare size of board
            if (N>=2&&N<=30) { //check that size is between 2 and 30
                 System.out.println("Please enter the number of mines, this must be between 1 and " +(N*N)+ " :" );
                i=1;
            }
            //int M =myScanner.nextInt();//declare number of mines
            else {
                i=0; //invalid input
            }
        }
         int M =myScanner.nextInt();//declare number of mines
         while (i<1) {
        if (M>=1&&M<=(N*N)) { //check appropriate number of mines
                i=1;
            }
            else {
                i=0; //re-request number of mines
            }
            }
        boolean[][] bombs = new boolean[N+2][N+2]; //game grid and border 
        for (int j = 0; j <= M; j++) {
        int a=(int)(Math.random()*N); //random placement of mines
        int b=(int)(Math.random()*N); //random placement of mines
        if (bombs[a][b]==true){
            j=j-1;
        }
        bombs[a][b]=true;
        }
        //number of bombs adjacent to cells 
        int [] [] index=new int[N+2][N+2];
        for (int j=1; j<=N; j++) {
            for (int k=1; k<=N; k++){
                //indexes neighboring cells 
                for (int jj=j-1; jj<=j+1;jj++) {
                    for(int kk=k-1; kk<=k+1; kk++){
                        if (bombs[jj][kk]) index[j][k]++;
                    }
                }
            }
        }
        
        System.out.println(); //print grid with mines
        for (int j=1; j<=N; j++) {
            for (int k = 1; k <= N; k++) {
                if(bombs[j][k]) System.out.print("M ");
                else System.out.print(index[j][k] + " ");
        }
        System.out.println();
        }
    
 
    }//close main method
}//close public class