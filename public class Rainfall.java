import java.util.Scanner;

java.util.Scanner;
public class Rainfall{
    static double[] monthlyRain=new double[12];

    public static void setRainfall(){
        Scanner keyboard=new Scanner(System.in);
        for (int i=0; i<12; i++){
            System.out.println("enter the amount of rainfall in month"+(i+1)+"month");
            monthlyRain[i]=keyboard.nextDouble();
        }


    }
    public static double totalRain(){
        double total= 0;
        for (int i=0; i<12; i++){
            total+=monthlyRain[i];
        }
        return total;
    }
    public static double averageRain(){
        return totalRain()/12;
    }
    public static double mostRain(){
        double mostRain=monthlyRain[0];
        int monthlyI=0;
        for(int i=1;i<12;i++){
            if((mostRain)<monthlyRain[i]){
                mostRain=monthlyRain[i];
                monthlyI=i;
            }
            
        }
        return monthlyI+1;
    }
    public static double leastRain(){
        double lowestRain=monthlyRain[0];

        int monthlyI=0;
        for(int i=1;i<12;i++){
            if((lowestRain)>monthlyRain[i]){
                lowestRain=monthlyRain[i];
                monthlyI=i
            }

        }
        return monthlyI+1;
    }


}
