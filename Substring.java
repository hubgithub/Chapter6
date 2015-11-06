import java.util.Scanner;

public class Substring
{
     public static void main(String []arg)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("in put a word");
        String word = scan.next();
        
        int y = word.length();
        int first = 0;
        int second = 1;
        int gap = 1;
        while(gap < word.length())
        {
            y--;
            int z = 0;
            while(second <= word.length())
            {
                System.out.println(word.substring(first,second));
                first++;
                second++;
                z++;
            }
            
            first = 0;
            second = first + gap;
            gap += 1;
            
        }
        
    }

}
