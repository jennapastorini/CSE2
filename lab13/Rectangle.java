//Jenna Pastorini
// Lab 13
import java.util.Scanner; //import scanner utility 
public class Rectangle { //declare public class 
static double width;
static double height;
static double area;

public void setWidth (double x) {
    width=x;
}

public void setHeight (double y) {
    height=y;
}

public void getArea () {
    area= width*height;
}

    public static void main (String [] args) {
        Scanner myScanner= new Scanner (System.in);
        Rectangle r1 = new Rectangle ();
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        r1.getArea();
        System.out.println(area);
    }//close main method
} //close public class