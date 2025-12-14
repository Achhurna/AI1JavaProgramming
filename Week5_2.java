package Week5;


/**
 * Write a description of class Week5_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_2
{
    public static void main(String[] args)
    {
        int sum1=0,sum2=0;
        for(int i=1; i<=10; i++)
        {
            if(i%2==0)
                sum1=sum1+i;
            else
                sum2=sum2+i;            
                
        }
        System.out.println("Sum of even num is: "+sum1);
        System.out.println("Sum of odd num is: "+sum2);
    }
}