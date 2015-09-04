//Jenna Pastorini
//Sept. 4, 2015
// CSE 002
// This program will record the time elapsed in seconds and the number of rotations of the front wheel of the bicycle during that time. 
// Given time and rotation count the program will print the number of minutes for each trip, the number of counts for each trip, the distance of each trip in miles and the distance for the two trips combined.
//
public class Cyclometer {
    //main method required for every Java program
    public static void main (String [] args) {
        //our input data
        int secsTrip1=480; //number of seconds for trip one 
        double secsTrip2=3220; //number of seconds for trip two
        int countsTrip1=1561; //number of rotations of front wheel for trip one
        int countsTrip2=9037; //number of rotations of front wheel for trip two
        //our intermediate variables and output data
        double wheelDiameter=27.0; //the diameter of the front wheel stored using type double 
        double PI=3.14159; //the value of Pi to be used to calculate rotation of the front wheel
        int feetPerMile=5280; //the number of feet in a mile to be used to calculate distance in miles
        int inchesPerFoot=12; //the number of inches in a foot to be used to calculate distance
        double secondsPerMinute=60; //the number of seconds in a minute to be used to calculate the number of minutes for each trip
        double distanceTrip1, distanceTrip2; 
        double totalDistance; //declare variables to hold the distance of the first and second trip and total distance of both trips
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
        //run the calculations; store the values 
        //calculating the distance made by the bike in inches by multiplying the counts by the wheel diameter and PI  
        //then taking that calculation and converting the distance from inches to miles
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches 
        // (for each count, a rotation of the wheel travels the diameter in inches times Pi)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data 
        System.out.println("Trip 1 was " +distanceTrip1+" miles");
        System.out.println("Trip 2 was " +distanceTrip2+" miles");
        System.out.println("The total distance was " +totalDistance+" miles");
        
    }//end of main method
} //end of class 