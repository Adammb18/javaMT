// Import Scanner class
import java.util.Scanner;


public class RainfallClasss
{
 
    static double[] monthlyRainfall = new double[12];
  

    public static void setRainfall()
    {
        // Create an object of Scanner class
        Scanner scan = new Scanner(System.in);
      
        // Loop for each month
        for(int i = 0; i < 12; i++)
        {
            // Take the ith month rainfall
            System.out.print("Enter the rainfall of " + (i+1) + " month: ");
            monthlyRainfall[i] = scan.nextDouble();
        }
    }
  
    // Mehtod used to find the total rainfall of the year
    public static double totalRainfall()
    {
        // Used to store the total rainfall
        double total = 0;
      
        // Loop for each month
        for(int i = 0; i < 12; i++)
        {
            // Add ith month rainfall wiht total
            total += monthlyRainfall[i];
        }
      
        // return total
        return total;
    }
  
    // Mehtod used to find the average rainfall
    public static double avgRainfall()
    {
        // Return the average rainfall
        return totalRainfall()/12;
    }
  
    // Mehtod used to find the month of the most rainfall
    public static int monthMostRainfall()
    {
        // Set the first month rainfall as most rainfall
        double mostRainfall = monthlyRainfall[0];
      
        // Set month index to 0
        int monthIndex = 0;
      
        // Loop for each month
        for(int i = 1; i < 12; i++)
        {
            // If mostRainfall is less than ith month rainfall
            if(mostRainfall < monthlyRainfall[i])
            {
                // Set ith month rainfall
                mostRainfall = monthlyRainfall[i];
              
                // Set mlnth index
                monthIndex = i;
            }
        }
      
        // Return the month with most rainfall
        return monthIndex+1;
    }
  
    // Mehtod used to find the month of the least rainfall
    public static int monthLeastRainfall()
    {
        // Set the first month rainfall as least rainfall
        double leastRainfall = monthlyRainfall[0];
      
        // Set month index to 0
        int monthIndex = 0;
      
        // Loop for each month
        for(int i = 1; i < 12; i++)
        {
            // If mostRainfall is greater than ith month rainfall
            if(leastRainfall > monthlyRainfall[i])
            {
                // Set ith month rainfall
                leastRainfall = monthlyRainfall[i];
              
                // Set mlnth index
                monthIndex = i;
            }
        }
      
        // Return the month with least rainfall
        return monthIndex+1;
    }
}


