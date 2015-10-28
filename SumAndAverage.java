import java.util.Scanner;
public class SumAndAverage
{

    public static double averageOfValues()
    {
        Scanner  scan = new Scanner(System.in);
        double sum = 0;
        double num = 0;
        System.out.println("Enter a series of double or a character to quit.");
        while(scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            sum += input;
            num++;
        }
        
        double average = 0;
        if(num > 0)
        {
            average = sum/num;
        }
        return average;
    }

}
