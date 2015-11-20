 import java.util.Scanner;
 public class exam2 {
 public static void main(String[] args){
      String[] beta = {"Men", "at", "some", "time", "are", "masters", "of", "their", "fates", "The", "fault", "dear Brutus", "is not in our stars", "but in ourselves", "that we are underlings"};
     System.out.println("enter a number");
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      String output = "";
  
      try{
          output = output + beta[0] + " ";
        output = output + beta[num] + " ";
        output = output + beta[2 * num] + " ";
      }
      catch(Exception e){
          output = output + "William Shakespeare.";
      }
     System.out.println(output);
   }
}