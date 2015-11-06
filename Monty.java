import java.util.Random;
public class Monty
{

    public static void main(String []arg)
    {
        Random ran = new Random();
        int x;
        int y;
        int t = 0;
        for(int i = 0;
            i < 1000;
            i++)
            {
                x = ran.nextInt(3);
                y = ran.nextInt(3);
                
                if (x == y)
                {
                    t++;
                }
                
            }
        System.out.println("#1  :" + t);
        
        
        int choice;
        int u;
        int range;
        int c = 0;
        for (int a = 0;
             a < 1000;
             a++)
             {
                 u = ran.nextInt(3);
                 choice = ran.nextInt(3);
                 
                 range = choice - u;
                 
                 u += range;
                 
                 
                 if (u == choice && range != 0)
                 {
                     c ++;
                 }
              }
        System.out.println("#2  :" + c);
    }

}
