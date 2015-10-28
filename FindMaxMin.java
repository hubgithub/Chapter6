import java.util.Scanner;

public class FindMaxMin
{
    
    public static double finmax()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of any character to quit. ");
        
        double largest = scan.nextDouble();
        while( scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if(input > largest)
            {
                largest = input;
            }
            
        }
        return largest;
    }

}
