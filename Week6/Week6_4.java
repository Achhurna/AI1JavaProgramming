package Week6;
import java.util.Scanner;


/**
 * Write a description of class Week6_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week6_4
{
    public static void main(String[] Roshan)
    {
        int sum=0;
        int[] num={10,20,30,40,50};
        for(int i=0;i<num.length; i++)
        {
            System.out.println("Values of ["+i+"] is: "+num[i]);
            sum=sum+num[i];
        }
        System.out.println("Sum of all values is: "+sum);
        System.out.println("Avg of all values is: "+(sum/num.length));
        int largest=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(largest<num[i])
                largest=num[i];
        }
        System.out.println(largest+" is greatest");
        for(int i=0;i<num.length;i++)
        {
            if(largest>num[i])
                largest=num[i];
        }
        System.out.println(largest+" is lowest");
        Scanner sc= new Scanner(System.in);
        System.out.println("Input size of array");
        int size= sc.nextInt();
        int sub[] = new int[size];
        for(int i=0; i<sub.length; i++)
        {
            System.out.println("Input marks of ["+i+"] subject is: ");
            sub[i]=sc.nextInt();
        }
        for(int i=0; i<sub.length; i++)
        {
            System.out.println("Marks of ["+i+"] subject is: "+sub[i]);
        }
    }
}