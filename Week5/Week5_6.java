package Week5;


/**
 * Write a description of class Week5_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_6
{
    public static void main(String[] args)
    {
        int a=0, b=1;
        for(int i=1;i<=10;i++)
        {
            int c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}