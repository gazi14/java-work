///////////////////////////////////////////////////////////////////////////////////////////////////
//Gazi Asif
//12/19/15
//BigMac Java Program
//

import java.util.Scanner;                             //Add the scanner class
public class BigMac {                             
    public class void main(String[] args) {           //Add the class and main method
        Scanner myScanner;                            //Declare the scanner variable
        myScanner = new Scanner( System.in );         //Call the scanner constructor
        
        System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
//Prompt the user for the number of tickets 
        int nBigMacs = myScanner.nextInt();           //This accepts user input
        
        System.out.print(
            "Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
        
//Prompt the user for the cost of a Big Mac
        double bigMac$ = myScanner.nextDouble();      //This accepts user input
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
//Prompt the user for the percent sales tax
        double taxRate = myScanner.nextDouble();      //This accepts user input
        taxRate/=100;                                 
//User enters percent but I want proportion

        double cost$;
        int dollars,                                  //Whole dollar amount of cost
              dimes, pennies;                         //For storing digits
//to the right of the decimal point for the cost$
        
        
        
        
    }
}
