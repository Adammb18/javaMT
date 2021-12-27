import java.util.Scanner;
//Rainfall class created
public class Rainfall{
    static double [] monthlyrainfall = new double [12];
    static double totalrainfall = 0;
    static double averagerainfall = 0;
    static double mostrainfall;
    static double leastrainfall;
    static int count = 0;
//get monthly rain from user
    public static void rainfallamount(){
        //adding new scanner
        Scanner scan = new Scanner(System.in);

        //for loop to obtain user input for each month 
        for (int i=0;i<12;i++){
            //Asks the user for amount of rainfall
            System.out.println("Please enter the rainfall for month"+i+": ");
            monthlyrainfall[i] = scan.nextDouble(); 
            if (monthlyrainfall[i] < 0){
                monthlyrainfall[i] = 0;
            }
        }
    }

    //Method for getting total rain
    public static void totalrainfall(){
        //for loop for every month
        for(int i =0;i<12;i++){
            totalrainfall = totalrainfall + monthlyrainfall[i];
        }
        System.out.println("The total rainfall for this year is " + totalrainfall);
    }

    //Method for calculating avg rain
    public static void averagerainfall(){
        averagerainfall = totalrainfall/12;
        System.out.println("The average rainfall is "+averagerainfall);
    }

    //method to get month with most rain
    public static void mostrainfall(){
        mostrainfall = monthlyrainfall[1];
        //for loop to check every month
        for(int i = 0; i<12; i++){
            //if statment to compare months
            if(mostrainfall < monthlyrainfall[i]){
                mostrainfall = monthlyrainfall[i];
                count = i;
            }
        }
        count+=1;
        System.out.println("The month with the highest amount of rain is " + count + " with " + mostrainfall + " inches");
    }

        //method to get month with least rain
        public static void leastrainfall(){
            //Sets leastrainfall equal to first month
            leastrainfall = monthlyrainfall[0];
            count = 0;
            //for loop to check every month
            for(int i = 0; i<12; i++){
                //if statment to compare months
                if(leastrainfall > monthlyrainfall[i]){
                    //Sets lower month to leastrainfall
                    leastrainfall = monthlyrainfall[i];
                    //makes count equal to month number
                    count = i;
                }
            }
            count+=1;
            System.out.println("The month with the lowest amount of rain is " + count + " with " + leastrainfall + " inches");
        }
}