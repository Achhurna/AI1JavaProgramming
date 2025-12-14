package Week5;


/**
 * Write a description of class Week5_10_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_10_2
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=5-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}