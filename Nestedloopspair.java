
public class Nestedloopspair
{
    
    
    public static void main(String []arg)
    {
        int x =0;
        int y = 0;
        for( int i = 0; i < 2;i++)
        {
            x++;
            for ( int z = 0; z <4 ; z++)
            {
                y++;
                System.out.println(x + " " + y);
            }
            y = 0;
        }

    
    }
}
