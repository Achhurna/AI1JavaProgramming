package Week5;


/**
 * Write a description of class Week5_10_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_10_1
{
    public static void main(String[] a)
    {
         for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}