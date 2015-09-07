//Jenna Pastorini
//Sept. 4, 2015
// CSE 002
// HW 02 - Arithmetic
// Calculating cost of purchases and total before and after sales tax

import java.text.DecimalFormat; //import utility class before public class (specified in Lecture 5)
public class Arithmetic {
    public static void main (String [] args) {
        int nSocks=3; //number of pairs of socks
        double sockCost=2.58; //cost per pair of socks
        int nGlasses=6; //number of drinking glasses
        double glassCost=2.29; //cost per glass
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost=3.25; //cost per box of envelopes
        double totalSockCost; //total cost of socks without tax
        double totalGlassCost; //total cost of glasses without tax
        double totalEnvelopeCost; //total cost of envelopes without tax
        totalSockCost= nSocks*sockCost;
        totalGlassCost= nGlasses*glassCost;
        totalEnvelopeCost= nEnvelopes*envelopeCost;
        double totalCostNoTax; //total cost of purchases before tax
        totalCostNoTax= totalSockCost+totalGlassCost+totalEnvelopeCost;
        
        //utilize variables to output calculations into statements
        System.out.println("Purchased " + nSocks+ " pairs of socks at " +sockCost+ " dollars per pair" 
        + " totaling " +totalSockCost+ " dollars before tax");
        System.out.println("Purchased " +nGlasses+ " glasses at " +glassCost+ " dollars per glass" +
        " totaling " +totalGlassCost+ " dollars before tax");
        System.out.println("Purchased " +nEnvelopes+ " box of envelopes at " + envelopeCost+ " dollars per box" +
        " totaling " +totalEnvelopeCost+ " dollars before tax");
        System.out.println("The total cost of the purchases before sales tax is " +totalCostNoTax);
       
        double taxPercent=0.06;
        double sockTax;//tax paid per pair of socks
        double glassTax;//tax paid per glass
        double envelopeTax; //tax paid per box of envelopes
        sockTax=(sockCost*taxPercent);
        glassTax=glassCost*taxPercent;
        envelopeTax=envelopeCost*taxPercent;
        double totalTax;//total amount of tax paid on top of purchases, excluding amount of purchases 
        totalTax=sockTax + glassTax + envelopeTax;
        double totalCost; //total amount paid for purchases including sales tax
        totalCost=totalCostNoTax+totalTax;
        DecimalFormat decFor = new DecimalFormat("0.00"); //template String to instruct output format using two decimal places 
        
        //format all system output values using decFor format
        System.out.println("With a 6% sales tax, there was " +(decFor.format(sockTax))+ " dollars charged per pair of socks purchased" +
        " totaling " +(decFor.format(sockTax*nSocks)) + " dollars in additional cost for the socks purchase."); 
        System.out.println("With a 6% sales tax, there was " +(decFor.format(glassTax))+ " dollars charged per pair of socks purchased" +
        " totaling " +(decFor.format(glassTax*nGlasses)) + " dollars in additional cost for the glasses purchase.");
        System.out.println("With a 6% sales tax, there was " +(decFor.format(envelopeTax))+ " dollars charged per pair of socks purchased" +
        " totaling " +(decFor.format(envelopeTax*nEnvelopes)) + " dollars in additional cost for the socks purchase.");
        System.out.println("The additional amount paid on top of the cost of the purchases came to " +(decFor.format(totalTax))+ " dollars in sales tax ");
        System.out.println("The total cost of the purchases including the sales tax amounts to " + (decFor.format(totalCost))+ " dollars");
        
    } //end of main method
} //end of class