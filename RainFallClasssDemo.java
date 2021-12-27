// Create a class RainFallClassDemo
public class RainFallClasssDemo
{
    // Main method
    public static void main(String args[])
    {
        // Create an object of RainfallClass
        RainfallClasss ob = new RainfallClasss();
      
        // Call method to set rainfall of each month
        ob.setRainfall();
      
        // Print the total rainfall for the year
        System.out.println("\nThe total rainfall for the year: " + ob.totalRainfall());
      
        // Print the average monthly rainfall
        System.out.println("The average monthly rainfall: " + ob.avgRainfall());
      
        // Print the month with the most rain
        System.out.println("The month with the most rain: " + ob.monthMostRainfall());
      
        // Print the month with the least rain
        System.out.println("The month with the least rain: " + ob.monthLeastRainfall());
      
    }
}