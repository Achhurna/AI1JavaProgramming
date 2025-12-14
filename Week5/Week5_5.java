package Week5;
import java.util.Scanner;


/**
 * Write a description of class Week5_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_5
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==2)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }
}