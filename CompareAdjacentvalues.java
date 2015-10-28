import java.util.Scanner;

public class CompareAdjacentvalues
{

    public static void detectAdjacentduplicates()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers and a character to quit.");
    double input = scan.nextDouble();
        while(scan.hasNextDouble())
        {
            double previusInput = input;
            input = scan.nextDouble();
            
            if(previusInput == input)
            {
                System.out.println("Adjacent Douplicate Detected!");
                
                
            }
        }
    }

}
