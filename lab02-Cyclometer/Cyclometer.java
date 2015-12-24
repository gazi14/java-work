/////////////////////////////////////////////////////////////////////////////
//Gazi Asif
//12/18/15
//Cyclometer Java Program
//

public class Cyclometer{
    public static void main(String[] args) {
        int secsTrip1=480;                        //Time in seconds of Trip1
        int secsTrip2=3220;                       //Time in seconds of Trip2
        int countsTrip1=1561;                     //Counts for Trip1    
        int countsTrip2=9037;                     //Counts for Trip2
        double wheelDiameter=27.0;                //Diameter of the wheel
        double PI=3.14159;                               //Pi
        int feetPerMile=5280;                         //No. of feet in a mile
        int inchesPerFoot=12;                         //No. of inches in a foot
        int secondsPerMinute=60;                      //No. of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; 
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts."); 
       
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+ 
        countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;    //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot*feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

    
    }
}
