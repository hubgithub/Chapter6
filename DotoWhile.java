import java.util.Scanner;
public class DotoWhile
{

    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double x = 0;
        double s;
        
        s = 1.0/(1 + n * n);
        n++;
        
        x += s;
        while(s > 0.01)
        {
            s = 1.0/(1 + n * n);
            n++;
            x += s;
            
        }
        
    }

}
