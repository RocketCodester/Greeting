// Program:              Greeting
// Date:                 October 2014
// Description:          Chapter 6 Creates a Gregorian Calendar object and reads hour of day
////////////////////////////////////////////////////////////////////////////////

import java.util.GregorianCalendar;

public class Greeting
{
    public static void main(String[] args) 
    {
        // instantiate Gregorian Calendar object
        GregorianCalendar calendar = new GregorianCalendar();
       
        // get hour of day
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        
        // build time of day string
        String timeOfDay = determineTimeOfDay(hour);
        
        // show greeting on console
        System.out.println("Good " + timeOfDay);
        
    } // end main
    
    // method definition
    public static String determineTimeOfDay(int hr)
    { 
        // declare variable to hold greeting
        String greeting;
        
        // determine the greeting using if statement
        if (hr < 12)
        {
            greeting = "morning";
        } 
        else if (hr < 17)
        {
            greeting = "afternoon";
        }
        else 
        {
            greeting = "evening";
        }
        
        // return the greeting
        return greeting;
    }

} // end class
