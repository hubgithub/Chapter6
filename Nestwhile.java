
public class Nestwhile
{

    public static void main(String []arg)
    {
        int x = 0;
        int y = 0;
        while (x <2)
        {
            x++;
            while(y < 4)
            {
                y++;
                System.out.println(x + " " + y);
                
            }
            y = 0;
        }
    }

}
