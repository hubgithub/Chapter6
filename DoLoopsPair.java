
public class DoLoopsPair
{
    
    public static void doloop()
    {
        int x = 1;
        int y = 1;
        do 
        {
            do 
            {
                System.out.println(x + " " + y);
                y++;
            }
            while (y <= 4);
            x++;
            y = 1;
        }
        while(x <= 2);
    }

}
