import java.util.Arrays; 
public class quiz10 { //declare public class 
public static void main (String [] args) { //declare main method 
        int [] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; //declaration
        int i=0;
        for (i=0; i<array1.length; i++){ //allocate random number to each array value
            array1[i]= (int)(Math.random()*100);
        }
        int [] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; //declare array 2
        int j=0;
        for (j=0; j<array2.length; j++) { //allocate random number to each array value
            array2[j]=(int)(Math.random()*100);
        }
        for(int k = 0; k < array1.length; k++) {
            for(int m = 0; m < array2.length; m++) {
                if(array1[k] == array2[m]) {
                    System.out.println("Number: " +array1[m]);
        }
    }
    
}
}
}