package Week6;


/**
 * Write a description of class sumofarray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sumofarray
{
    public static void main(String[] args)
    {
        int[] arr= {10,20,30,40,50};
        int sum=0;
        for(int i=0; i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println("Sum of ("+j+") index is: "+arr[j]);
        }
    }
}